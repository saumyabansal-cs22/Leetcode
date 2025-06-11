class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> arr = new ArrayList<>(2);
        for(int i = 0;i<numCourses;i++){
            arr.add(new ArrayList<>());
        }
        // int ind = 0;
        for(int[] i: prerequisites){
            
            arr.get(i[1]).add(i[0]);

        }
        int[] in = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            for(int j:arr.get(i)){
                in[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            if(in[i] == 0){
                q.add(i);
            }
        }
        int cnt = 0;

        while(!q.isEmpty()){
            int ind = q.peek();
            cnt++;
            q.poll();

            for(int it:arr.get(ind)){
                in[it]--;
                if(in[it] == 0){
                    q.add(it);
                }
            }
        }
        if(cnt == numCourses){
            return true;
        }
        return false;
    }
}
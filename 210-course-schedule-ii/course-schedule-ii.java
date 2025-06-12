class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        List<Integer> topo= new ArrayList<>();

        while(!q.isEmpty()){
            int ind = q.poll();
            topo.add(ind);

            for(int it:arr.get(ind)){
                in[it]--;
                if(in[it] == 0){
                    q.add(it);
                }
            }
        }
        int[] arrt = topo.stream().mapToInt(i -> i).toArray();
        if (arrt.length==numCourses){
            return arrt;
        }
        return new int[0];

    
    }
}
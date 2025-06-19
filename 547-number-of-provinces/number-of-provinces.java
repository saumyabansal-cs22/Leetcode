class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> ll= new ArrayList<>();
        int n= isConnected.length;
        int m= isConnected[0].length;
        for(int i=0;i<n;i++){
            ll.add(new ArrayList<>());

        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if (isConnected[i][j]==1 && i!=j){
                    ll.get(i).add(j);
                }
            }
        }
        Queue<Integer> q= new LinkedList<>();
        HashSet<Integer> visited= new HashSet<>();
        int cnt=0;
        for(int src=0;src<n;src++){
            if (visited.contains(src)){
                continue;
            }
            q.add(src);
            cnt++;
            while(!q.isEmpty()){
                int r= q.remove();
                if (visited.contains(r)){
                    continue;
                }
                visited.add(r);
                // cnt++;
                //self work
                for(int nbrs:ll.get(r)){
                    if (!visited.contains(nbrs)){
                        q.add(nbrs);
                    }
                }
            }
        }
        
        return cnt;
    }
}
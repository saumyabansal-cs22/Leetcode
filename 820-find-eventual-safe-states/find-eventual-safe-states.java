class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> list= new ArrayList<>();
        int V= graph.length;
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
       for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                list.get(i).add(graph[i][j]);
            }
        }
        int vis[] = new int[V];
        int pathvis[]= new int[V];
        int check[]= new int[V];
        for(int i=0;i<V;i++){
            if (vis[i]==0){
                dfscheck(i,list,vis,pathvis,check);
            }
        }
        List<Integer> SafeNode= new ArrayList<>();
        for(int i=0;i<V;i++){
            if (check[i]==1){
                SafeNode.add(i);
            }
        }
        return SafeNode;
    }
    public boolean dfscheck(int node, List<List<Integer>> adj, int[] vis,int[] pathvis, int[] check){
        vis[node]=1;
        pathvis[node]=1;
        check[node]=0;
        for(int it:adj.get(node)){
            if (vis[it]==0){
                if ((dfscheck(it,adj,vis,pathvis,check)==true)){
                    return true;
                }
            }
            else if (pathvis[it]==1){
                return true;
            }
        }
        check[node]=1;
        pathvis[node]=0;
        return false;
    }
}
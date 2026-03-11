import java.util.LinkedList;
import java.util.Stack;
class Graph{
   int V; // vertices
   LinkedList<Integer> adj[]; // networks for each vertices
   Graph(int v){
       this.V=v;
       adj = new LinkedList[V];
       for(int i=0;i<V;i++){
           adj[i] = new LinkedList<>();
       }
   }
   void addEdge(int v,int w){
       adj[v].add(w);
   }
   void BFS(int s) {
       boolean visited[] = new boolean[V];
       // for BFS internally we use queue 
       LinkedList<Integer> queue = new LinkedList<>();
       visited[s]=true;
       queue.add(s);
       System.out.println("BFS");
       while(!queue.isEmpty()) {
           s= queue.poll();
           System.out.print(s+" ");
           for(int i=0; i<adj[s].size();i++) {
               if(!visited[adj[s].get(i)]) {
                   visited[adj[s].get(i)]= true;
                   queue.add(adj[s].get(i));
               }
           }
           System.out.println();
       }
   }
    void DFS(int s) {
       boolean visited[] = new boolean[V];
       // for DFS internally we use Stack 
       Stack<Integer> St = new Stack<>();
       visited[s]=true;
       St.add(s);
       System.out.println("DFS");
       while(!St.isEmpty()) {
           s= St.pop();
           System.out.print(s+" ");
           for(int i=adj[s].size()-1; i>=0;i--) {
               if(!visited[adj[s].get(i)]) {
                   visited[adj[s].get(i)]= true;
                   St.push(adj[s].get(i));
               }
           }
           System.out.println();
       }
   }
   void printGraph(){
       for(int i=0; i<V;i++){
           System.out.print(i+ "->");
           for(int j=0; j<adj[i].size();j++){
               System.out.print(adj[i].get(j)+" ");
           }
           System.out.println();
       }
   }
}
class Main {
    public static void main(String[] args) {
      Graph g = new Graph(4);
      g.addEdge(0,1);
      g.addEdge(0,2);
      g.addEdge(1,2);
      g.addEdge(2,3);
      g.printGraph();
      g.BFS(0);
      g.DFS(0);
    }
}

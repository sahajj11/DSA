import java.util.*;
//12!

public class Graphh {
    static class Edge{
        int src;
        int des;

        public Edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));



    }

    public static void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[V];

        q.add(0);

        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr + " ");
                vis[curr]=true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
        
                    q.add(e.des);
                }
            }
        }
    }


    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]=new ArrayList[V];
        createGraph(graph);

        //2's neighbours
        // for(int i=0;i<graph[2].size();i++){
        //     Edge e=graph[2].get(i);

        //     System.out.print(e.des +  " ");
        // }

        bfs(graph, V);



    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDFS {

    static class WeightedEdge{
        int src;
        int dst;
        int weight;

        public WeightedEdge(int src, int dst, int weight) {
            this.src = src;
            this.dst = dst;
            this.weight = weight;
        }
    }

    static void generateWeightedGraph(ArrayList<WeightedEdge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
//        graph[0].add(new WeightedEdge(0,2, 2));
//
//        graph[1].add(new WeightedEdge(1,2, 10));
//        graph[1].add(new WeightedEdge(1,3, 0));
//
//        graph[2].add(new WeightedEdge(2,0, 2));
//        graph[2].add(new WeightedEdge(2,1, 10));
//        graph[2].add(new WeightedEdge(2,3, -1));
//
//        graph[3].add(new WeightedEdge(3,1, 0));
//        graph[3].add(new WeightedEdge(3,2, -1));
        graph[0].add(new WeightedEdge(0,1, 2));
        graph[0].add(new WeightedEdge(0,2, 2));

        graph[1].add(new WeightedEdge(1,0, 10));
        graph[1].add(new WeightedEdge(1,3, 0));

        graph[2].add(new WeightedEdge(2,0, 2));
        graph[2].add(new WeightedEdge(2,4, 10));

        graph[3].add(new WeightedEdge(3,1, 0));
        graph[3].add(new WeightedEdge(3,4, -1));
        graph[3].add(new WeightedEdge(3,5, -1));

        graph[4].add(new WeightedEdge(4,2, 0));
        graph[4].add(new WeightedEdge(4,3, -1));
        graph[4].add(new WeightedEdge(4,5, -1));

        graph[5].add(new WeightedEdge(5,3, 0));
        graph[5].add(new WeightedEdge(5,4, -1));
        graph[5].add(new WeightedEdge(5,6, -1));

        graph[6].add(new WeightedEdge(6,5, 0));

    }

    static void dfs(ArrayList<WeightedEdge>[] weightedGraph, int cur, boolean visit[]){
        System.out.println(cur);
        visit[cur] = true;
        for(int i = 0; i<weightedGraph[cur].size(); i++){
            WeightedEdge edge = weightedGraph[cur].get(i);
            if(!visit[edge.dst]){
                dfs(weightedGraph, edge.dst, visit);
            }
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<WeightedEdge>[] weightedGraph = new ArrayList[v];
        GraphDFS.generateWeightedGraph(weightedGraph);
        boolean visit[] = new boolean[v];

        //for single
//        GraphDFS.dfs(weightedGraph, 0, visit);

        //for multiple
        for (int i = 0; i<v; i++){
            if(!visit[i]){
                GraphDFS.dfs(weightedGraph, i, visit);
            }
        }


    }
}

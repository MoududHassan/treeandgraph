import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class GraphMain {
    static class Edge{
        int src;
        int dst;

        public Edge(int src, int dst) {
            this.src = src;
            this.dst = dst;
        }
    }

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

    static void generateGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
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

    static void generateWeightedGraph(ArrayList<WeightedEdge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new WeightedEdge(0,2, 2));

        graph[1].add(new WeightedEdge(1,2, 10));
        graph[1].add(new WeightedEdge(1,3, 0));

        graph[2].add(new WeightedEdge(2,0, 2));
        graph[2].add(new WeightedEdge(2,1, 10));
        graph[2].add(new WeightedEdge(2,3, -1));

        graph[3].add(new WeightedEdge(3,1, 0));
        graph[3].add(new WeightedEdge(3,2, -1));

    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        GraphMain.generateGraph(graph);
        for(int i=0; i<graph[2].size(); i++){
            Edge edge = graph[2].get(i);
            System.out.println("dest: "+edge.dst);
        }

        ArrayList<WeightedEdge>[] weightedGraph = new ArrayList[v];
        GraphMain.generateWeightedGraph(weightedGraph);
        for(int i=0; i<weightedGraph[2].size(); i++){
            WeightedEdge weightedEdge = weightedGraph[2].get(i);
            System.out.println("dest: "+weightedEdge.dst+" weight: "+weightedEdge.weight);
        }
    }
}

import java.util.ArrayList;

public class Graph_Main {

    int V;
    int[][] graph;
    Graph_Main(int V){
        this.V = V;
        this.graph = new int[V][V];
    }

    public static void main(String[] args) {
        Graph_Main graph = new Graph_Main(6);
        graph.graph = new int[][]{
                {0, 0, 0, 1, 1, 0},
                {1, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0},
        };
        graph.dfs(0);
        graph.bfs(0);
    }

    public void dfs(int start){
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
        System.out.println();
    }

    public void dfsUtil(int start, boolean[] visited){
        visited[start] = true;
        System.out.print(start + " ");

        //exploring the adjucent nodes/vertices
        for (int i = 0; i < V; i++){
            if (!visited[i] && graph[start][i] == 1){
                dfsUtil(i, visited);
            }
        }
    }

    //BFS[arraylist acting as a queue]
    public void bfs(int start){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int curr;

        while(!q.isEmpty()){
            curr = q.get(0);
            System.out.print(curr + " ");
            q.remove(0);
            for (int i = 0; i < V; i++){
                if (graph[curr][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }
}

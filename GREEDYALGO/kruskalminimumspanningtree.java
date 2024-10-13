import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KruskalsMST {
    //Defines edge structure
    static class Egde {
        int src, dest, weight;

        public Edge (int src,int dest,int weight) 
        {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    //Define subset element structure
    static class Subset {
        int parent, rank;


        public Subset (int parent, int rank)
        {
            this.parent = parent;
            this.rank = rank;
        }
    }

    //starting point of program execution
    public static void main(String [] args)
    {
        int V = 4;
        List<Edge> grapghEdges = new ArrayList<Egde>(
            List.of(new Edge (0 , 1, 10), new Edge(0 , 2, 6),
                    new Edge (0, 3, 5), new Edge(1, 3, 15),
                    new Edge (2, 3, 4));

                    //sort 
        )
    }
}
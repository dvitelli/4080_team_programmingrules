import java.util.*; 
import java.lang.*; 
import java.io.*; 
  


public class dijkstras{
    public static void main(String args[])
    {

        int solution[];
        int graph [][] =  { { 0, 4, 5, 3, 0, 0, 0, 0, 0, 0}, 
                            { 4, 0, 7, 0, 6, 0, 0, 0, 0, 0 }, 
                            { 5, 7, 0, 1, 3, 4, 0, 0, 0, 0 }, 
                            { 3, 0, 1, 0, 0, 0, 2, 0, 0, 0 }, 
                            { 0, 6, 3, 0, 0, 9, 0, 0, 0, 8 }, 
                            { 0, 0, 4, 0, 9, 0, 4, 0, 0, 0 }, 
                            { 0, 0, 0, 2, 0, 5, 0, 3, 0, 0 }, 
                            { 0, 0, 0, 0, 0, 0, 3, 0, 5, 1 }, 
                            { 0, 0, 0, 0, 0, 0, 0, 5, 0, 0 },
                            { 0, 0, 0, 0, 8, 0, 0, 1, 0, 0 } };

        solution=dijkstra(graph, 0);



        print(solution);



    }
    public static int[] dijkstra(int graph[][],int source)
    {

        int distance[] = new int[graph.length];
        
        Boolean set[] = new Boolean[graph.length];

        for (int i = 0; i < distance.length;i++){
                distance[i] = Integer.MAX_VALUE;
                set[i] = false;

        }

        distance[source] = 0;

        for (int i = 0; i < distance.length - 1;i++){
            int num = min(distance,set);
            set[num] = true;

            for (int j = 0;j < distance.length;j++){
                if (!set[j] && graph[num][j] != 0 && distance[num] != Integer.MAX_VALUE && distance[num] + graph[num][j] < distance[j]) 
                distance[j] = distance[num] + graph[num][j]; 


            }
        }

        return distance;
    }
    public static int min(int distance[],Boolean set[])
    {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0;i<distance.length;i++)
        {
        if (set[i] == false && distance[i] <= min){
            min = distance[i];
            index = i;
        }
       
        }

        return index;
    }
    public static  void print(int distance[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        System.out.println("------ \t\t --------------------");
        for (int i = 0; i < distance.length; i++) 
            System.out.println(i + " \t\t " + distance[i]); 
    } 

}
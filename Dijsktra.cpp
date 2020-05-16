#include <limits.h> 
#include <bits/stdc++.h>
#include <stdlib.h> 
#include<time.h>
#include <stdio.h> 
#include <chrono> 

using namespace std; 
using namespace std::chrono;

#define V 10 
  
int min(int distance[], bool set[]) 
{ 
    int min = INT_MAX, min_index; 
  
    for (int i = 0; i < V; i++) 
        if (set[i] == false && distance[i] <= min) 
            min = distance[i], min_index = i; 
  
    return min_index; 
} 
  
void printSolution(int dist[]) 
{ 
    printf("Vertex \t\t Distance from Source\n");
    printf("------ \t\t --------------------\n");
    for (int i = 0; i < V; i++) 
        printf("%d \t\t %d\n", i, dist[i]); 
} 
  
void dijkstra(int graph[V][V], int source) 
{ 
    int distance[V];
  
    bool set[V];
    
    for (int i = 0; i < V; i++) 
        distance[i] = INT_MAX, set[i] = false; 
  
    distance[source] = 0; 
  
    for (int count = 0; count < V - 1; count++) { 
        
        int u = min(distance, set); 
  
        set[u] = true; 
  
        for (int i = 0; i < V; i++) 
  
            if (!set[i] && graph[u][i] && distance[u] != INT_MAX 
                && distance[u] + graph[u][i] < distance[i]) 
                distance[i] = distance[u] + graph[u][i]; 
    } 
  
    printSolution(distance); 
} 
  
int main() 
{ 
    int graph [V][V] =  { { 0, 4, 5, 3, 0, 0, 0, 0, 0, 0}, 
                        { 4, 0, 7, 0, 6, 0, 0, 0, 0, 0 }, 
                        { 5, 7, 0, 1, 3, 4, 0, 0, 0, 0 }, 
                        { 3, 0, 1, 0, 0, 0, 2, 0, 0, 0 }, 
                        { 0, 6, 3, 0, 0, 9, 0, 0, 0, 8 }, 
                        { 0, 0, 4, 0, 9, 0, 4, 0, 0, 0 }, 
                        { 0, 0, 0, 2, 0, 5, 0, 3, 0, 0 }, 
                        { 0, 0, 0, 0, 0, 0, 3, 0, 5, 1 }, 
                        { 0, 0, 0, 0, 0, 0, 0, 5, 0, 0 },
                        { 0, 0, 0, 0, 8, 0, 0, 1, 0, 0 } };
                        
    auto start = high_resolution_clock::now();                     
    dijkstra(graph, 0); 
    auto stop = high_resolution_clock::now(); 
    
    auto duration = duration_cast<nanoseconds>(stop - start); 
    cout << endl;
    cout << "Time taken: " << duration.count() << " ns" << endl;
  
    return 0; 
} 
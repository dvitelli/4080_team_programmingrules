import java.util.*;


public class BubbleSort{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of integers you would like to be produced at random then sorted");
        Random rand = new Random();
        int input = keyboard.nextInt();
        int arr [] = new int [input];

        for (int i = 0; i < input;i++)
            arr[i] = rand.nextInt(input);
        printArray(arr);
        long startTime = System.nanoTime();

        bubbleSort(arr);
        
        long endTime = System.nanoTime();

        printArray(arr);
        System.out.println("The programs runtime was: "+(endTime - startTime) + " ns."); 

        keyboard.close();

    }
    public static void bubbleSort(int arr[]){
        int temp = 0;
        for (int i = 0;i < arr.length-1;i++)
            {
                for (int j = 0; j < arr.length - 1;j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    
    public static void printArray(int arr[]){
        System.out.println("The array holds:");
        for (int i = 0;i < arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");    
    }
}
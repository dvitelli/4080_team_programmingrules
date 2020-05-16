import java.util.*;

public class Queue{
    public static void main(String args[])
    {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter the number of integers you would like to be produced in the Queue.");
            Random rand = new Random();
            int input = keyboard.nextInt();
            QueueArray queue = new QueueArray(input);
            for (int i = 0; i < input;i++)
                queue.enqueue(rand.nextInt(input));

            long startTime = System.nanoTime();
            int temp = rand.nextInt(input);

            for (int i = 0; i < temp;i++)
                System.out.println(queue.dequeue());
            System.out.println("Number of values dequeued: "+temp);
          long endTime = System.nanoTime();


          System.out.println("The programs runtime was: "+(endTime - startTime) + " ns."); 

         keyboard.close();

        
    }
    static class QueueArray{   
        int first,last,size,capacity;
        int arr[];

        public QueueArray(int input)
        {
            this.capacity = input;
            this.size = 0;
            this.first = 0;
            this.last = input - 1;
            arr = new int[input];
        }
        public void enqueue(int value){
            if (size == capacity)
                return;

            this.last = (this.last + 1)%this.capacity;
            arr[this.last] = value;
            this.size = this.size + 1;

        }
        public int dequeue(){
            if (size == 0)
                return 0;

            int temp = arr[this.first];
            this.first = (this.first + 1)%this.capacity;
            this.size = this.size - 1;
            return temp;
        }

    }
}
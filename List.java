import java.io.*;
import java.util.*;
public class List{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of integers you would like to be produced in the LinkedList.");
        Random rand = new Random();
        int input = keyboard.nextInt();
        LinkedList list = new LinkedList();


        long startTime = System.nanoTime();
        for (int i = 0; i < input;i++)
            list.newEntry(list,rand.nextInt(input));
        long endTime = System.nanoTime();


        System.out.println("The programs runtime was: "+(endTime - startTime) + " ns.");

        printList(list);
        keyboard.close();


    }
    public static void printList(LinkedList list)
    {
        Node node = list.head;



        while (node != null) {

            System.out.print(node.value + " ");

            node = node.next;
        }
    }

    public static class LinkedList{

        Node head;



        public LinkedList newEntry(LinkedList list, int value)
        {

            Node newNode = new Node(value);

            if (list.head == null)
            {
                list.head = newNode;
            }
            else{

                Node lastNode = list.head;
                while(lastNode.next != null){
                    lastNode = lastNode.next;
                }

                lastNode.next = newNode;


            }
            return list;


        }


    }
    static class Node{

        int value;
        Node next;

        Node(int val)
        {
            value = val;
            next = null;
        }

    }
}
//Juan Sanchez
//Assignment4
import java.io.*;
import java.util.*;

public class LinkedList {
  
      class Node {
      int value;
      Node next;
    
    Node(int val)
    {
      value = val;
      next = null;
    }
    
    }
  
  Node headoflist;
  Node last;
  public static void main(String[] args)  throws FileNotFoundException{ 
    
 LinkedList linkedlist = new LinkedList();
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter file name: ");
    String dataFile = userInput.next();
    File myFile = new File(dataFile);
    Scanner filescan = new Scanner(myFile);
    while(filescan.hasNextLine()){
      String chara = filescan.next();
      int num = filescan.nextInt();
    
      switch(chara){
        case "I": System.out.println("Option I has been chosen to initialize list");
                  if(linkedlist.headoflist != null)
                  System.out.println("List is initialized");
                  else 
                  System.out.println("List has been initialized.");
                  break;
          
        case "B": System.out.println("Option B has been chosen to add to the beginning of the list");
                  linkedlist.addFront(num); 
                  System.out.println(num + " Added to the front of the list.");
                  break;
          
        case "C": System.out.println("Option C has been chosen to add to the end of the list");
                  linkedlist.addBack(num);
                  System.out.println(num + " Added  to the back of the list.");
                  break;
        
        case "R": System.out.println("Option R has been chosen to remove from the front of the list");
                  linkedlist.removeFront();
                  System.out.println("Node with value 0 removed from the front of the list.");
                  break;
        
        case "S": System.out.println("Option S has been chosen to remove from the back of the list");
                  linkedlist.removeBack();
                  System.out.println("Node with value 0 removed from the back of the list.");
                  break;
                  
        case "T": System.out.println("Option T has been chosen to print out the entire list");
                  System.out.println("After traversing, the list contains:");
                  linkedlist.printlinklist();
                  break;
          
       case"X": System.out.println("Option X chosen to exit the program.");
          System.exit(0);
  }
    }
  }


public void addFront(int value){ // Add Node to the front of the list
  Node temp = new Node(value);
  temp.next = headoflist;
  headoflist = temp;
}

public void addBack(int value){   // Add Node to the back of the list
  Node temp = new Node(value);
  
  if(headoflist == null){
    headoflist = new Node(value);
    return;
  }
  temp.next = null;
  Node last = headoflist;
  
  while (last.next != null)
    last = last.next;
    last.next = temp;
    return;
  }


public void removeFront(){  // Remove Node from the front of the list
  Node temp;
  temp = headoflist;
  if (temp !=null){
  headoflist = temp.next;
  temp = null;
  }
  else
  System.out.println("This list is empty.");
}
  
  public void removeBack(){     // Remove Node from the back of the list
    if(headoflist != null){
    Node temp = headoflist;
    Node last = headoflist;
    
    while(last.next != null){
      temp = last;
      last = last.next;
   
    }
    temp.next=null;
    last = null;
    }else
      System.out.println("This list is empty.");
    
}
  
  public void printlinklist()  // Allows the linked list to be printed after traversing
  {
    Node first = headoflist;
    while(first != null)
    {
      System.out.print(first.value + " ");
        first = first.next;
    }
    System.out.println();
}
}
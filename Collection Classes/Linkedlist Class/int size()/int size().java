/**
  int size() : This method returns the number of elements in this list.
 */
 
import java.io.*; 
import java.util.*;
  
class LinkedListSize { 
    
   public static void main(String args[]) { 
       
       Scanner sc = new Scanner( System.in );
       
       //size of Linked List
       int n = sc.nextInt();
       
      // creating an empty LinkedList 
      LinkedList list = new LinkedList(); 
      
  
       //input n elemets in linked list 
       for(int i = 0 ; i < n ; i++ ){
           
           list.add( sc.next() );
           
       }
       
       // Displaying the LinkedList 
        System.out.println( "The LinkedList: " +  list ); 
  
        // Displaying size 
        System.out.println( "Size of LinkedList : " + list.size() ); 
   } 
} 

/**
Input:
3
Student Code In

Output:
The LinkedList: [Student, Code, In]
Size of LinkedList : 3
*/
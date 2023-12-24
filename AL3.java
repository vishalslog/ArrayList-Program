//Write a Java program to insert an element into the array list at the first position.
import java.util.ArrayList;
import java.util.Iterator;



public class AL3 {
   public static void main(String[] args) {
    ArrayList <String>al3=new ArrayList<>();
        al3.add("Red");
        al3.add("Blue");
        al3.add("Green");
        al3.add("White");
        al3.add("Violet");
        al3.add(0,"Pink");
        System.out.println(al3);
        
   } 
}

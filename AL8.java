// Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

public class AL8 {
    public static void main(String[] args) {
         ArrayList<String>al7=new ArrayList<>();
        al7.add("Red");
        al7.add("Blue");
        al7.add("Green");
        al7.add("White");
        al7.add("Violet");
        System.out.println("before sorting:");
        System.out.println(al7);
        System.out.println(" After Sorting");
        Collections.sort(al7);
         System.out.println(al7);
        
         
       


    }
}

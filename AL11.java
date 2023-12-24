//Write a Java program to reverse elements in an array list.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class AL11 {
    public static void main(String[] args) {
        ArrayList<String>al11=new ArrayList<>();
        al11.add("Red");
        al11.add("Blue");
        al11.add("Green");
        al11.add("White");
        al11.add("Violet");
        System.out.println("Before reverse the value is:");
        System.out.println(al11);
        Collections.reverse(al11);
        System.out.println("After reverse the value is: ");
        System.out.println(al11);
    }
}

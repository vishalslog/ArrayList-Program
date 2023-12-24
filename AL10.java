//Write a Java program to shuffle elements in an array list.
import java.util.ArrayList;
import java.util.Collections;

public class AL10 {
    public static void main(String[] args) {
        ArrayList<String>al10=new ArrayList<>();
        al10.add("Red");
        al10.add("Blue");
        al10.add("Green");
        al10.add("White");
        al10.add("Violet");
        System.out.println("Before  shuffle the value is:");
        System.out.println(al10);
        Collections.shuffle(al10);
        System.out.println("After shuffle the value is:");
        System.out.println(al10);
    }
    
}

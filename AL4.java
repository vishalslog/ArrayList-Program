//Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;

public class AL4 {
    public static void main(String[] args) {
        ArrayList<String>al4=new ArrayList<>();
        al4.add("Red");
        al4.add("Blue");
        al4.add("Green");
        al4.add("White");
        al4.add("Violet");
        System.out.println(al4.size());
        System.out.println("The first Color is: "+al4.get(0));
        System.out.println("the forth color is:"+al4.get(4));
    }
    
}

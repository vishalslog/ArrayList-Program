// Write a Java program to increase an array list size.
import java.util.ArrayList;

public class AL20 {
    public static void main(String[] args) {
        ArrayList<String>al20=new ArrayList<>();
        al20.add("Red");
        al20.add("Blue");
        al20.add("Green");
        al20.add("White");
        al20.add("Violet");
        System.out.println("before increasing:---"+al20);
        al20.ensureCapacity(7);
        al20.add("yellow");
        al20.add("brown");
        System.out.println("after increasing "+al20);

    }
}

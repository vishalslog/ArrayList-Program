//Write a Java program to iterate through all elements in an array list.
import java.util.ArrayList;
import java.util.Iterator;

public class AL2 {
    public static void main(String[] args) {
        ArrayList al2=new ArrayList<>();
        al2.add("Red");
        al2.add("Blue");
        al2.add("Green");
        al2.add("White");
        al2.add("Violet");
        Iterator itr=al2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        System.out.println(al2);
    }
    
}

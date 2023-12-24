//Write a Java program to print all the elements of an ArrayList using the elements' position.
import java.util.ArrayList;
import java.util.Iterator;

public class AL22 {
    public static void main(String[] args) {
        ArrayList<String>al22=new ArrayList<>();
        al22.add("Red");
        al22.add("Blue");
        al22.add("Green");
        al22.add("White");
        al22.add("Violet");
        System.out.println("before printing position:--"+al22);
        System.out.println("the value is printing using position:--");
        Iterator<String>itr=al22.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        
    }
    
}

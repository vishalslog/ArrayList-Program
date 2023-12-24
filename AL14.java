//Write a Java program that swaps two elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class AL14 {
    public static void main(String[] args) {
        ArrayList<String>al11=new ArrayList<>();
        al11.add("Red");
        al11.add("Blue");
        al11.add("Green");
        al11.add("White");
        al11.add("Violet");

        System.out.println("before swaping:------");
        // for(String i:al11){
        //     System.out.println(i);

        // }
        Iterator <String>itr=al11.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
     
        Collections.swap(al11, 0, 2);
        System.out.println("after swaping:----");
        Iterator <String>itr1=al11.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


        
    }
}

package cashregister;

import java.util.ArrayList;
import java.util.Iterator;

public class Printer {
 public void billPrint(ArrayList<String> bill){

     Iterator<String> itr = bill.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
 }

}

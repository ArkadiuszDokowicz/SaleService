package cashregister;

import java.util.ArrayList;
import java.util.HashMap;
import product.Product;

public class CashRegister {

    private Printer printer = new Printer();
    private LCD displayer = new LCD();
    private Scanner scanner = new Scanner();
    private HashMap<Integer,Product> products;

    public CashRegister(HashMap<Integer,Product> products){
    this.products=products;
    }



    public void  goWork(){
        Boolean working = true;
        String messageFromScanner=null;


        while(working){
            displayer.display("Scan barcode or type exit/EXIT:");
            messageFromScanner=scanner.getbarcode();
            if(messageFromScanner.isEmpty()){
                displayer.display("Invalid bar-code");
            }
            else{
                if(messageFromScanner.equals("EXIT")||messageFromScanner.equals("exit")){
                    working=false;

                    printer.billPrint(Bill.getInstance().billToString());
                    displayer.display(Bill.getInstance().totalSumToString());
                }
                else{
                    boolean numeric = true;
                    numeric = messageFromScanner.matches("-?\\d+(\\.\\d+)?"); //it checks if bar-code is numeric or not

                    if(numeric){
                        Integer key=Integer.valueOf(messageFromScanner);
                        if(products.containsKey(key)){
                            Product p1=products.get(key);
                            displayer.display(p1.getName()+" "+p1.getPrice()+" $");
                            Bill.getInstance().addProductToBill(p1);
                        }
                        else{
                            displayer.display("Product not found");
                        }
                    }
                    else{displayer.display("Product not found");}
                }
            }
        }
    }
}

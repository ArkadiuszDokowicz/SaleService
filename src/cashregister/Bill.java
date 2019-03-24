package cashregister;

import product.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class Bill {
    private String currency=" $";
    private float totalsum =0;
    private ArrayList<Product> bill= new ArrayList<>();

    private volatile int productAmount=0;

    public static Bill instance= new Bill();


    private Bill(){};

    public String totalSumToString(){
        String s= ""+getTotalsum()+getCurrency();
        return s;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(float totalsum) {
        this.totalsum = totalsum;
    }

    private void totalSumAdd(float price){
        this.totalsum+=price;
    }

    public static Bill getInstance() {
        return instance;
    }

    public void  addProductToBill(Product p){
    this.bill.add(p);
    productAmount+=1;
    }

    public ArrayList<String> billToString(){

        ArrayList<String> StringToReturn = new ArrayList<>();
        Iterator<Product> objectIterator=this.bill.iterator();

        while(objectIterator.hasNext()){
            String toPush = null;
            Product iteratedProduct= objectIterator.next();
            toPush=iteratedProduct.getName()+" "+iteratedProduct.getPrice()+this.currency;
            totalSumAdd(iteratedProduct.getPrice());
            StringToReturn.add(toPush);
        }
        StringToReturn.add("Total Price "+this.totalsum+this.currency);
    return StringToReturn;
    }
}


import product.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class DataBase {
//this is singleton class it protects against db obj. multiplying
    public  static DataBase instance = new DataBase();
    private HashMap<Integer,Product> hashproducts = new HashMap<Integer, Product>(); //thanks to this the complexity equals 1 ;)
    private Statement statement = null;
    private DataBase(){
    };



    public static DataBase getInstance() {
        return instance;
    }

    private Statement setStatement(Connection connection){
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
        return statement;
        }

    }

    public HashMap<Integer,Product> getHashproducts() {
        return hashproducts;
    }

    public void mysqlDbDownload(Connection connection){
        setStatement(connection);

        String sqlQuery= "SELECT * FROM products";
        ResultSet resultSet= null;
        try {
            resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()) {
                //this way you can see what is downloading from db
                /*System.out.println(resultSet.getInt(1) + "\t" +
                        resultSet.getString(2) + "\t" +
                        resultSet.getFloat(3) + "\t" +
                        resultSet.getInt(4));
            */
                //it save data from db into object, and then into
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                Float price=resultSet.getFloat(3);
                int barcode=resultSet.getInt(4);
                hashproducts.put(barcode,new Product(id,name,price,barcode));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void textDbDownload() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/products.txt"));
        String line =br.readLine();
        ArrayList<String> linesFromTextAsStrings=new ArrayList<>();
        while(line !=null){
            //System.out.println(line);
            linesFromTextAsStrings.add(line);
            line = br.readLine();
        }
        Iterator<String> iterator=linesFromTextAsStrings.iterator();
        //it pushes products to hashmap by iteration of arraylist with readed lines
        while(iterator.hasNext()){
            String stringToSplit=iterator.next();
            String[] partsFromSplitedString= stringToSplit.split(",");
            int id=Integer.valueOf(partsFromSplitedString[0]);
            String name=partsFromSplitedString[1];
            float price =Float.valueOf(partsFromSplitedString[2]);
            int barcode=Integer.valueOf(partsFromSplitedString[3]);
            hashproducts.put(barcode,new Product(id,name,price,barcode));
        }

        br.close();

    }
}

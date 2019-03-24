import cashregister.CashRegister;
/*
//mysql-comment
import com.util.ConnectionConfig;
import java.sql.Connection;
import java.sql.SQLException;
//end of mysql-comment
        //it is unreachable without mysql-connector-java-5.1.47

*/
import java.io.IOException;

public class Main {

    public static  void main(String[] args) {
        //mysql-comment
        /*
        Connection connection = null;
        try {
            connection = ConnectionConfig.getConnection();
            if(connection != null){
                System.out.println("Connection established!");
                // use the method below to download database from mysql db
                //DataBase.getInstance().mysqlDbDownload(connection);
            }
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            //all of connections should be disconnected
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        */ //end of mysql-comment
        //it is unreachable without mysql-connector-java-5.1.47

        //
        try {

            // use the method below to download database from text file
            DataBase.getInstance().textDbDownload();
        } catch (IOException e) {
            e.printStackTrace();
        }

        CashRegister cashregister=new CashRegister(DataBase.getInstance().getHashproducts());
        cashregister.goWork();
    }

}


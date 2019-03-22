import com.util.ConnectionConfig;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            connection = ConnectionConfig.getConnection();
            if(connection != null){
                System.out.println("Connection established!");
            }
        }
        catch(Exception e){e.printStackTrace();}
        finally{
            //all the connection should be disconnected
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


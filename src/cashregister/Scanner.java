package cashregister;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Scanner {
    public Scanner() {
    }
    public String getbarcode(){
        String input=null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            return input;
        }
    }

}

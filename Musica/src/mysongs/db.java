
package mysongs;

import java.sql.Connection;
import java.sql.DriverManager;


public class db {
    
 public static Connection mycon(){
 
     try {
         
         Class.forName("com.mysql.jdbc.Driver");
         Connection c = DriverManager.getConnection("jdbc:mysql://"
                 + "localhost:3306/mysongs","root","");
         
         return c ;
         
     } catch (Exception e) {
     }
     return null;
 }
    
}

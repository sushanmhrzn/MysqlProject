
package bus.view;
import java.util.*;
import java.sql.SQLException;
import bus.control.RouteControl;
import bus.DBConnection;
import java.sql.Connection;
import java.sql.Statement;
public class Display {
      public void route() throws SQLException {
       RouteControl routerepo=new RouteControl();
       System.out.println("Route_id\tSource\tDestination\tDepature_date\tDepature_time\tPrice");
       routerepo.view();
    }

    public static void main(String args[]) throws SQLException{
       // RouterRepo e=new RouterRepo();
       Display e=new Display();
        Scanner i=new Scanner(System.in);
        System.out.print("MENU\n 1)Route\n2)Insert");
        int a=i.nextInt();
        switch(a){
            case 1:
               e.route();
             break;
                case 2:
               e.Insert();
             break;
        default:
        System.out.print("enter from 1");
  
    }
    public void Insert()throws Exception{
          Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("Insert Into route (Source+DestinationPrice)" + "Values('Hetauda'+'Pokhara'+'1000')");
        DBConnection.closeConnection();
        }   
    }
}

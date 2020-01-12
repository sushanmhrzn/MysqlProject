
package bus.repo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import bus.DBConnection;
import bus.model.Route;
public class RouteRepo {
     public List<Route> getRoute() throws SQLException {

        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from route");
        List<Route> route = new ArrayList<>();

        while (resultSet.next()) {
           //Route ro=new Route(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4),resultSet.getInt(5),resultSet.getInt(6));
          
//Route.add(ro);
        }
        DBConnection.closeConnection();
        return route;
    }
      public void view() throws SQLException{
    
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from route");
        //List<Route> route = new ArrayList<>();

        while (resultSet.next()) {
           System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5)+"\t"+resultSet.getString(6));
          
        }
        DBConnection.closeConnection();
}
}

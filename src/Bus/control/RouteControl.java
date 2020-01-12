/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.control;
import bus.ToInsertIn;
import bus.repo.RouteRepo;
import java.sql.SQLException;
public class RouteControl {
   public void view() throws SQLException{
   RouteRepo route=new RouteRepo();
   route.view();
   }
  public void Insert() throws SQLException{
   ToInsertIn t=new ToInsertIn();
   t.insert();
   }
   
}

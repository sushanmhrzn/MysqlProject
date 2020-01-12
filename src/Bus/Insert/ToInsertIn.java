/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import bus.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author user
 */
public class ToInsertIn {
    public  void insert()throws Exception{
         Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("Insert Into Route (Source+DestinationPrice)" +"Values('Hetauda'+'Pokhara'+'1000')");
        DBConnection.closeConnection();
}
    }


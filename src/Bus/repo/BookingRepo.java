/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus.repo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busmanagsys.repo;

import busmanagsys.DBConnection;
import busmanagsys.model.Booking;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.*;
import java.sql.Statement;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.R;

public class BookingRepo extends RouteRepo {

    public String DepDate;
    public String date;
    public int routeid;
    public String time;
    public String DepTime;
    public int seat;
    public int ticketid = 200;
    public int bus_id;
    public int route_id;
    public int amount;
    public int count;
    public int route;
    public int Booking_id;
    public String passenger_Firstname;
    public String passenger_lastname;
    public String passenger_phonenumber;
    public int ticket;
    public int busid;
    public String reachtime;
    public int changeseat;
    public int ticket1;
    public String status;
    String phone;
    public int route1;
    public String source;
    public int z;
    public String destination;
    public String busname;
    public int busid1;
    public int updateticket;
public int updatebusseat;
public int i;
public int updateseat;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void view() throws SQLException {
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();

        //List<Route> route = new ArrayList<>();
//        while (resultSet.next()) {
//           //System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6));
//          Date=resultSet.getString(4);
//          time=resultSet.getString(5);
//          Price=resultSet.getString(6);
//       //  Data(Date);  
//        }
        RouteRepo r = new RouteRepo();
        String date = d;
        //Connection connection = DBConnection.getConnection();
        // Statement statement = connection.createStatement()
        String query = "select * from booking";
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
//           DepDate = rs.getString(1);
//               DepTime = rs.getString(2);
//               ticketid= rs.getInt(3);
//               bus_id=rs.getInt(4);
//               route_id=rs.getInt(5);
//               amount=rs.getInt(6);
//               passenger_id=rs.getInt(7);
//               passenger_Firstname=rs.getString(8); 
//                passenger_lastname=rs.getString(9);
//                passenger_phonenumber=rs.getString(10);
            System.out.print("DepatureDate--DepatureTime--ReachTime--Ticketid--Busid--Routeid--Amount--Name--PhoneNumber");
            System.out.print(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getInt(4) + "\t" + rs.getInt(5) + "\t" + rs.getInt(6) + "\t" + rs.getInt(7) + "\t" + rs.getString(9) + "\t" + rs.getString(10) + "\n");
            //   System.out.print(Date);

        }
        //   DBConnection.closeConnection();
    }

//    public void addData() throws SQLException, ClassNotFoundException {
//        Connection connection = DBConnection.getConnection();
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("select * from route");
//        System.out.println("Route Id\tSource\t\t\tDestination\tDepature Date\t\tDepature Time\t\tPrice");
//        while (resultSet.next()) {
//
//            System.out.println(resultSet.getInt(1)+ "\t\t" + resultSet.getString(2) + "\t\t" + resultSet.getString(3)+ "\t\t" + resultSet.getString(4)+ "\t\t" + resultSet.getString(5)+ "\t\t" + resultSet.getString(6));
//           // routeid = resultSet.getInt(1);
////          Date=resultSet.getString(4);
////          time=resultSet.getString(5);
////          Price=resultSet.getString(6);
//
//        }
//
//        Booking b = new Booking();
//        Scanner e = new Scanner(System.in);
//        System.out.println("Please choose you Route");
//        routeid = e.nextInt();
////select b.busid,r.routeid
////    -> from bus as b inner join route as r on b.routeid=r.routeid;
////          ResultSet st= statement.executeQuery("select * from ticket where ticketid=200");
////           while (st.next()) {
////            routeid1=st.getInt(2);
////     //      System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6));
////     if(routeid1==route) {   
////     ticketid=st.getInt(1);
////          //time=s.getString(5);
//        // Price=s.getString(7);
//        //}  // ResultSet st= statement.executeQuery("select * from ticket where ticketid=200");
////ResultSet st= statement.executeQuery("select * from booking");           
////while (st.next()) {
////     ticketid=st.getInt(3);
////     if(ticketid==ticketid){
////     ticketid++;
////     System.out.print(ticketid);
////     }    
//
//        //}
//           ResultSet t=statement.executeQuery("select Busname,Busnumberplate,availableseat,busid from bus where routeid="+routeid);
//            System.out.println("\tThe avaiable bus Information For you route are");
//            System.out.println("Bus Name\t"+"Number Plate\t"+"Seat Available\t"+"Bus id");
//             while(t.next())
//             {
//                 System.out.println(t.getString(1)+"\t"+t.getString(2)+"\t\t"+t.getInt(3)+"\t\t"+t.getInt(4));
//                 
//             }
//         System.out.print("Do you want to book the ticket???(y/n)");
//        char a= e.next().charAt(0);
//       if (a == 'y') {
//           
//          
//           
////         ResultSet se = statement.executeQuery("select b.busid,r.routeid\n"
////                + "    from bus as b inner join route as r on b.routeid=r.routeid where r.routeid=" + route);
////      while (se.next()) {
////          busid = se.getInt(1);
////          System.out.println("Your Bus id is " +busid);
////          
////       } 
//        
//        System.out.print("Enter the bus id you want to Book:");
//        busid=e.nextInt();
//         
//         String sql="update bus set availableseat='"+(seat-1)+"' where busid="+busid;
//        statement.executeUpdate(sql);
//        ResultSet sw = statement.executeQuery("select ticketid,Status from ticket where busid=" + busid);
//        System.out.println("Tickets Available"+"\tBooking status");
//        while (sw.next()) {
//
//                System.out.println(sw.getInt(1)+"\t"+sw.getString(2));
//
//        }   
//       System.out.print("Enter the ticket you want");
//       ticket=e.nextInt();
//        String sq="update ticket set Status='"+"BOOKED"+"' where ticketid="+ticket;
//        statement.executeUpdate(sq);
//        ResultSet s = statement.executeQuery("select * from route where routeid=" + routeid);
//        while (s.next()) {
//
//            //      System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6));
//            Date = s.getString(4);
//            time = s.getString(5);
//            Price = s.getString(6);
//    //        reachtime = s.getString(6);
//
//        }
//        System.out.print("Enter Your Full Name");
//        String fname, returnFirstName;
//        fname = e.next();
//        b.setPassenger_Firstname(fname);
//        returnFirstName = b.getPassenger_Firstname();
//
//        System.out.print("Enter your Phone Number");
//        phone = e.next();
//            String query = ("insert into booking(DepDate,DepTime,ticketid,busid,routeid,amount,Name,phonenumber) "
//                    + "VALUES ('" + Date + "','" + time + "'," + ticket + "," + busid + "," + routeid + "," + Price + ",'" + returnFirstName + "','" + phone + "')");
//            int count = statement.executeUpdate(query);
//            System.out.println(count + " rows affected...");
//            ResultSet seats=statement.executeQuery("select availableseat from bus where busid="+busid);
//             while(seats.next())
//             {
//               seat=seats.getInt(1); 
//             }
//            statement.close();
//            DBConnection.closeConnection();
//        } else {
//            System.out.print("Thank you");
//            System.exit(0);
//        }
//    }
    public void addData() throws SQLException, ClassNotFoundException {
        Booking b = new Booking();
       Scanner e = new Scanner(System.in);
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from route");
        System.out.println("Route Id\tSource\t\t\tDestination\tDepature Date\t\tDepature Time\t\tPrice");
        while (resultSet.next()) {

            System.out.println(resultSet.getInt(1)+ "\t\t" + resultSet.getString(2) + "\t\t" + resultSet.getString(3)+ "\t\t" + resultSet.getString(4)+ "\t\t" + resultSet.getString(5)+ "\t\t" + resultSet.getString(6));
           // routeid = resultSet.getInt(1);
//          Date=resultSet.getString(4);
//          time=resultSet.getString(5);
//          Price=resultSet.getString(6);

        }
        char m;
        System.out.print("If there are available route and want to book then enter(y/n)");
        m=e.next().charAt(0);
        if(m=='y'){
       System.out.println("Please choose you Route");
   routeid= e.nextInt();
 ResultSet ree=statement.executeQuery("select routeid from route");
   while (ree.next()) {
       int i=0;
       i++;
 
     if(routeid==ree.getInt(i)){
      z=1;
     
         }
   }
         
 //  Booking b = new Booking();
 //      Scanner e = new Scanner(System.in);
 //   System.out.println("Please choose you Route");
 //   routeid = e.nextInt();
//     if(routeid!=ree)
//   Booking b = new Booking();
//      Scanner e = new Scanner(System.in);
//   do{
//       System.out.println("Please choose you Route");
//     routeid = e.nextInt();
//       
//        if(routeid!=route){
//       System.out.println("please enter the above routeid correctly");
//        //System.out.println("Please choose you Route");
//       // routeid = e.nextInt();
//       }
//        if(routeid==route){
//            break;
//       }while(routeid!=route);
//  // }
   //System.out.print(route);
//        Booking b = new Booking();
//        Scanner e = new Scanner(System.in);
//       do{
//        System.out.println("Please choose you Route");
//        routeid = e.nextInt();
//       
//        if(routeid!=route){
//        System.out.println("please enter the above routeid correctly");
//        //System.out.println("Please choose you Route");
//       // routeid = e.nextInt();
//        }
//        if(routeid==route){
//            break;
//        }
//       }while(routeid!=route);
//select b.busid,r.routeid
//    -> from bus as b inner join route as r on b.routeid=r.routeid;
//          ResultSet st= statement.executeQuery("select * from ticket where ticketid=200");
//           while (st.next()) {
//            routeid1=st.getInt(2);
//     //      System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6));
//     if(routeid1==route) {   
//     ticketid=st.getInt(1);
//          //time=s.getString(5);
        // Price=s.getString(7);
        //}  // ResultSet st= statement.executeQuery("select * from ticket where ticketid=200");
//ResultSet st= statement.executeQuery("select * from booking");           
//while (st.next()) {
//     ticketid=st.getInt(3);
//     if(ticketid==ticketid){
//     ticketid++;
//     System.out.print(ticketid);
//     }    

        //}
        if(z==1){
           ResultSet t=statement.executeQuery("select Busname,Busnumberplate,availableseat,busid from bus where routeid="+routeid);
            System.out.println("\tThe avaiable bus Information For you route are");
            System.out.println("Bus Name\t"+"Number Plate\t"+"Seat Available\t"+"Bus id");
             while(t.next())
             {
                 System.out.println(t.getString(1)+"\t"+t.getString(2)+"\t\t"+t.getInt(3)+"\t\t"+t.getInt(4));
                 
             }
             
         System.out.print("Do you want to book the ticket???(y/n)");
        char a= e.next().charAt(0);
        
       if (a == 'y') {
           System.out.print("Enter the bus id you want to Book:");
        busid=e.nextInt();
        ResultSet ta=statement.executeQuery("select availableseat from bus where busid="+busid);
        while(ta.next())
             {
                seat= ta.getInt(1);
          }
       if(seat!=0 && seat<=10){
       
      ResultSet sw = statement.executeQuery("select ticketid,Status from ticket where busid=" + busid);
       System.out.println("Tickets Available\tBooking status");
      while (sw.next()) {
               System.out.println(sw.getInt(1)+"\t\t\t"+sw.getString(2));
       }   
        
        ResultSet st = statement.executeQuery("select ticketid,status from ticket  where busid=" + busid);
        
           while (st.next()) {
               ticket1=st.getInt(1);
           status=st.getString(2);
           }
         //  int j=1;
             do{
           //for(i=1;i<=ticket1;i++){
          
          System.out.print("Enter the ticket you want");
       ticket=e.nextInt();
           ResultSet sm = statement.executeQuery("select ticketid from booking    where busid=" + busid);
          
           while (sm.next()) {
            int i=0;
            i++;
            
       if(ticket==sm.getInt(i)){
           ticket1=sm.getInt(i);
         System.out.println("This ticket has already been booked");
         //  System.out.print("Enter the ticket you want");
     //ticket=e.nextInt();
   
         }
//     else{
// break;
//}
      // break;
       }
          // break;
         
          //  j++;
             }while(ticket1==ticket);
          // break;
         
          
        ResultSet s = statement.executeQuery("select * from route where routeid=" + routeid);
        while (s.next()) {

            //      System.out.println(resultSet.getInt(1)+"\t\t"+resultSet.getString(2)+"\t\t"+resultSet.getString(3)+"\t\t"+resultSet.getString(4)+"\t\t"+resultSet.getString(5)+"\t\t"+resultSet.getString(6));
            Date = s.getString(4);
            time = s.getString(5);
            Price = s.getString(6);


        }
            ResultSet stt = statement.executeQuery("select count(*) from booking");
        while (stt.next()) {
            count=stt.getInt(1);
           
            count=count+1;
        }  
       
        System.out.println("Your Booking id is: "+count+" And Please Remeber it if you want to update and search");
        System.out.print("Enter Your Full Name");
        String fname, returnFirstName;
        fname= e.next();
        b.setPassenger_Firstname(fname);
        returnFirstName = b.getPassenger_Firstname();
        System.out.print("Enter your Phone Number");
        phone = e.next();
          int length = phone.length();
        if(length!=10){
            System.out.println("please enter your correct phone number");
        System.out.print("Enter your Phone Number");
        phone = e.next();
        }
             //else{
            String query = ("insert into booking(DepDate,DepTime,ticketid,busid,routeid,amount,Name,phonenumber) "
                    + "VALUES ('" + Date + "','" + time + "'," + ticket + "," + busid + "," + routeid + "," + Price + ",'" + returnFirstName + "','" + phone + "')");
            int count = statement.executeUpdate(query);
            System.out.println("BOOKING CONFIRM");
         
        String sq="update ticket set Status='"+"BOOKED"+"' where ticketid="+ticket;
        statement.executeUpdate(sq);
            ResultSet seats=statement.executeQuery("select availableseat from bus where busid="+busid);
        while(seats.next())
             {
              changeseat=seats.getInt(1); 
             }
         
        String sql="update bus set availableseat='"+(changeseat-1)+"' where busid="+busid;
         statement.executeUpdate(sql);
       // }

               }
        else{
            System.out.println("No Seats avaiable please choose another bus");
        }

       }
        else{
            System.out.print("Please enter y or n");
            System.exit(0);
        }
     statement.close();
        DBConnection.closeConnection();
        
        
   
        }
        else{
            System.out.print("You choose the worng route");
        }
        }else{
            System.out.println("Sorry We Couldn't Have Enough route You Wanted");
                }
    }
    public void search() throws SQLException {
        int pasid;
        Scanner e = new Scanner(System.in);
        System.out.print("enter your Booking id");
        pasid = e.nextInt();
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select routeid,busid from booking where Bookingid=" + pasid + " ");
        //System.out.println("DepatureDate--DepatureTime--ReachTime--Ticketid--Busid--routeid--amount\tpassngerid\tName\t--PhoneNumber");
        while (resultSet.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
        route1=resultSet.getInt(1);
           busid1=resultSet.getInt(2);
        }
        ResultSet re=statement.executeQuery("select source,destination from route where routeid="+route1);
   while (re.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
        source=re.getString(1);
        destination=re.getString(2);
        }
    ResultSet res=statement.executeQuery("select busname from bus where busid="+busid1);
   while (res.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
       busname=res.getString(1);
        }
   ResultSet ri = statement.executeQuery("select DepDate,DepTime,Ticketid,amount,Name,phonenumber from booking where Bookingid=" + pasid + " ");
     System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
   System.out.println("| DepatureDate\t| DepatureTime\t| Ticketid\t| Busname\t| Source\t| Destination\t|  Amount\t|  Name\t\t|  PhoneNumber\t|");
   while (ri.next()) {
        
        System.out.println("| "+ ri.getString(1) + "\t|  " + ri.getString(2) + "\t|    " + ri.getInt(3) + "\t\t| "+busname+"\t|  "+source+"\t|   "+destination+"\t|   "+ ri.getInt(4) + "\t\t|   " + ri.getString(5)+"\t|   "+ri.getString(6)+"\t|"); //+ "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
      }
      System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
             
    }
  
    public void phonesearch() throws SQLException{
 String pasid;
        Scanner e = new Scanner(System.in);
        System.out.print("enter your PhoneNumber");
        pasid = e.nextLine();
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select routeid,busid from booking where phonenumber=" + pasid + " ");
        //System.out.println("DepatureDate--DepatureTime--ReachTime--Ticketid--Busid--routeid--amount\tpassngerid\tName\t--PhoneNumber");
        while (resultSet.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
        route1=resultSet.getInt(1);
           busid1=resultSet.getInt(2);
        }
        ResultSet re=statement.executeQuery("select source,destination from route where routeid="+route1);
   while (re.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
        source=re.getString(1);
        destination=re.getString(2);
        }
    ResultSet res=statement.executeQuery("select busname from bus where busid="+busid1);
   while (res.next()) {
//            System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
       busname=res.getString(1);
        }
   ResultSet ri = statement.executeQuery("select DepDate,DepTime,Ticketid,amount,Name,phonenumber from booking where phonenumber=" + pasid + " ");
        System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
   System.out.println("| DepatureDate\t| DepatureTime\t| Ticketid\t| Busname\t| Source\t| Destination\t|  Amount\t|  Name\t\t|  PhoneNumber\t|");
   while (ri.next()) {
        
        System.out.println("| "+ ri.getString(1) + "\t|  " + ri.getString(2) + "\t|    " + ri.getInt(3) + "\t\t| "+busname+"\t|  "+source+"\t|   "+destination+"\t|   "+ ri.getInt(4) + "\t\t|   " + ri.getString(5)+"\t|   "+ri.getString(6)+"\t|"); //+ "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9)+"\t"+resultSet.getString(10));
      }
      System.out.println("+-----------------------------------------------------------------------------------------------------------------------------------------------+");
             
}
     public void update() throws Exception{
	Connection connection=DBConnection.getConnection();
	Statement statement=connection.createStatement();
	Scanner e=new Scanner(System.in);
	System.out.print("enter your Bookingid");
        int passengerid=e.nextInt();
        String name;
        System.out.print("enter new name");
        name=e.next();
        String sql=""+"update booking set name='"+name+"' where bookingid="+passengerid;
        statement.executeUpdate(sql);
        System.out.println("database update sucessfully");
        searcha(passengerid);
        
     }
     public void updatephone() throws Exception{
	Connection connection=DBConnection.getConnection();
	Statement statement=connection.createStatement();
	Scanner e=new Scanner(System.in);
	System.out.print("enter your bookingid");
        int passengerid=e.nextInt();
        String phone;
        System.out.print("enter new phone number");
        phone=e.next();
        String sql=""+"update booking set phonenumber='"+phone+"' where bookingid="+passengerid;
        statement.executeUpdate(sql);
        System.out.println("database update sucessfully");
        searcha(passengerid);
        
     }
  public void searcha(int a) throws SQLException {
        int pasid;
        Scanner e = new Scanner(System.in);
        Connection connection = DBConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select bookingid,name,phonenumber from booking where bookingid=" + a + " ");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|   passngerid\t\t|       Name\t\t|     PhoneNumber    |");
        while (resultSet.next()) {
            System.out.println("|\t"+resultSet.getInt(1) + "\t\t|\t" + resultSet.getString(2) + "\t\t|\t" + resultSet.getString(3)+"   |");//"\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9));
        }
           System.out.println("+--------------------------------------------------------------------+");
}
  public void updateboth() throws SQLException{
  Connection connection=DBConnection.getConnection();
	Statement statement=connection.createStatement();
	Scanner e=new Scanner(System.in);
	System.out.print("enter your Bookingid");
        int passenger=e.nextInt();
        String name;
        String phone;
         System.out.print("enter new name");
        name=e.next();
        String sql1=""+"update booking set name='"+name+"' where bookingid="+passenger;
        statement.executeUpdate(sql1);
        System.out.print("enter new phone number");
        phone=e.next();
        String sql=""+"update booking set phonenumber='"+phone+"' where bookingid="+passenger;
        statement.executeUpdate(sql);
         System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|   passngerid\t\t|       Name\t\t|     PhoneNumber    |");
        ResultSet resultSet = statement.executeQuery("select passengerid,name,phonenumber from booking where passengerid=" + passenger + " ");
        while (resultSet.next()) {
            System.out.println("|\t"+resultSet.getInt(1) + "\t\t|\t" + resultSet.getString(2) + "\t\t|\t" + resultSet.getString(3)+"   |");//"\t" + resultSet.getInt(4) + "\t" + resultSet.getInt(5) + "\t" + resultSet.getInt(6)+ "\t" + resultSet.getInt(7) + "\t" + resultSet.getString(8) + "\t" + resultSet.getString(9));
        }
           System.out.println("+--------------------------------------------------------------------+");
       
  }
 public void delete()throws SQLException{
      Scanner e=new Scanner(System.in);
     Connection connection = DBConnection.getConnection();
    Statement statement = connection.createStatement();
    System.out.println("Enter your Phone number");
    String phonenumber;
    phonenumber=e.next();
   
     ResultSet ss = statement.executeQuery("select Busid,ticketid from booking where Phonenumber="+phonenumber );
    while (ss.next()) {
        updatebusseat=ss.getInt(1);
        
        updateticket=ss.getInt(2);
    }
  
     ResultSet r = statement.executeQuery("select availableseat from bus where busid="+updatebusseat);
    while (r.next()) {
        updateseat=r.getInt(1);
      
    }
      updateseat++;
    statement.executeUpdate("Update ticket Set status='NOT BOOKED' where ticketid="+updateticket);
    statement.executeUpdate("Update bus Set availableseat=availableseat +1 where busid="+updatebusseat);
    statement.executeUpdate("Delete from booking where Phonenumber="+phonenumber); 
 }
 public void deletebypassengerid()throws SQLException{
      Scanner e=new Scanner(System.in);
     Connection connection = DBConnection.getConnection();
    Statement statement = connection.createStatement();
    System.out.println("Enter your Passengerid");
    int passenger;
    passenger=e.nextInt();
   
     ResultSet ss = statement.executeQuery("select Busid,ticketid from booking where bookingid="+passenger );
    while (ss.next()) {
        updatebusseat=ss.getInt(1);
        
        updateticket=ss.getInt(2);
    }
  
     ResultSet r = statement.executeQuery("select availableseat from bus where busid="+updatebusseat);
    while (r.next()) {
        updateseat=r.getInt(1);
      
    }
      updateseat++;
    statement.executeUpdate("Update ticket Set status='NOT BOOKED' where ticketid="+updateticket);
    statement.executeUpdate("Update bus Set availableseat=availableseat +1 where busid="+updatebusseat);
    statement.executeUpdate("Delete from booking where passengerid="+passenger); 
 }
}


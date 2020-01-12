/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busmanagsys.model;

/**
 *
 * @author Ujjanjoshi
 */
public class Bus {
  private  int bus_id;
  private  int ticket_id;
 private   int route_id;
 private   int bookingstatus_id;

    public Bus(int bus_id, int ticket_id, int route_id, int bookingstatus_id) {
        this.bus_id = bus_id;
        this.ticket_id = ticket_id;
        this.route_id = route_id;
        this.bookingstatus_id = bookingstatus_id;
    }

    public int getBus_id() {
        return bus_id;
    }

    public void setBus_id(int bus_id) {
        this.bus_id = bus_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public int getBookingstatus_id() {
        return bookingstatus_id;
    }

    public void setBookingstatus_id(int bookingstatus_id) {
        this.bookingstatus_id = bookingstatus_id;
    }
      
}

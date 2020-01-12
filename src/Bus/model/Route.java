
package bus.model;
public class Route {
   private int route_id;
   private String source;
   private String destination;
   private String depature_date;
   private String depature_time;
   private String amount;

    public Route(int route_id, String source, String destination, String depature_date,String depature_time,String amount) {
        this.route_id = route_id;
        this.source = source;
        this.destination = destination;
        this.depature_date = depature_date;
        this.depature_time = depature_time;
        this.amount = amount;
    }

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int route_id) {
        this.route_id = route_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepature_date() {
        return depature_date;
    }

    public void setDepature_date(String depature_date) {
        this.depature_date = depature_date;
    }

    public String getDepature_time() {
        return depature_time;
    }

    public void setDepature_time(String depature_time) {
        this.depature_time = depature_time;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
   
}

    


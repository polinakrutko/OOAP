import java.util.LinkedList;
import java.util.List;

public class StopTaxi {
    private String name;
    private List<Passenger> qPassengers;
    private List<Passenger> reversQPassengers;
    private int count;

    public StopTaxi(String name, Taxi taxi){
        qPassengers = new LinkedList<>();
        this.name = name;
        count = taxi.count;
        reversQPassengers = new LinkedList<>();
    }

    public boolean NotEmpty(){
        return !qPassengers.isEmpty();
    }

    public void addPassenger(Passenger passenger){
        qPassengers.add(passenger);
        count++;
    }

    public Passenger getPassenger(){
        return qPassengers.get(0);
    }

    public void LeftPassenger(Passenger passenger){
        System.out.println("Пассажир " + qPassengers.get(0) + " покинул остановку " + this.toString());
        qPassengers.remove(passenger);
    }

    public void toReverseQueue(Passenger passenger){
        qPassengers.remove(passenger);
        reversQPassengers.add(passenger);
    }

    public void swap(){
        if (reversQPassengers.size() > 0) {
            qPassengers = new LinkedList<>(reversQPassengers);
            reversQPassengers.clear();
        }
    }

    public String toString(){
        return name;
    }


}

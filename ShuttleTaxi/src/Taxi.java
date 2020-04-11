import java.util.LinkedList;
import java.util.List;

public class Taxi {
    private List<Passenger> passengers;
    private List<StopTaxi> stop;
    private List<StopTaxi> reverseStop;
    private int capacity;
    public int count;

    public Taxi(int capacity){
        this.capacity = capacity;
        passengers = new LinkedList<>();
        stop = new LinkedList<>();
        reverseStop = new LinkedList<>();
        count = 0;
    }

    public void createStop(StopTaxi busStop){
        stop.add(busStop);
    }

    private void disembarking(StopTaxi stop){
        Passenger passenger;
        this.stop.remove(stop);
        ((LinkedList<StopTaxi>)(reverseStop)).addFirst(stop);
        for (int i = passengers.size() - 1; i >= 0; --i) {
            passenger = passengers.get(i);
            if (passenger.getTarget() == stop) {
                passenger.arrivedPassenger();
                passengers.remove(i);
                count--;
            }
        }
    }

    private void landing(StopTaxi stop){
        Passenger passenger;
        while (stop.NotEmpty() && passengers.size() < capacity) {
            passenger = stop.getPassenger();
            if (this.stop.contains(stop)){
                stop.LeftPassenger(passenger);
                passengers.add(passenger);
            } else {
                stop.toReverseQueue(passenger);
            }
        }
        stop.swap();
    }

    public void move(){
        StopTaxi current;
        while (!stop.isEmpty()){
            current = stop.get(0);
            disembarking(current);
            landing(current);
        }
        stop = new LinkedList<>(reverseStop);
        reverseStop.clear();
    }
}

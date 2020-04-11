public class Passenger {
    private String name;
    private StopTaxi target;

    public Passenger(String name, StopTaxi target) {
        this.name = name;
        this.target = target;
    }

    public StopTaxi getTarget(){
        return target;
    }

    public void arrivedPassenger(){
        System.out.println("Пассажир " + this + " прибыл на остановку " + this.getTarget());
    }

}

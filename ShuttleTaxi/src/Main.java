public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(4);

        StopTaxi grad = new StopTaxi("ТРЦ Град", taxi);
        StopTaxi hospital = new StopTaxi("Областная больница", taxi);
        StopTaxi busStation = new StopTaxi("Центральный Автовокзал", taxi);
        StopTaxi koltsovskySquare = new StopTaxi("Кольцовский сквер", taxi);
        StopTaxi university = new StopTaxi("ВГУ", taxi);

        taxi.createStop(grad);
        taxi.createStop(hospital);
        taxi.createStop(busStation);
        taxi.createStop(koltsovskySquare);
        taxi.createStop(university);

        Passenger passenger1 = new Passenger("Андрей", koltsovskySquare);
        Passenger passenger2 = new Passenger("Миша", grad);
        Passenger passenger3 = new Passenger("Алина", busStation);
        Passenger passenger4 = new Passenger("Петя", grad);
        Passenger passenger5 = new Passenger("Коля", university);
        Passenger passenger6 = new Passenger("Миша", hospital);
        Passenger passenger7 = new Passenger("Алина", busStation);
        Passenger passenger8 = new Passenger("Петя", university);


        grad.addPassenger(passenger1);
        grad.addPassenger(passenger8);
        hospital.addPassenger(passenger5);
        busStation.addPassenger(passenger2);
        koltsovskySquare.addPassenger(passenger3);
        koltsovskySquare.addPassenger(passenger4);
        university.addPassenger(passenger6);
        university.addPassenger(passenger7);

        while (taxi.count != 0) {
            taxi.move();
        }

    }
}

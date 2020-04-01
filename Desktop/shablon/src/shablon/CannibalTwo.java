package shablon;

public class CannibalTwo extends Action {
    // узнаем условие: будний/выходной
    Week day;
    public CannibalTwo(Week day){
        this.day = day;
    }
    //переопределение метода варки для 1 людоеда
    @Override
    protected void boil() {
        if (this.day == Week.WEEKDAY)
            System.out.println("Жарит");
        else System.out.println("Варит");
    }
    //метод для общения 2 людоеда, так как он сначала всегда разговаривает
    public void chat(){
        System.out.println("Болтает");
    }
}

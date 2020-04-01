package shablon;
/* Шаблонный метод
Есть 2 типа людоедов
Действуют
1 ловит жертву, варит, есть, ложится спать
2 тип ловит, беседует, варит если будний, жарит если выходной, ест, ложится спать
Написать классы
Методы отличаются разговорами
Общий: поймать, поесть, поспать */

public class Main {
    public static void main(String[] args){
        System.out.println("Действия 1 людоеда:");
        Action cannibalOne = new CannibalOne();
        cannibalOne.go();
        System.out.println();
        System.out.println("Действия 2 людоеда:");
        Action cannibalTwo = new CannibalTwo(Week.DAYOFF); //здесь передаем информацию какой день недели
        cannibalTwo.go();
        System.out.println();
    }
}

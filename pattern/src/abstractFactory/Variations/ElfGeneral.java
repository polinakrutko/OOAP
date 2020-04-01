package abstractFactory.Variations;

import abstractFactory.General;

public class ElfGeneral implements General {

    @Override
    public void getDescription(int countG) {
        if (countG > 0) {
            System.out.println("Количество генералов в армии эльфов: " + countG);
        }
        else {
            System.out.println("У армии эльфов нет генералов");
        }
    }
}

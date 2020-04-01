package abstractFactory.Variations;

import abstractFactory.General;

public class OrcGeneral implements General {

    @Override
    public void getDescription(int countG) {
        if (countG > 0) {
            System.out.println("Количество генералов в армии орков: " + countG);
        }
        else {
            System.out.println("У армии орков нет генералов");
        }
    }
}

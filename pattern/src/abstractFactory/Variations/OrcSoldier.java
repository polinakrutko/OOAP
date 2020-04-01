package abstractFactory.Variations;

import abstractFactory.Soldier;

public class OrcSoldier implements Soldier {

    @Override
    public void getDescription(int count, int countG) {
        if (countG > 0) {
            int countS = count;
            int countSinG = countS/countG;
            int countSinGLast = count - countSinG*countG + countSinG;
            for (int i = 0; i < countG - 1; i++) {
                System.out.println("Количество рядовых в армии орков у " + (i + 1) + " генерала: " + countSinG);
            }
            System.out.println("Количество рядовых в армии орков у " + countG + " генерала: " + countSinGLast);
        }
        else  {
            if (count > 0) {
                System.out.println("Количество рядовых в армии орков: ");
            }
            else {
                System.out.println("В армии орков нет рядовых");
            }
        }
    }
}

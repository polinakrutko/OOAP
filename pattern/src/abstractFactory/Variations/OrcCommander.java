package abstractFactory.Variations;

import abstractFactory.Commander;

public class OrcCommander implements Commander {

    @Override
    public void getDescription(boolean check) {
        if (check) {
            System.out.println("У армии орков есть главнокомандующий");
        }
        else {
            System.out.println("У армии орков нет главнокомандующего");
        }
    }
}

package abstractFactory.Variations;


import abstractFactory.Commander;

public class ElfCommander implements Commander {


    @Override
    public void getDescription(boolean check) {
        if (check) {
            System.out.println("У армии эльфов есть главнокомандующий");
        }
        else {
            System.out.println("У армии эльфов нет главнокомандующего");
        }
    }
}

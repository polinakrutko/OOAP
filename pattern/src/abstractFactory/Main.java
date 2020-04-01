package abstractFactory;

import abstractFactory.ElfArmy;
import abstractFactory.OrcArmy;

public class Main {
    public static void main(String[] args){
        System.out.println("ИНФОРМАЦИЯ О СОСТАВЕ ВОЙСК\n");

        Army elf = new ElfArmy();
        boolean commandElf = true;
        int countGElf = 2;
        int countSElf = 36;

        Commander commanderElf = elf.createCommander();
        General generalElf = elf.createGeneral();
        Soldier soldierElf = elf.createSoldier();

        System.out.println("Армия эльфов");
        commanderElf.getDescription(commandElf);
        generalElf.getDescription(countGElf);
        soldierElf.getDescription(countSElf, countGElf);
        System.out.println("");

        Army orc = new OrcArmy();
        boolean commandOrc = false;
        int countGOrc = 1;
        int countSOrc = 15;

        Commander commanderOrc = orc.createCommander();
        General generalOrc = orc.createGeneral();
        Soldier soldierOrc = orc.createSoldier();

        System.out.println("Армия орков");
        commanderElf.getDescription(commandOrc);
        generalElf.getDescription(countGOrc);
        soldierElf.getDescription(countSOrc, countGOrc);
        System.out.println("");

    }
}
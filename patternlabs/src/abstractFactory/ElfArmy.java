package abstractFactory;

import abstractFactory.Variations.ElfGeneral;
import abstractFactory.Variations.ElfSoldier;
import abstractFactory.Variations.ElfCommander;

import java.util.LinkedList;
import java.util.List;

public class ElfArmy implements Army {


    @Override
    public Soldier createSoldier() {
        return new ElfSoldier();
    }

    @Override
    public Commander createCommander() { return new ElfCommander(); }

    @Override
    public General createGeneral() {
        return new ElfGeneral();
    }

}

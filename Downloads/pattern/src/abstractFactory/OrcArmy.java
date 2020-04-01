package abstractFactory;

import abstractFactory.Variations.OrcCommander;
import abstractFactory.Variations.OrcGeneral;
import abstractFactory.Variations.OrcSoldier;

public class OrcArmy implements Army{
    @Override
    public Soldier createSoldier() {
        return new OrcSoldier();
    }

    @Override
    public Commander createCommander() { return new OrcCommander(); }

    @Override
    public General createGeneral() {
        return new OrcGeneral();
    }
}

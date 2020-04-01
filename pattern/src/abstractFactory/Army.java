package abstractFactory;


public interface Army {
    Commander createCommander();
    General createGeneral();
    Soldier createSoldier();
}

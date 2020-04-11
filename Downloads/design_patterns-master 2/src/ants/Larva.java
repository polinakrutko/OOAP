package ants;

public class Lichinka extends Creature {

    public Lichinka(int food){
        numberOfEatenFood = food;
    }

    @Override
    public void eat() {
        numberOfAllFood -= numberOfEatenFood;
    }

    public void becomeAnt(Matka matka, AntsType type){
        matka.createAnt(type);
    }
}

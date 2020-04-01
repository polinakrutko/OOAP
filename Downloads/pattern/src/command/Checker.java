package command;

public class Checker {
    private int x;
    private int y;

    public Checker() {
        x = 1;
        y = 1;

    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void goRightUp(){
        y++;
        x++;
        System.out.println("Шашка ходит вправо вверх на " + x + ", " + y );
    }

    public void goLeftUp(){
        y++;
        x--;
        System.out.println("Шашка ходит влево вверх на " + x + ", " + y );
    }

    public void goRightDown(){
        y--;
        x++;
        System.out.println("Шашка ходит вправо вниз на " + x + ", " + y );
    }

    public void goLeftDown(){
        y--;
        x--;
        System.out.println("Шашка ходит влево вниз на " + x + ", " + y );
    }

    public void killRightUp(){
        x += 2;
        y += 2;
        System.out.println("Шашка бьёт вправо вверх на " + x + ", " + y);
    }

    public void killLeftUp(){
        x -= 2;
        y += 2;
        System.out.println("Шашка бьёт влево вверх на " + x + ", " + y);
    }

    public void killRightDown(){
        x += 2;
        y -= 2;
        System.out.println("Шашка бьёт вправо вниз на " + x + ", " + y);
    }

    public void killLeftDown(){
        x -= 2;
        y -= 2;
        System.out.println("Шашка бьёт влево вниз на " + x + ", " + y);
    }
}

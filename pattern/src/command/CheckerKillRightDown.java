package command;

public class CheckerKillRightDown implements Command{

    private final Checker checker;

    public CheckerKillRightDown(Checker checker) {
        this.checker = checker;
    }

    @Override
    public void execute() {
        checker.killRightDown();
    }

    @Override
    public void undo() {
        int x = checker.getX();
        int y = checker.getY();
        if (x > 0 && y < 8){
            x -= 2;
            y += 2;
            checker.setXY(x, y);
        }
        System.out.println("Отмена хода бить вправо вниз. Вернулась на " + x + ", " + y);
    }
}

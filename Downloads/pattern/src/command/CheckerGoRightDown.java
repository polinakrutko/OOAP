package command;

public class CheckerGoRightDown implements Command {

    private final Checker checker;

    public CheckerGoRightDown(Checker checker) {
        this.checker = checker;
    }

    @Override
    public void execute() {
        checker.goRightDown();
    }

    @Override
    public void undo() {
        int x = checker.getX();
        int y = checker.getY();
        if (x > 0 && y < 8) {
            checker.setXY(--x, ++y);
        }
        System.out.println("Отмена хода вправо вниз. Вернулась на " + x + ", " + y);
    }
}

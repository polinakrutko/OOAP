package command;

public class CheckerGoRightUp implements Command {
    private final Checker checker;

    public CheckerGoRightUp(Checker checker) {
        this.checker = checker;
    }

    @Override
    public void execute() {
        checker.goRightUp();
    }

    @Override
    public void undo() {
        int x = checker.getX();
        int y = checker.getY();
        if (x > 0 && y < 8){
            checker.setXY(--x, --y);
        }
        System.out.println("Отмена хода вправо вверх. Вернулась на " + x + ", " + y);
    }

}

package command;

public class CheckerGoLeftDown implements Command {
    private final Checker checker;

    public CheckerGoLeftDown(Checker checker) {
        this.checker = checker;
    }

    @Override
    public void execute() {
        checker.goLeftDown();
    }

    @Override
    public void undo() {
        int x = checker.getX();
        int y = checker.getY();
        if (x > 0 && y < 8){
            checker.setXY(++x, ++y);
        }
        System.out.println("Отмена хода влево вниз. Вернулась на " + x + ", " + y);
    }
}

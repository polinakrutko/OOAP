package command;

public class CheckerGoLeftUp implements Command {

    private final Checker checker;

    public CheckerGoLeftUp(Checker checker) {
        this.checker = checker;
    }

    @Override
    public void execute() {
        checker.goLeftUp();
    }

    @Override
    public void undo() {
        int x = checker.getX();
        int y = checker.getY();
        if (x > 0 && y < 8){
            checker.setXY(++x, --y);
        }
        System.out.println("Отмена хода влево вверх. Вернулась на " + x + ", " + y);
    }
}

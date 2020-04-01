package command;

public class Main {

    public static void main(String[] args) {
        Checker checker = new Checker();

        Command goRU = new CheckerGoRightUp(checker);
        Command goRD = new CheckerGoRightDown(checker);
        Command goLU = new CheckerGoLeftUp(checker);
        Command goLD = new CheckerGoRightDown(checker);
        Command killRU = new CheckerKillRightUp(checker);
        Command killRD = new CheckerKillRightDown(checker);
        Command killLU = new CheckerGoLeftUp(checker);
        Command killLD = new CheckerGoRightDown(checker);

        Action action = new Action();
        action.register("goRU", goRU);
        action.register("goRD", goRD);
        action.register("goLU", goLU);
        action.register("goLD", goLD);
        action.register("killRU", killRU);
        action.register("killRD", killRD);
        action.register("killLU", killLU);
        action.register("killLD", killLD);

        action.execute("goRU");
        action.execute("goLU");
        action.undo();
        action.redo();
        action.execute("killRU");
    }
}

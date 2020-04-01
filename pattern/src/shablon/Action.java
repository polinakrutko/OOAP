package shablon;

public abstract class Action {
    final void go(){
        catchUp();
        chat();
        eat();
        sleep();
    }
    // методы для одинаковых действий
    protected void catchUp(){
        System.out.println("Ловит");
    }

    protected void eat(){
        System.out.println("Ест");
    }

    protected void sleep(){
        System.out.println("Спит");
    }


    //метод, который использует только 2 людоед
    protected void chat(){}

    // метод для отличающихся действий
    protected abstract void boil();
}

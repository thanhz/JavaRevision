package DesignPatterns.Behavioral;

public interface State {
    public void doAction(Context context);
}

class OpenState implements State {

    public void doAction(Context context) {
        System.out.println("Door is in open state");
        context.setState(this);
    }

    public String toString(){
        return "Open State";
    }
}

class ClosedState implements State {

    public void doAction(Context context) {
        System.out.println("Door is in closed state");
        context.setState(this);
    }

    public String toString(){
        return "Closed State";
    }
}

class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}

class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        OpenState openState = new OpenState();
        openState.doAction(context);

        System.out.println(context.getState().toString());

        ClosedState stopState = new ClosedState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}



import java.util.ArrayList;

public class State {

    private String name;
    private ArrayList<Transition> transitions;


    public State() {
        this.transitions = new ArrayList<>();
    }

    public State(String name) {
        this.transitions = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", transitions=" + transitions +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }

    public void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }
    public void addTransition(Transition t){
        transitions.add(t);
    }
}

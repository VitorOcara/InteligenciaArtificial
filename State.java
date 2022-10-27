package Atividade02;

import java.util.ArrayList;

public class State {

    private String name;
    private ArrayList<Transition> transitions;



    public State(String name, ArrayList<Transition> transitions) {
        this.name = name;
        this.transitions = transitions;
    }

    public State() {
    }

    public State(String name) {
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
        transitions = new ArrayList<>();
        transitions.add(t);
    }
}

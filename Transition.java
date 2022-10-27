package Atividade02;

public class Transition {

    private State destinity;
    private int coast;


    public Transition(State destinity, int coast) {
        this.destinity = destinity;
        this.coast = coast;
    }

    public State getDestinity() {
        return destinity;
    }

    public void setDestinity(State destinity) {
        this.destinity = destinity;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public String toString() {
        return "Transition{" +
                "destinity=" + destinity +
                ", coast=" + coast +
                '}';
    }
}

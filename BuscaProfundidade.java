package Atividade02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BuscaProfundidade {
    private Stack<Node> borda;
    private Stack<State> visitados;

    public BuscaProfundidade() {
        this.borda = new Stack<Node>();
        this.visitados = new Stack<State>();
    }

    public Node busca(Node origin, State target) {
        if (origin.getState() != target) {
            ArrayList<State> path = new ArrayList<>();

            // ArrayList<State> path = new ArrayList<>();
            borda.push(origin);

            do {
                Node no = borda.pop();
                visitados.add(no.getState());

                if (!path.contains(no.getState())) {
                    path.add(no.getState());
                }

                for (Transition t : no.getState().getTransitions()) {

                    if (!visitados.contains(t.getDestinity())) {

                        Node filho = new Node(t.getCoast() + no.getCusto(), t.getDestinity(), no);

                        if (!path.contains(filho.getState()))
                            path.add(filho.getState());

                        if (!borda.contains(filho) || !visitados.contains(filho.getState())) {
                            if (filho.getState().equals(target)) {
                                for (State s : path) {
                                    System.out.println(s.getName());
                                }
                                System.out.println("O custo foi de: " + filho.getCusto());
                                return filho;
                            }
                            borda.add(filho);
                        }
                    }
                }

            } while (!borda.isEmpty());

        }

        return null;
    }

}

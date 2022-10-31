
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BuscaLargura {
    private Queue<Node> borda;
    private Stack<State> visitados;

    public BuscaLargura() {
        this.borda = new LinkedList<Node>();
        this.visitados = new Stack<State>();
    }

    public Node busca(Node origin, State destinity) {
        if (origin.getState() != destinity) {

            borda.add(origin);
            do {
                Node raiz = borda.remove();
                visitados.add(raiz.getState());

                for (Transition transition : raiz.getState().getTransitions()) {

                    Node filho = new Node(transition.getCoast() + raiz.getCusto(), transition.getDestinity(), raiz);

                    if (!borda.contains(filho) || !visitados.contains(filho.getState())) {

                        if (filho.getState().equals(destinity)) {

                            Node n = filho;
                            while (n!=origin) {
                                System.out.println(n.getState().getName());
                                n = n.getPai();
                            }
                            System.out.println("Custo total = " + filho.getCusto());
                            return filho;
                        }
                        borda.add(filho);
                    }

                }

            } while (!borda.isEmpty());
        }

        return null;
    }

}

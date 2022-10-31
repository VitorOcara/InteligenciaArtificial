import java.util.ArrayList;
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

            // ArrayList<State> path = new ArrayList<>();
            borda.push(origin);

            do {
                Node no = borda.pop();
                visitados.add(no.getState());

                for (Transition t : no.getState().getTransitions()) {

                    if (!visitados.contains(t.getDestinity())) {

                        Node filho = new Node(t.getCoast() + no.getCusto(), t.getDestinity(), no);

                        if (!borda.contains(filho) || !visitados.contains(filho.getState())) {
                            if (filho.getState().equals(target)) {

                                
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
                }

            } while (!borda.isEmpty());

        }

        return null;
    }

}

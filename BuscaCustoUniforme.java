import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BuscaCustoUniforme {
    private PriorityQueue<Node> borda;
    private Stack<State> visitados;

    public BuscaCustoUniforme() {
        this.borda = new PriorityQueue<Node>();
        this.visitados = new Stack<State>();
    }

    public Node busca(Node origin, State target) {
        borda.add(origin);
        ArrayList<State> path = new ArrayList<>();
        do {

            Node raiz = borda.remove();
            if(!path.contains(raiz.getState())){
                path.add(raiz.getState()); 
            }
            if (raiz.getState().equals(target)) {
                
                Node n = raiz;
                while (n!=origin) {
                    System.out.println(n.getState().getName());
                    n = n.getPai();
                }
                System.out.println("Custo total = " + raiz.getCusto());
                return raiz;

            }

            visitados.add(raiz.getState());

            for (Transition transition : raiz.getState().getTransitions()) {

                Node filho = new Node(transition.getCoast()+ raiz.getCusto(), transition.getDestinity(), raiz);

                if (!borda.contains(filho) || !visitados.contains(filho.getState())) {
                    borda.add(filho);
                } else if (borda.contains(filho) && filho.getCusto() > borda.peek().getCusto()) {
                    borda.remove();
                    
                    borda.add(filho);
                }
            }

        } while (!borda.isEmpty());

        return null;
    }

}

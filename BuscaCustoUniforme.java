import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Atividade02.Node;

public class BuscaCustoUniforme {
    private Queue<Node> borda;
    private Stack<State> visitados;
    private Node destino;

    public BuscaCustoUniforme(){
        this.borda = new LinkedList<Node>();
        this.visitados = new Stack<State>();
    }

    public void setDestino( Node destino ){
        this.destino = destino;
    }
    
    public Node busca(Node origin, State target){
        borda.add(origin);
        do {
         
            Node raiz = borda.remove();
            if(raiz.getState().equals(target)){
                return raiz;
            }
            visitados.add(raiz.getState());

            for ( Transition transition : raiz.getState().getTransitions()) {

                Node filho = new Node(transition.getCoast() + raiz.getCusto(), transition.getDestinity(), raiz);

                if(!borda.contains(filho) || !visitados.contains(filho.getState())){
                    borda.add(filho);
                }
                else if(filho.getCusto() <  1 ) {
                    
                }
                
            }

            
        } while (!borda.isEmpty());



        return null;
    }

}

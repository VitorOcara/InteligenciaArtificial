package Atividade02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Busca_em_largura {
    private Queue<Node> borda;
    private Stack<State> visitados;
    private Node destino;

    public Busca_em_largura(){
        this.borda = new LinkedList<Node>();
        this.visitados = new Stack<State>();
    }

    public void setDestino( Node destino ){
        this.destino = destino;
    }
    
    public Node busca(Node origin, Node destinity){
        borda.add(origin);
        do {
            Node raiz = borda.remove();
            visitados.add(raiz.getState());

            
        } while (!borda.isEmpty());



        return null;
    }

}

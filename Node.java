public class Node implements Comparable<Node> {
    private int custo;
    private State state;
    private Node pai;

    public int getCusto() {
        return this.custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Node getPai() {
        return this.pai;
    }

    public void setPai(Node pai) {
        this.pai = pai;
    }

    public Node() {
    }

    public Node(State state) {
        this.state = state;

    }

    public Node(int custo, State state, Node pai) {
        this.custo = custo;
        this.state = state;
        this.pai = pai;
    }

    public Node(State state, int custo) {
        this.custo = custo;
        this.state = state;
    }

    @Override
    public int compareTo(Node node) {
        if(this.custo > node.getCusto()){
            return 1;
        }
        if(this.custo < node.getCusto()){
            return -1;
        }
        return 0;
    }

}

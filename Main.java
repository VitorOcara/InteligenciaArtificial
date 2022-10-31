import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        State origin = new State();
        System.out.println("Digite o estado inicial");
        Scanner scan = new Scanner(System.in);
        String nameOrigin = scan.nextLine();

        Map map = new Map(createMap());

        State target = new State();

        for (State state : map.getMap()) {
            if (state.getName().toLowerCase().equals(nameOrigin.toLowerCase())) {
                origin = state;
            }
            if (state.getName().equals("bucharest")) {
                target = state;
            }
        }

        // BuscaLargura b = new BuscaLargura();
        // b.busca(new Node(origin), target);
        // BuscaProfundidade bf = new BuscaProfundidade();
        // bf.busca(new Node(origin), target);
        BuscaCustoUniforme bcu = new BuscaCustoUniforme();
        Node n = new Node(origin, 0);
        bcu.busca(n, target);

    }

    public static ArrayList<State> createMap() {
        ArrayList<State> map = new ArrayList<>();

        State oradea = new State("oradea");
        State zerind = new State("zerind");
        State arad = new State("arad");
        State timisoara = new State("timisoara");
        State lugoj = new State("lugoj");
        State mehadia = new State("mehadia");
        State drobeta = new State("drobeta");
        State craiova = new State("craiova");
        State rimnicuVilceo = new State("rimnicu vilceo");
        State sibiu = new State("sibiu");
        State fagaras = new State("fagaras");
        State pitesti = new State("pitesti");
        State bucharest = new State("bucharest");
        State giurgiu = new State("giurgiu");
        State urziceni = new State("urziceni");
        State hirsova = new State("hirsova");
        State eforie = new State("eforie");
        State vaslui = new State("vaslui");
        State iasi = new State("iasi");
        State neamt = new State("neamt");

        oradea.addTransition(new Transition(zerind, 71));
        oradea.addTransition(new Transition(sibiu, 151));
        map.add(oradea);

        zerind.addTransition(new Transition(arad, 75));
        zerind.addTransition(new Transition(oradea, 71));
        map.add(zerind);

        arad.addTransition(new Transition(zerind, 75));
        arad.addTransition(new Transition(timisoara, 118));
        arad.addTransition(new Transition(sibiu, 140));
        map.add(arad);

        timisoara.addTransition(new Transition(arad, 118));
        timisoara.addTransition(new Transition(lugoj, 111));
        map.add(timisoara);

        lugoj.addTransition(new Transition(timisoara, 111));
        lugoj.addTransition(new Transition(mehadia, 70));
        map.add(lugoj);

        mehadia.addTransition(new Transition(lugoj, 70));
        mehadia.addTransition(new Transition(drobeta, 75));
        map.add(mehadia);

        drobeta.addTransition(new Transition(mehadia, 75));
        drobeta.addTransition(new Transition(craiova, 120));
        map.add(drobeta);

        craiova.addTransition(new Transition(drobeta, 120));
        craiova.addTransition(new Transition(pitesti, 138));
        craiova.addTransition(new Transition(rimnicuVilceo, 146));
        map.add(craiova);

        rimnicuVilceo.addTransition(new Transition(sibiu, 80));
        rimnicuVilceo.addTransition(new Transition(pitesti, 97));
        rimnicuVilceo.addTransition(new Transition(craiova, 146));
        map.add(rimnicuVilceo);

        sibiu.addTransition(new Transition(oradea, 151));
        sibiu.addTransition(new Transition(arad, 140));
        sibiu.addTransition(new Transition(fagaras, 99));
        sibiu.addTransition(new Transition(rimnicuVilceo, 80));
        map.add(sibiu);

        fagaras.addTransition(new Transition(sibiu, 99));
        fagaras.addTransition(new Transition(bucharest, 211));
        map.add(fagaras);

        pitesti.addTransition(new Transition(rimnicuVilceo, 97));
        pitesti.addTransition(new Transition(bucharest, 101));
        pitesti.addTransition(new Transition(craiova, 138));
        map.add(pitesti);

        bucharest.addTransition(new Transition(giurgiu, 91));
        bucharest.addTransition(new Transition(urziceni, 85));
        bucharest.addTransition(new Transition(pitesti, 101));
        bucharest.addTransition(new Transition(fagaras, 211));
        map.add(bucharest);

        urziceni.addTransition(new Transition(bucharest, 85));
        urziceni.addTransition(new Transition(vaslui, 98));
        urziceni.addTransition(new Transition(hirsova, 142));
        map.add(urziceni);

        hirsova.addTransition(new Transition(urziceni, 98));
        hirsova.addTransition(new Transition(eforie, 86));
        map.add(hirsova);

        eforie.addTransition(new Transition(hirsova, 86));
        map.add(eforie);

        vaslui.addTransition(new Transition(urziceni, 142));
        vaslui.addTransition(new Transition(iasi, 92));
        map.add(vaslui);

        iasi.addTransition(new Transition(vaslui, 92));
        iasi.addTransition(new Transition(neamt, 87));
        map.add(iasi);

        neamt.addTransition(new Transition(iasi, 87));
        map.add(neamt);

        return map;
    }
}
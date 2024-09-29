package struktur_data;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Struktur_Data {

    public static void main(String[] args) {
        Node node0 = new Node("Brebes");
        Node node1 = new Node("Tegal");
        Node node2 = new Node("Pemalang");
        Node node3 = new Node("Pekalongan");
        Node node4 = new Node("Kendal");
        Node node5 = new Node("Semarang");
        Node node6 = new Node("Demak");
        Node node7 = new Node("Kudus");
        Node node8 = new Node("Rembang");
        Node node9 = new Node("Slawi");
        Node node10 = new Node("Purwokerto");
        Node node11 = new Node("Purbalingga");
        Node node12 = new Node("Banjarnegara");
        Node node13 = new Node("Wonosobo");
        Node node14 = new Node("Temanggung");
        Node node15 = new Node("Salatiga");
        Node node16 = new Node("Purwodadi");
        Node node17 = new Node("Blora");
        Node node18 = new Node("Cilacap");
        Node node19 = new Node("Kroya");
        Node node20 = new Node("Kebumen");
        Node node21 = new Node("Purworejo");
        Node node22 = new Node("Magelang");
        Node node23 = new Node("Boyolali");
        Node node24 = new Node("Klaten");
        Node node25 = new Node("Solo");
        Node node26 = new Node("Sragen");
        Node node27 = new Node("Sukoharjo");
        Node node28 = new Node("Wonogiri");
        node0.connect(node1);
        node0.connect(node9);
        node1.connect(node2);
        node1.connect(node9);
        node2.connect(node3);
        node3.connect(node4);
        node4.connect(node5);
        node4.connect(node14);
        node5.connect(node6);
        node5.connect(node15);
        node6.connect(node7);
        node6.connect(node15);
        node7.connect(node8);
        node7.connect(node15);
        node8.connect(node16);

        node9.connect(node10);
        node10.connect(node11);
        node10.connect(node18);
        node10.connect(node19);
        node10.connect(node20);
        node11.connect(node12);
        node12.connect(node13);
        node13.connect(node14);
        node13.connect(node22);
        node14.connect(node15);
        node14.connect(node22);
        node15.connect(node23);
        node16.connect(node17);
        node16.connect(node24);
        node17.connect(node26);
        node18.connect(node19);
        node19.connect(node20);
        node19.connect(node20);
        node20.connect(node21);
        node21.connect(node22);
        node22.connect(node23);
        node23.connect(node25);
        node23.connect(node24);
        node25.connect(node26);
        node25.connect(node27);
        node27.connect(node28);
        System.out.println("BFS: " + BFS(node0, "").toString());
    }

    public static LinkedList<String> BFS(Node node, String val) {
        Queue<Node> queue = new ArrayDeque<Node>();
        LinkedList<String> visited = new LinkedList<String>();
        queue.add(node);
        Node currentNode;

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            if (!visited.contains(currentNode.getName())) {
                visited.add(currentNode.getName());
                if (currentNode.getName().equals(val)) {
                    return visited;
                } else {
                    queue.addAll(currentNode.getAdjecentNode());
                }
            }
        }
        return visited;
    }
}



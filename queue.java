package myqueue;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("durian");
        queue.add("rambutan");
        queue.add("semangka");
        queue.add("kelapa");

        String removeElement = queue.remove();
        System.out.println("Elemen yang dihapus: " + removeElement);

        String firstElement = queue.peek();
        System.out.println("Elemen pertama: " + firstElement);

        String firstElementPoll = queue.poll();
        if (firstElementPoll != null) {
            System.out.println("Element yang dihapus: " + firstElement);
        } else {
            System.out.println("Antrian kosong");
        }

    }
}

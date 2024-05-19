package _01_StacksAndQueues._01_Lab;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class _06_HotPotato {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(scanner.nextLine());

        Queue<String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll()); 
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}

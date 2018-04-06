package breadthfastsearch;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreadthFastSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root node:");
        int root = sc.nextInt();
        System.out.print("Enter the number of nodes: ");
        int node = sc.nextInt();
        int vertex = node + 1;
        int bfs[][] = new int[vertex][vertex];
        System.out.println("Enter the nodes edges: ");
        for (int i = 1; i < bfs.length; i++) {
            for (int j = 1; j < bfs.length; j++) {
                bfs[i][j] = sc.nextInt();
            }

        }
        System.out.println("");

        LinkedList<Integer> l[];
        l = new LinkedList[vertex];
        for (int i = 1; i < bfs.length; i++) {
            l[i] = new LinkedList();
        }

        for (int i = 1; i < bfs.length; i++) {
            for (int j = 1; j < bfs.length; j++) {

                if (bfs[i][j] == 1) {

                    l[i].add(j);
                }
            }

        }

        boolean visited[] = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        visited[root] = true;
        q.add(root);

        System.out.print("Result: ");
        while (!q.isEmpty()) {
            root = q.poll();
            System.out.print(root + " ");
            Iterator<Integer> i = l[root].listIterator();

            while (i.hasNext()) {
                int n = i.next();
                while (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        System.out.println("");

    }

}

package bfs2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS2 {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("edges.txt");
        Scanner sc = new Scanner(f);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the root node: ");
        int r = s.nextInt();

        int n, e, a, b;
        n = sc.nextInt();
        e = sc.nextInt();

        LinkedList<Integer> edge[] = new LinkedList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            edge[i] = new LinkedList();

        }
        for (int i = 1; i <= e; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            edge[a].add(b);

        }

        boolean visited[] = new boolean[n + 1];
        Queue<Integer> q = new LinkedList<>();
        visited[r] = true;
        q.add(r);
        System.out.print("Result: ");
        while (!q.isEmpty()) {
            r = q.poll();
            System.out.print(r + " ");
            Iterator<Integer> i = edge[r].listIterator();
            while (i.hasNext()) {
                r = i.next();
                while (!visited[r]) {
                    visited[r] = true;
                    q.add(r);
                }
            }
        }

        System.out.println("");

    }

}

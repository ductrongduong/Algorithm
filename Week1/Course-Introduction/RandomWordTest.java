import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.io.File;

public class RandomWordTest {

    public static void main(String[] args) {
        String champion = "";
        double i = 1;
        File file = new File("animals8.txt");
        In in = new In(file);
        while (!in.isEmpty()) {
            String next = in.readString();
            champion = StdRandom.bernoulli(1 / i) ? next : champion;
            i++;
        }
        StdOut.println(champion);
    }

}
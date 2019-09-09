import java.util.*;
import java.math.*;

public class Class{

    public static final Random gen = new Random();
    public static int[] randomizeNumbers(int x, int max) {
        assert x <= max;
        int[] result = new int[x];
        Set<Integer> used = new HashSet<Integer>();

        for (int i = 0; i < x; i++) {
            int newRandom;
            do {
                newRandom = gen.nextInt(max+1);
            }
            while (used.contains(newRandom));
            result[i] = newRandom;
            used.add(newRandom);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i : randomizeNumbers(20,20)) {
            System.out.println(i);
        }
    }
}



// P.S. Musatkina Oleksandra

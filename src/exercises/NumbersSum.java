package exercises;

import java.util.ArrayList;

public class NumbersSum {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
            add(10);
        }};

        int sum = 0;

        for (int i : numbers) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println(sum);
    }
}

package exercises;

import java.util.ArrayList;

public class ArrayListStrings {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>() {{
            add("Test");
            add("Testt");
            add("Testtt");
            add("Hello");
            add("World");
            add("Cards");
            add("Coo");
        }};

        for (String i : words) {
            if (i.length() == 5)
                System.out.println(i);
        }
    }
}

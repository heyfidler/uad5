package com.fidflop.jokes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Jokes {
    private static final List<String> jokes;
    private static final Random random = new Random();

    static {
        jokes = Arrays.asList(
            "Q: What goes up and down but does not move?\nA: Stairs",
            "Q: Where should a 500 pound alien go?\nA: On a diet",
            "Q: What did one toilet say to the other?\nA: You look a bit flushed. "
        );
    }

    public static String getJoke() {
        return jokes.get(random.nextInt(jokes.size()));
    }
}

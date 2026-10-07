package io.github.leanish.fixture;

public final class Greeting {
    private Greeting() {}

    public static String message() {
        return "hello, wrapper";
    }
}

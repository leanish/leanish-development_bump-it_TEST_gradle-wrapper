package io.github.leanish.fixture;

public final class GreetingTest {
    private GreetingTest() {}

    public static void main(String[] args) {
        if (!"hello, wrapper".equals(Greeting.message())) {
            throw new AssertionError("unexpected greeting");
        }
        System.out.println("GreetingTest passed");
    }
}

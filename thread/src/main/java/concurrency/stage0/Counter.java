package concurrency.stage0;

public class Counter {
    private int c = 0;

    public int increment() {
        c++;
        return c;
    }

    public void decrement() {
        c--;
    }

    public int getCount() {
        return c;
    }
}

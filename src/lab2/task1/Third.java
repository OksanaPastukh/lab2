package lab2.task1;

public class Third extends Second{
    private boolean bool;

    static {
        System.out.println("Third initialization");
    }

    public Third(final String str, final int value, final boolean bool) {
        super(str, value);
        this.bool = bool;
    }

    @Override
    public String toString() {
        return str + " " + value + " " + bool;
    }
}

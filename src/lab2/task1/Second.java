package lab2.task1;

public class Second extends First{
    protected int value;

    static {
        System.out.println("Second initialization");
    }

    public Second(final String str, final int value) {
        super(str);
        this.value = value;
    }

    @Override
    public String toString() {
        return str + " " + value;
    }
}

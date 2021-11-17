package lab2.task1;

public class First {
    protected String str;

    static {
        System.out.println("First initialization");
    }

    public First(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}

package lab2.task3;

public class Mark {
    private int value;


    public Mark(final int value)
    {
        this.value = value;
    }

    public void setValue(final int value) {
        if (value < 0 | value > 5)
            System.out.println("Error: wrong mark");
        else
            this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

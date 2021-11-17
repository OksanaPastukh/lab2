package lab2.task3;

public class task3 {
    public static void main(final String[] args){
        final Student s1 = new Student("Ivan", "Ivanov");
        final Student s2 = new Student("Petro", "Petrovich");

        s1.AddMarks("Math",3);
        s1.AddMarks("Math",4);
        s1.AddMarks("Math",5);
        s1.AddMarks("English",3);
        s1.AddMarks("English",2);
        s1.AddMarks("Physics",4);

        s2.AddMarks("Math",5);
        s2.AddMarks("Math",4);
        s2.AddMarks("Physics",3);
        s2.AddMarks("English",4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

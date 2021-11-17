package lab2.task4;

import lab2.task3.Student;

public class task4 {
    public static void main(final String[] args){
        final StudentCollection collection = new StudentCollection();
        final Student s1 = new Student("Ivan", "Ivanov");
        final Student s2 = new Student("Petro", "Petrovich");

        s1.AddMarks("Math",4);
        s1.AddMarks("Math",3);
        s1.AddMarks("English",3);
        s2.AddMarks("Math",2);
        s2.AddMarks("Math",4);
        s2.AddMarks("English",3);


        collection.AddStudents(s1);
        collection.AddStudents(s2);

       collection.printAllStudents();
        System.out.print(collection.highestAverageScore());
        System.out.println();

        System.out.print(collection.map("English"));


    }

}

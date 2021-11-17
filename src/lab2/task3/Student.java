package lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int countStudents = 0;

    private  int id=0;
    private String name;
    private String surname;
    private List<Subject> subjects;

    public Student(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
        subjects = new ArrayList<Subject>();
        id = ++countStudents;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void AddSubject(final String subject_name)
    {
        AddSubject(new Subject(subject_name));
    }
    public void AddSubject(final Subject subject)
    {
        subjects.add(subject);
    }
    public void AddMarks(final String subject_name, final int value)
    {
        Subject needed_subject = findSubject(subject_name);
        if(needed_subject  == null)
        {
            needed_subject = new Subject(subject_name);
            AddSubject(needed_subject);
        }

        needed_subject.AddMarks(value);

    }
    public Subject findSubject(final String subject_name) {
        Subject result = null;
        for (final Subject subject : subjects) {
            if (subject.getSubject_name().equals(subject_name)) {
                result = subject;
                break;
            }
       }
      return result;
    }
    public double AverageValueAllSubject()
    {
        double result=0;
        if (subjects.size()>0)
        {
            double sum=0;
            for (final Subject subject: subjects) {
                sum += subject.AverageValue();
            }
            result = sum/subjects.size();
        }
        return result;
    }
    @Override
    public String toString() {
        return name + " "+ surname + " "+ id + '\n'+
                subjects.toString() ;
    }
}

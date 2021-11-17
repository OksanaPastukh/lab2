package lab2.task3;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String subject_name;
    private List<Mark> marks;
    public Subject(final String subject_name)
    {
        this.subject_name = subject_name;
        marks = new ArrayList<Mark>();
    }
    public List<Mark> getMarks(){return marks;}

    public String getSubject_name() {
        return subject_name;
    }
    public void AddMarks(final int value)
    {
        marks.add(new Mark(value));
    }
    public double AverageValue()
    {
        double result=0;
        if(marks.size()>0)
        {
            double sum = 0;
            for (final Mark mark: marks) {
                sum += mark.getValue();
            }
            result = sum/marks.size();
        }
        return result;
    }
    @Override
    public String toString() {
        return  subject_name + marks.toString() ;
    }
}

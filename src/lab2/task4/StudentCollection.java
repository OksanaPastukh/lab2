package lab2.task4;

import lab2.task3.Mark;
import lab2.task3.Student;
import lab2.task3.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentCollection {
    private List<Student> students;

    public StudentCollection()
    {
        students = new ArrayList<Student>();
    }

    public void AddStudents(final Student student){
        students.add(student);
    }

    public void addSubjectToAll(final String subject_name){
        for(final Student student: students){
           student.AddSubject(subject_name);
        }
    }

    public  void printAllStudents(){
        for(final Student student : students){
            System.out.println(student.toString());
        }
    }

    public Student highestAverageScore()
    {
        Student result = null;

        if(students.size()>0) {
            result = students.get(0);
            for (final Student student : students) {
                if(result.AverageValueAllSubject() < student.AverageValueAllSubject())
                {
                    result = student;
                }
            }
        }
      return result;
    }
    public Map<Integer,List<Mark>> map(final String subject_name)
    {
        final Map<Integer,List<Mark>> result = new HashMap<>();
        Subject subject = null;
            for (final Student student : students) {
                subject = student.findSubject(subject_name);
                if(subject!= null) {
                    result.put(student.getId(),subject.getMarks());
                }
                }
                   return result;
                }

}

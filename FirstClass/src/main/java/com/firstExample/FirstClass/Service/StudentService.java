package com.firstExample.FirstClass.Service;

import com.firstExample.FirstClass.Model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
@Service
public class StudentService {
    List<Student> students=new ArrayList<>( Arrays.asList(
            new Student(3, "Gaurav jain", "CE"),
            new Student(4,"Rahul Yadav","CE"),
            new Student(5, "Vikash Sharma","CE")
    ));
    public List<Student> getStudents(){
        return students;
    }
    public void addStudent(Student std){
        students.add(std);
    }
}

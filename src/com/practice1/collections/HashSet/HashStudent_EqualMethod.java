package com.practice1.collections.HashSet;

import com.practice1.Student_Model;
import com.practice1.Student_Model1;

import java.util.HashSet;

public class HashStudent_EqualMethod {

public HashSet<Student_Model1> CreateStudentList(){

    HashSet<Student_Model1> StudentList = new HashSet<>();

    Student_Model1 Student1 = new Student_Model1("Samyak",34,"CS");
    Student_Model1 Student2 = new Student_Model1("Samyak",34,"CS");
    Student_Model1 Student3 = new Student_Model1("Ritik", 60,"ME");
    Student_Model1 Student4 = new Student_Model1("jainshab",70,"Cs");

    StudentList.add(Student1);
    StudentList.add(Student2);
    StudentList.add(Student3);
    StudentList.add(Student4);

    return  StudentList;

}

    public static void main(String[] args) {
        HashStudent_EqualMethod obj = new HashStudent_EqualMethod();
        HashSet<Student_Model1> StudentList = obj.CreateStudentList();

        System.out.println(StudentList.size());


        for (Student_Model1 var: StudentList){
            System.out.println(var.getName()+"  "+var.getAge()+"  "+var.getBranch());
        }
    }
}

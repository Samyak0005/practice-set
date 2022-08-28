package com.practice1.collections.HashSet;

import com.practice1.Student_Model;

import java.util.HashSet;

public class HashStudent_Model {
    public HashSet<Student_Model> AddStudentList(){

        HashSet<Student_Model> StudentList = new HashSet<>();

        Student_Model obj = new Student_Model("Samyak",45, "CS");
        Student_Model obj1 = new Student_Model("Samyak",50, "It");
        Student_Model obj2 = new Student_Model("Ritik", 60,"ME");
        Student_Model obj3 = new Student_Model("jainshab",70,"Cs");

        StudentList.add(obj);
        StudentList.add(obj1);
        StudentList.add(obj2);
        StudentList.add(obj3);

        return StudentList;

    }

    public static void main(String[] args) {
        HashStudent_Model  Student = new HashStudent_Model();
        HashSet<Student_Model> StudentList = Student.AddStudentList();

//        for (int i =0; i<StudentList.size(); i++){
//            System.out.println(StudentList.toArray());
//            System.out.println(StudentList);
//        }

        for (Student_Model var: StudentList){
            System.out.println(var.getName()+"  "+var.getAge()+"  "+var.getBranch());
        }
    }
}

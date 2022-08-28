package com.practice1.collections;

import com.practice1.Student_Model;

import java.util.ArrayList;

public class StudentArray_List {

    public ArrayList<Student_Model> CreateStudentList(){

        ArrayList<Student_Model> StudentList = new ArrayList<>();

        Student_Model Student1 = new Student_Model("Samyak",18,"CS");
        Student_Model Student2 = new Student_Model("Anuraj", 23,"ME");
        Student_Model Student3 = new Student_Model("Nitin",45,"EE");

        StudentList.add(Student1);
        StudentList.add(Student2);
        StudentList.add(Student3);

        return StudentList;

    }

    public static void main(String[] args) {
        StudentArray_List obj = new StudentArray_List();
        ArrayList<Student_Model> StudentList = obj.CreateStudentList();

        for (Student_Model var: StudentList){
            System.out.println("StudentName :"+var.getName());
            System.out.println("StudentAge :"+var.getAge());
            System.out.println("StudentBranch :"+var.getBranch());
        }

        for (Student_Model var: StudentList) {
//            if (var.getName().equals("Samyak")) {
//                var.setName("Ritik");
//            }
            if (var.getAge()==18){
                var.setAge(23);
            }
            var.setBranch("it");
                System.out.println("StudentName :" + var.getName());
                System.out.println("StudentAge :" + var.getAge());
                System.out.println("StudentBranch :" + var.getBranch());

        }

    }

}

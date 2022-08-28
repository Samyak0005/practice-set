package com.practice1;

public class Student_Model {

    String name;
    int age ;
   String Branch;

    public Student_Model(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.Branch = branch;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

//    public static void main(String[] args) {
//        Student_Model obj  = new Student_Model("samyak", 23, "CS");
//        System.out.println(obj.getName());
//    }
}

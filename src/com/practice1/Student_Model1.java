package com.practice1;

import java.util.Objects;

public class Student_Model1 {

    String name;
    int age;
    String Branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student_Model1)) return false;
        Student_Model1 that = (Student_Model1) o;
        return age == that.age && name.equals(that.name) && Branch.equals(that.Branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, Branch);
    }

    public Student_Model1(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        Branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
}

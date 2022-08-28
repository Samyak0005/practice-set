package com.practice1.method_parameter_classobject;

public class Constructor {
    //Student Data

    String StudentName;
    String Section;
    int age;
    Double Roll_No;
    int Room_No;

    //Constructors

    public Constructor(String StudentName, String Section, int age, Double Roll_No, int Room_No){
        this.StudentName= StudentName;
        this.Section = Section;
        this.age = age;
        this.Roll_No = Roll_No;
        this.Room_No = Room_No;
    }

    public static void main(String[] args) {


        Constructor obj1 = new Constructor("Samyak", "CS", 18, 1833810007d, 223);
       // String StudentName = obj1.StudentName;
       // System.out.println(StudentName);
        System.out.println(obj1.StudentName+" "+obj1.Section+" "+obj1.age+"  "+obj1.Roll_No+" "+obj1.Room_No);

    }


    
}

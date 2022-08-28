package com.practice1.method_parameter_classobject;

public class Methods_Void {

    // if we create Dog object are show state it means we create DataMembers
    // method show always Behaviour
    // dog object

    String BreedName;
    int age;

    // Methods Syntax
    // AccessModifier returnType MethodName (Inputparametars)


    public void Run(){
        System.out.println("this is Run method");
    }
    public void Eat(){
        System.out.println("This is Eat method");
    }

    public static void main(String[] args) {
        Methods_Void obj = new Methods_Void();
        obj.Eat();
        obj.Run();
     //   obj.age = 23;
       // obj.BreedName = "GermanSaifad";
    }
}


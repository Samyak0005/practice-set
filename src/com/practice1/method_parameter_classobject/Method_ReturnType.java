package com.practice1.method_parameter_classobject;

import java.util.Scanner;

public class Method_ReturnType {

    public int AddNum(){
        System.out.println("add two Num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a+b ;
    }

    public int SubNum(int a ,int b){
        System.out.println("Sub two Num");
        return a/b;
    }

    public static void Name(){
        System.out.println("Samyak");
    }

    public static void main(String[] args) {
        Method_ReturnType obj = new Method_ReturnType();
       int Output = obj.AddNum();
        System.out.println(Output);

        Output = obj.SubNum(16,2);
        System.out.println(Output);


        Name();
    }

}

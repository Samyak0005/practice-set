package com.practice1;

public class Encapsulation {


        private int roll_no;
        private String name;

        // getter and setter

        public int getRoll_no () {
            return this.roll_no;
        }

        public void setRoll_no ( int roll_no){
            this.roll_no = roll_no;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }
        // Constructors


    public Encapsulation(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    //another class for access

    public class main{
        public static void main(String[] args) {
            Encapsulation obj = new Encapsulation(8,"Samyak");
            obj.getName();
            obj.getRoll_no();
        }
    }

}


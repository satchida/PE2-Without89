package com.stackroute.pe2;

import javax.naming.Name;

public class Member {

    //Private members of the class declared
    private String Name;
    private int Age;
    private double Salary;

    //Parameterised constructor taking name,age,salary
     public Member(String name,int age,double salary)
     {
         Name=name;
         Age=age;
         Salary=salary;
     }

     //Getter method for all the private variables of the class
     public String getName()
     {
         return Name;
     }
     public int getAge()
     {
         return  Age;
     }
     public double getSalary()
     {
         return Salary;
     }
}
class MemberVariable{
    public String details(String name,int age,double salary)
    {
        String result="";
        Member member=new Member(name, age, salary);
        if(age<=18)//Checking the age of the members
        {
            result="You are too young to Earn";
        }
        else if (age<=60) {//If person is in earning group
            result = "Members Name: ";
            result = result + member.getName();
            result = result + "\n";
            result = result + "Members Age: ";
            result = result + member.getAge();
            result = result + "\n";
            result = result + "Members Salary: ";
            result = result + member.getSalary();
        }
        else{//If person is too old
            result="You are now retired.\nGetting your Pension";
        }
        return result;
    }
}

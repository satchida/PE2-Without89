package com.stackroute.pe2;

import javax.naming.Name;

public class Member {
    private String Name;
    private int Age;
    private double Salary;
     public Member(String name,int age,double salary)
     {
         Name=name;
         Age=age;
         Salary=salary;
     }
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
        if(age<=18)
        {
            result="You are too young to Earn";
        }
        else if (age<=60) {
            result = "Members Name: ";
            result = result + member.getName();
            result = result + "\n";
            result = result + "Members Age: ";
            result = result + member.getAge();
            result = result + "\n";
            result = result + "Members Salary: ";
            result = result + member.getSalary();
        }
        else{
            result="You are now retired.\nGetting your Pension";
        }
        return result;
    }
}

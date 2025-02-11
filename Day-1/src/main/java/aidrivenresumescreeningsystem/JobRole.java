package aidrivenresumescreeningsystem;

public class JobRole {
    String name,department,number;
    JobRole(String name,String department,String number){
        this.name=name;
        this.department=department;
        this.number=number;
    }
    @Override
    public String toString(){
        return ("Name Of Employer : "+ name+"\n Name of Department : "+getClass().getSimpleName()+"\n Phone Number of Employer : "+number);
    }
}

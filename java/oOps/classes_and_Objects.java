package oOps;

public class classes_and_Objects {
    public static void main(String[] args) {
        System.out.println("creating classes and objects");
        

        // Student [] students = new Student[5];
        // assigning object to the class
        // Student A ;// Here we have just declared the new Object A to student class
        // A=new Student(); 
        Student A = new Student(5,"RAm",false); //
        System.out.println(A.name);
        Student B =new Student();
        System.out.println(B.marks);// will assign the values of by default constructor that is 
        // defined in the class section 

    }
}

class Student{
    int rno;
    String name;
    boolean marks;

    Student(int rollNo, String name, boolean marks){
        this.rno=rollNo;
        this.name=name;
        this.marks=marks;
    }

    Student(){
        this.rno=5;
        this.name="Ram";
        this.marks=true;
    }
}

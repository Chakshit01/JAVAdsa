package oOps;

public class classes_and_Objects {
    public static void main(String[] args) {
        System.out.println("creating classes and objects");
        

        // Student [] students = new Student[5];
        // assigning object to the class
        // Student A ;// Here we have just declared the new Object A to student class
        // A=new Student(); 
        Student A = new Student(5,"Rahul",false); //
        System.out.println(A.name);
        Student B =new Student();
        System.out.println(B.marks);// will assign the values of by default constructor that is 
        // defined in the class section 

        Student random = new Student(A);
        System.out.println(random.name);
        A.greeting();

    }
}

class Student{
    int rno;
    String name;
    boolean marks;

    // Another constructor that will be called when we'll be having following parameters inside the function
    Student(int rollNo, String name, boolean marks){
        this.rno=rollNo;
        this.name=name;
        this.marks=marks;
    }
    void greeting(){
        System.out.println("how are you " + name);
    }
    
    Student  (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student () {
        // this is how you call a constructor from another constructor
        // internally: new Student (13, "default person", 100.0f);
        this (13, "default person", true);
    }
   

    // Creating another Constructor with no parameters inside
    // Student(){
    //     this.rno=5;
    //     this.name="Ram";
    //     this.marks=true;
    // }
}

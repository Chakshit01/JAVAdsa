package oOps;

public class Static_Var {
    static int x =10;
    public static void main(String[] args) {
        System.out.println(Static_Var.x);// output :10

        // Creating instances for the class
        Static_Var student1 = new Static_Var();
        Static_Var student2 = new Static_Var();

        System.out.println(student1.x);// output:10
        
        // modifying static variable thru one instance and changing will be applied to all other instances
        student1.x= 20;
        System.out.println(student2.x);// will give output 20 

    }
}

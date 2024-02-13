package oOps;

public class Static_block {
    static int Static_var;

    static{
        System.out.println("Static block is executed");
        System.out.println(15);
        Static_var=20;
    }
    public static void main(String[] args) {
        System.out.println(Static_block.Static_var);
    }
}

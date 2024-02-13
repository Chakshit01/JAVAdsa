package oOps;

public class static_Method {
    static void staticMethod(){
        System.out.println("This is static method");
    }
    public static void main(String[] args) {
        // Calling static method without any instance
        
        static_Method.staticMethod(); // output:this is a static method
        
        // creating new instance 
        static_Method obj1 = new static_Method();
        // accesing the static method through the instance of the class 
        obj1.staticMethod();
    }
    
}

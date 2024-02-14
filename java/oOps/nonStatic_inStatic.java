package oOps;
public class nonStatic_inStatic{
    

    public static void main(String[] args) {

        // greetings(); we can't use this method in static mehtod as it is a nonStatic method

        // we have to create an instance of the method for accessing nonStatic method inside the static method
        
        nonStatic_inStatic obj1 = new nonStatic_inStatic();
        obj1.greetings();
    }
    void greetings(){
        System.out.println("Hello World");
}
 }
   

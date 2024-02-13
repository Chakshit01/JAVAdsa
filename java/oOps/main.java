package oOps;

public class main {
    public static void main(String[] args) {
        // here we are importing the constructor from the other package
        
        packages_Static kunal = new packages_Static(10,"Kunal" , 78, true);
        packages_Static Rahul = new packages_Static(12, "Rahul", 80, true);
        System.out.println(kunal);
        System.out.println(packages_Static.population);
        // the static variable will change 
    }
}

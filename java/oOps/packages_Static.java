package oOps;

public class packages_Static {
      int rno;
      String name;
      float marks;
      boolean Pass;
      static long  population; // here static due to the reason that it is common to all the instances of the class
      // these variables are independent of the objects, we don't need to write object_name.population
      // to access these variables 


    public packages_Static(int rno,String name,float marks, boolean pass){
      this.rno =rno;
      this.name=name;
      this.marks=marks;
      this.Pass=pass;
      packages_Static.population+=1;
    }
}

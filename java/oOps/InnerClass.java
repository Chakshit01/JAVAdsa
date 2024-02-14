package oOps;


public class InnerClass{

//  Using the class without initialsing it as static will lead to an error as we cant access the 
//  non static method inside a static method we have to make it independent of the instances so as 
//  to access it 
    //  class test{
    //     String name;
    //     public test(String name){
    //       this.name = name;
    //     }}

    static class test{
        String name;
        public test(String name){
          this.name = name;
        }}
    public static void main(String[] args) {
        test a = new test("Ram");
        test b = new test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }

}
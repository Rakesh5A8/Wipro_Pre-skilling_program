//package Day5;

// class ParentClass {
    

//     public String displayInfo1() {
//         return "This is a Parent class";
//     }
// }

// class ChildClass extends ParentClass{
//     public String displayInfo2() {
//         return "This is a child class";
//     }
// }


// public class Inheritance {
//     public static void main(String[] args) {
//         ChildClass obj = new ChildClass();
//         System.out.println(obj.displayInfo1());
//         System.out.println(obj.displayInfo2());
        
//     }
    
// }

// class Person{
//     String name;
//     public Person(String name) {
//         this.name = name;
//     }
//     void displayInfo() {
//         System.out.println("Name: " + name);
//     }
// }
// class Student extends Person {
//     int rollno;
//     public Student(String name, int rollno ) {
//         super(name);
//         this.rollno = rollno;
//     }
//     void displayInfo() {
//         super.displayInfo();
//         System.out.println("Roll no = " + rollno);
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         Student obj = new Student("Rakesh", 18);
//         obj.displayInfo();
//     }
// }

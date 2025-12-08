// package Day5;



// class StdMarks{
//     int marks;
//     public StdMarks(int m){
//         this.marks=m;
//     }
// }
// class Data extends StdMarks{  // SINGLE INHERITANCE
//     String name;
//     public Data(String n,int m){
//         super(m);
//         this.name=n;
//     }
//        void displayInfo(){
//         System.out.println("Name: " + name);
//         System.out.println("Marks: " + marks);
//     }
// }
// class Bio extends Data{         // MultiLevel INHERITANCE
//     int age;
//     public Bio(String n, int m,int a){
//         super(n,m);
//         this.age=a;
//     }
//     void displayInfo(){
//         System.out.println("Name: " + name);
//         System.out.println("Marks: " + marks);
//         System.out.println("Age: " + age);
        
//     }
// } 
// public class InheritanceExample {
//     public static void main(String[] args) {
//         Data d = new Data("tt",34);
//         Bio b = new Bio("abcd",79,25);
        
//         d.displayInfo();
//         System.out.println();
//         b.displayInfo();
        
//     }
// }

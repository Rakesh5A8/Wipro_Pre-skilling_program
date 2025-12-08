package Day6;

// public class generic {
//     public static void main(String[] args) {
//         Printer<Integer> p1 = new Printer<>(12);
//         p1.print();
//         Printer<String> p2 = new Printer<>("Done");
//         p2.print();

//         shout(111);
//         shout("yeh");
//         explain("null",222 );
//     }
//     static <Gen> void shout(Gen toShout){
//     System.out.println(toShout + "!!!");
//     }

//     static <Gen,Otr> void explain(Gen toShout,Otr toexplain){ 
//     System.out.println(toShout + "!!!" + "... " + toexplain);
//     }

//     static <Gen> Gen rtn(Gen toShout){
//     return toShout;
//     }
// }

// class Printer <T> {
//     T varia;

//     Printer(T thingToPrint) {
//         varia = thingToPrint;
//     }

//     void print() {
//         System.out.println(varia);
//     }
// }

// class Box<T>{
//     T item;
//     Box(T item) { 
//         this.item = item;
//      }
//      T show() {
//         return item;
//     }
// }
// public class generic{
//     public static void main(String[] args) {
//         Box<Integer> item1 = new Box<>(123);
//         System.out.println(item1.show());
//         Box<String> item2 = new Box<>("Rakesh");
//         System.out.println(item2.show());

//     }
// }

// Box class without generics
// class Box {
//     private Object item;  

    
//     public void setItem(Object item) {
//         this.item = item;
//     }

    
//     public Object getItem() {
//         return item;
//     }
// }


// public class generic {
//     public static void main(String[] args) {

        
//         Box intBox = new Box();
//         intBox.setItem(123);  // Autoboxing Integer # Object is class which is inheriting String, 

        
//         Box strBox = new Box();
//         strBox.setItem("Hello");

        
//         Integer num = (Integer) intBox.getItem();  
//         String str = (String) strBox.getItem();   

        
//         System.out.println("Integer: " + num);
//         System.out.println("String: " + str);
//         String wrong = (String) intBox.getItem();  
        

//         // String wrong = (String) intBox.getItem();  // ClassCastException
//     }
// }

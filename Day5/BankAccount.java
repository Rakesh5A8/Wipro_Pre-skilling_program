// package Day5;

// public class BankAccount{
//     private String name;
//     private String accno;
//     private double balance;
//     public BankAccount(String name, String accno, int balance) {
//         this.name = name;
//         this.accno = accno;
//         this.balance = balance;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name= name;
//     }
//     public String getAccno(){
//         return accno;
//     }
//     public void setAccno(String accno){
//         this.accno= accno;
//     }
//     public void deposit(double amount){
//         if (amount>0){
//             balance+= amount;
//             System.out.println("Balance remain: "+ balance);
//         }else{
//             System.out.println("Invalid amount");
//         }
        
//     }
//     public void withdraw(double amount){
//         if (balance< amount){
//             System.out.println("Insufficient balance");

//         }
//         else{
//             balance -= amount;
//             System.out.println("balance remain: "+ balance);
//         }
//     }
//     public void displayAccountDetails() {
//         System.out.println("Account Holder: " + name);
//         System.out.println("Account Number: " + accno);
//         System.out.println("Balance: "+ balance);
//         System.out.println();
//     }
// }

// class Main{
//     public static void main(String[] args) {
//         BankAccount obj = new BankAccount("A", "1234A", 40000);
//         obj.displayAccountDetails();
//         obj.setAccno("12345B");
//         System.out.println(obj.getAccno());
//         obj.displayAccountDetails();
//         obj.deposit(20000);
//         obj.displayAccountDetails();
//         obj.withdraw(30000);
//         obj.displayAccountDetails();
//         obj.withdraw(50000);



//     }
// }



public class Main { 
         public static void main(String[] args) { 
                 Customer customer; 
                 RegularCustomer regularCustomer = new RegularCustomer("Denzel", 3000); 
                 SeniorCustomer seniorCustomer = new SeniorCustomer("Joseph", 3000); 
  
                 customer = regularCustomer; 
                 System.out.println(customer.getName()+" " +customer.calculateBill()); 
  
                 customer = seniorCustomer; 
                 System.out.println(customer.getName()+" "+customer.calculateBill()); 
         } 
 }


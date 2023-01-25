public class Main { 
         public static void main(String[] args) { 
                 Customer customer; 
                 RegularCustomer regularCustomer = new RegularCustomer("Samanta", 3000); 
                 SeniorCustomer seniorCustomer = new SeniorCustomer("Edgar", 3000); 
  
                 customer = regularCustomer; 
                 System.out.println(customer.getName()+" " +customer.calculateBill()); 
  
                 customer = seniorCustomer; 
                 System.out.println(customer.getName()+" "+customer.calculateBill()); 
         } 
 }


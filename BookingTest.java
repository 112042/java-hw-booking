import java.util.Scanner;


/**
 *
 * @author Devon
 */

public class BookingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
       Scanner input=new Scanner(System.in);    
       String cname;                            
       String cphone;                           
       int adults,kids,year,month,day;          
       String select;                           
       String title;                            
       String BookDate;                        
      
       System.out.println("***Welcome Booking***");    
       
      
       while(true){
           System.out.println("Input information:");
           
           
           System.out.println("Booking Name:");
           cname=input.next();
           
           
           System.out.println("Booking phone:"); 
           cphone=input.next();
           
           
           System.out.println("Booking Title(1.MR 2.MRS,3.MS):");     
           title = input.next();
           
           
            if(title.equals("1")||title.equals("2")||title.equals("3")){
                
                
                  Customer custom_information = new Customer(cname, cphone, Title.values()[Integer.parseInt(title) - 1]);
                 
                 
                  System.out.println("How many adults?");  
                  adults = input.nextInt();
                  
                 
                  System.out.println("How many child?");  
                  kids = input.nextInt();
                  
                 
                  System.out.println("Check-in Year?");  
                  year = input.nextInt();
                  
                  
                  System.out.println("Check-in Month?");  
                  month = input.nextInt();
                  
                  
                  System.out.println("Check-in Day?");  
                  day = input.nextInt();
                  
                  
                  Booking book_information=new Booking(custom_information,adults,kids,new Date(year,month,day));
                  
                  
                  System.out.println("Completely Information:\n");
                  book_information.show();
                  
                  
                  System.out.println("Is correct(1.yes 2.no)");
                  select=input.next();
                  
                  
                  if(select.equals("1")){
                      System.out.println("Successful");
                      break;
                  }else{   
                      System.out.println("error,plz re-input");
                  }
               }else{      
                 System.out.println("format error");
                 break;   
            }   
       }                     
  }        
}
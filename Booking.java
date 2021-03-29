public class Booking{
  Customer customer;          
  int numAdults, numKids;    
  Date bookingTime;           
  
  public Booking(Customer customer, int numAdults,int numKids, Date bookingTime) {    
        this.customer = customer;                                                    
        this.numAdults = numAdults;                                                  
        this.numKids = numKids;                                                      
        this.bookingTime = bookingTime;                                             
    }

    public String toString(){                                                            
        return customer.toString() + "-" + numAdults + "-" + numKids+ "-" +bookingTime; 
    }

    public void show(){                                                                       
         System.out.println("Customer information"+":"+customer.toString() + "\n" +"How many adults:"+ numAdults +"\n"+"How many child:"+ numKids+ "\n"+"Date:" +bookingTime);  
    }
}
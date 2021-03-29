
public class Date {
    private int year;       
    private int month;      
    private int day;        

    public Date(int year,int month, int day) {    
        this.year=year;                           
        this.month = month;                       
        this.day = day;                           
        setMonth(month);                          
        setDay(day);                              
    }
   
    
//    public Date(int aa) {}
   
    public void setMonth(int mm) {                     
            if(mm >=1 && mm <= 12){                    
                month = mm;                            
            }         
            else {                                     
                System.out.println("input error");         
                month = 1;                                                     
            }
    } 
     public void setDay(int dd) {                          
            if(dd >= 1 && dd <= 310) {                    
                day = dd;                                  
            }             
             else {                                        
                System.out.println("input error");   
                day = 1;                                                  
            }
    }   
    
     public int getYear() {                             
            return year;	
    }
     
     public int getMonth() {                          
            return month;	
    }
     public int getDay() {                            
            return day;	
    }
  
      public String toString(){                         
        return year + "/" + month + "/" + day;        
    }
}


public class Customer {
  String surname;    
  Title title;        
  String phone;       
  
  public Customer(String surname, String phone, Title title) {     
        this.surname = surname;                                    
        this.phone = phone;                                        
        this.title = title;                                        
    }
   
  public String toString(){                                         
        return title.toString() + "." + surname + "\n"+"phone:" + phone;     
    }

    public void show(){                                           
         System.out.println(title.toString() + "-" + surname + "-" + phone);  
    }
}

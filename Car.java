package constructoroverloading;

public class Car{
             
	String name;     // taking the variables of  and string data types 
    int model ;  
    int gear;  
    
    Car(int i,String n){  //here we are implementing another constructor by taking 
                        //two parameters ,it is known as parameterized constructor 
     model =i;
     name = n; 
    }                                //the constructor should have the same name of the class name 
    Car(int i,String n ,int x){   //taking three parameters which shows that it is constructor overloaded
    model = i;  
    name = n;  
    gear =x;  
    }  
    void display(){                        //to display we are using this
    	
    	System.out.println("Car gears "+ ""+ gear);
    	System.out.println("Car model  :" +" "+ model);
    	System.out.println("Car name: "+ "" +name);
    	
    	
    	}  
    
   
    public static void main(String args[]){  //here we have taken main method to display
    
    
	Car s= new Car(3,"rollsroyal");
    Car s1 = new Car(5,"benz",2);  
     
    s.display();
    s1.display();  
  
   }  

}

package Kalimullah;

public class Mobile {
	String brand ;
	String color;
	int cost;
	void info() {
		System.out.println(brand +" "+color+" "+cost);	
		System.out.println("==========================================================================");
	}
       	Mobile(){
    	  brand ="MI";
    	  color = "Black";
    	  cost = 30000;	
    	  System.out.println(brand +" "+color+" "+cost);
    	  System.out.println("********************************************************************************");
	}
      Mobile(String brand ){
    	this .brand= "MI";
    	color = "Black";
    	cost= 500000; 	  
    	System.out.println(brand+" "+color+" "+cost);  
      }
      Mobile(String brand ,String color){
    	  this.brand=brand;
    	  this.color=color;
    	  cost = 40000;
    	System.out.println(brand+" "+color+" "+cost);
    	System.out.println("***********************************************************************************");
    	
    	  
      }
      Mobile(String brand,String color,int cost){
    	this.brand ="brand";
    	this .color= "color";
    	this .cost = cost;	
       	System.out.println(brand +" "+color+" "+cost);  
       	System.out.println("=================================================================================");
      }
}

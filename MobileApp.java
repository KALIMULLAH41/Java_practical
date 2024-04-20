package Kalimullah;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile m1 = new Mobile();
m1.info();
Mobile m2= new Mobile("Oppo");
m2.info();
Mobile m3 = new  Mobile("Realme","blue");
m3.info();
Mobile m4 = new Mobile("Samsung","Green",90000);

m4.info();
Mobile m5 = new Mobile("Apple","Green",190000);
m5.info();
	}

}

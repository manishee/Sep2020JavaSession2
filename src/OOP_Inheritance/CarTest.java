//**************** Oct 30-P3*************
package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b=new BMW();
		
		b.start();//inherited method
		b.stop();//inherited method
		b.refuel();//inherited method
		
		b.price();//overidden method
		b.autoParking();//independent method of BMW class
		BMW.wheels();
		
		b.engine();
		//b.theftSafety();//siblings cant inherit from each other
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.price();
		Car.wheels();
		c.engine();
		//c.theftSafety();//parent is trying to inherit from child
		//c.autoParking();
		
		//Top casting 
		Car c1=new BMW();//a child class object can be referred by a parent class reference
		c1.start();
		c1.stop();
		c1.refuel();
		c1.price();
		
		//down casting
		//BMW b1=(BMW) new Car();
		
		Vehicle v1=new BMW();
		v1.engine();
		
	}

}

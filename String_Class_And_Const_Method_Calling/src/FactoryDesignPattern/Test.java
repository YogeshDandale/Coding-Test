package FactoryDesignPattern;

public class Test {

	   public static void main(String[] args) {
		   FactoryPattern factory= new FactoryPattern();

	         Lenovo len = (Lenovo)factory.createMobile("len");
	         len.batteryPower();

	         Samsung sam= (Samsung)factory.createMobile("sam");
	         sam.cost();
	      }
}

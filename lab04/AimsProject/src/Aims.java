import AimsPackage.*;
public class Aims {
	public static void main(String[] args) {
		Order anOrdered = new Order();
		Order secondOrdered = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		int length = anOrdered.getQtyOrdered();
//		assert length >0 : "too short";
		anOrdered.removeDigitalVideoDisc(dvd1);
		
		anOrdered.addDigitalVideoDisc(dvd1);
		System.out.println(anOrdered.getQtyOrdered());
		
		
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		secondOrdered.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrdered.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		
		
		
//		System.out.println(length);
//		assert(length>0);
//			System.out.print("Total Cost is: ");
//			System.out.println(anOrdered.totalCost());
		
		
		// ====================
			
		anOrdered.print();
		
//		Order anOrdered1 = new Order();
//		Order anOrdered2= new Order();
//		Order anOrdered3 = new Order();
//		Order anOrdered5 = new Order();
		
	}
}
import hust.soict.hedspi.aims.order.*;
import hust.soict.hedspi.aims.disc.*;
public class DiscTest {
	public static void main(String[] args) {
		Order anOrder = new Order();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		System.out.println(anOrder.totalCost());
		System.out.println(anOrder.getALuckyItem().getCost());
		System.out.println(anOrder.totalCost());
		
		assert dvd1.search("The queen"): "error";
	}
}

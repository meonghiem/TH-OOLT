package AimsPackage;
import  java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[0];
	private int qtyOrdered = itemsOrdered.length;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		
		itemsOrdered_ArrayList.add(disc);
		qtyOrdered = itemsOrdered_ArrayList.size();
		System.out.println(itemsOrdered_ArrayList);
		itemsOrdered = itemsOrdered_ArrayList.toArray(itemsOrdered);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		
		itemsOrdered_ArrayList.remove(disc);
		qtyOrdered--;
		itemsOrdered = itemsOrdered_ArrayList.toArray(itemsOrdered);
	}
	
	public void print() {
		for(DigitalVideoDisc disc : itemsOrdered) {
			System.out.println(disc.getTitle());
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for(DigitalVideoDisc disc : itemsOrdered) {
			sum += disc.getCost();
		}
		return sum;
	}
}

package AimsPackage;
import AimsPackage.MyDate;
import  java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERS =5;
	private static int nbOrders = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[0];  // instance variable
	private int qtyOrdered = itemsOrdered.length;     // instance variable
	protected MyDate dateOrdered;
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public Order() {
		super();
		assert nbOrders < MAX_LIMITED_ORDERS : "limited order";
		
		nbOrders ++;
		this.dateOrdered = new MyDate();
	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		
		itemsOrdered_ArrayList.add(disc);
		qtyOrdered = itemsOrdered_ArrayList.size();
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
		System.out.println("***********************Order***********************");
		System.out.print("Date: ");
		System.out.println(this.dateOrdered);
		System.out.println("Ordered Items:");
		int sum = 0;
		for(DigitalVideoDisc disc : itemsOrdered) {
			sum+=disc.getCost();
			System.out.println("1. DVD"+" - "+ disc.getTitle() + " - " + 
				disc.getCategory() + " - "+disc.getDirector() +" - " + disc.getLength()+": "+ disc.getCost());
		}
		System.out.println("Total cost: " + sum);
		System.out.println("***************************************************");
	}
	
	public float totalCost() {
		float sum = 0;
		for(DigitalVideoDisc disc : this.itemsOrdered) {
			sum += disc.getCost();
		}
		return sum;
	}
	
	// Lab04
	public void adDigitalVideoDisc(DigitalVideoDisc discList[]) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		
		for(DigitalVideoDisc disc : itemsOrdered) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered_ArrayList.add(disc);
				qtyOrdered = itemsOrdered_ArrayList.size();
			}else break;
		}
		itemsOrdered = itemsOrdered_ArrayList.toArray(itemsOrdered);
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc ... discList) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		if(discList == null) {
			System.out.println("abcd");
		}
		for(DigitalVideoDisc disc : discList) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered_ArrayList.add(disc);
				System.out.println("abc");
				qtyOrdered = itemsOrdered_ArrayList.size();
			}else break;
		}
		itemsOrdered = itemsOrdered_ArrayList.toArray(itemsOrdered);
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		List<DigitalVideoDisc> itemsOrdered_List = Arrays.asList(itemsOrdered);
		List<DigitalVideoDisc> itemsOrdered_ArrayList = new ArrayList<>(itemsOrdered_List);
		qtyOrdered = itemsOrdered_ArrayList.size();
		
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered_ArrayList.add(disc1);
			qtyOrdered = itemsOrdered_ArrayList.size();
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemsOrdered_ArrayList.add(disc2);
				qtyOrdered = itemsOrdered_ArrayList.size();
			}else {
				System.out.println("not be added: " +disc2);
			}
		}else {
			System.out.println("not be added :" + disc1 + disc2);
		}
		itemsOrdered = itemsOrdered_ArrayList.toArray(itemsOrdered);
	}
}

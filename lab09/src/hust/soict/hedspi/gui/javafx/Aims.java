package hust.soict.hedspi.gui.javafx;
import java.lang.reflect.Array;
import java.util.*;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.order.Order;
import hust.soict.hedspi.aims.utils.MyDate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Aims extends Application{
	
	Button choose0;
	Button choose1;
	Button choose1Id;
	Button submitId;
	Button choose1Date;
	Button choose2;
	Button choose3;
	Button bookChoosen;
	Button DvdChoosen;
	Button CDChoosen;
	Button choose4;
	Button choose5;
	Button choose6;
	Button choose7;
	TextField tfInput;
	ArrayList<Order> listOrder = new ArrayList<Order>();
	int id = 0 , index = -1;
	
	public static void main(String[] args) {
		
		launch(args);
	}
		
@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("Order Management Application: ");
		VBox vbox = new VBox();
		submitId = new Button("Submit for id");
		choose0 = new Button("Exit");
		choose1 = new Button("Create new order");
		choose0.setOnAction(event->System.exit(0));
		choose1.setOnAction(evt->{
			Order newOrder = new Order();
			choose1Id = new Button("ID");
			choose1Id.setOnAction(event1 -> {
				
				vbox.getChildren().remove(submitId);
				tfInput = new TextField("");
		    	tfInput.setEditable(true);
		    	vbox.getChildren().addAll(new Label("ID"), tfInput, submitId);
		    	
		    	submitId.setOnAction(event2 -> {
		    		id =Integer.valueOf( tfInput.getText() );
		    		newOrder.setId(id);
		    		listOrder.add(newOrder);
					index += 1;
		    	});
		    	
			});
		
	
//				MyDate day = new MyDate();
//				System.out.println("Date Order ? ");
//				scanner.nextLine();
//				day.accept();
//				listOrder.get(index).setDateOrdered(day);
			//System.out.println("Initialize anOrder successfully!");
			vbox.getChildren().addAll(new Label("Input "), choose1Id);
		});
		vbox.getChildren().addAll(label1,choose0,choose1);
		Scene scene = new Scene(vbox,200,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Aim pj");
		primaryStage.show();
	}
}
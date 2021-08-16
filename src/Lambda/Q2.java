package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
class orders{
	int ID;
	int price;
	String Status;
	
	public orders(int iD, int price, String status) {
		super();
		ID = iD;
		this.price = price;
		Status = status;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "orders [ID=" + ID + ", price=" + price + ", Status=" + Status + "]";
	}
	
	

}
class lamda2
{
		public static void main(String[] args)
		{
			List<orders> list=new ArrayList<>();
			list.add(new orders(1,20000,"ACCEPTED"));
			list.add(new orders(2,5000,"COMPLETED"));
			list.add(new orders(3,25000,"COMPLETED"));
			list.add(new orders(4,7000,"ACCEPTED"));
			list.add(new orders(1,20000,"NOT-ACCEPTED"));
			
			//for price greater than 10000
			System.out.println("order having price greater than 10000");
			Stream<orders> filtered_data = list.stream().filter(p -> p.price > 10000);
			filtered_data.forEach(
					order->System.out.println(order.ID+" "+order.price+" "+order.Status)
					);
			
			System.out.println("\norder having status ACCEPTED");
			list.stream().filter(p->p.getStatus().matches("ACCEPTED")).forEach(
					order->System.out.println(order.ID+" "+order.price+" "+order.Status)
					);
			
			System.out.println("\norder having status COMPLETED");
			list.stream().filter(p->p.getStatus().matches("COMPLETED")).forEach(
					order->System.out.println(order.ID+" "+order.price+" "+order.Status)
					);
		}
	}

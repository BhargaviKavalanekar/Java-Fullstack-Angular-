package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

public class Q8 extends Thread{
	
	private static Consumer<List<Integer>> print;
	private static Collection<Integer> list;

	public void run() {
		System.out.println("Thread");
		
	}

	public static void main(String[] args) {
		
		Q8 a=new Q8();
		a.start();
		
		List<Integer> n=new ArrayList<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		n.add(50);
		n.add(60);
		n.add(70);
		n.add(80);
		n.add(90);
		n.add(100);
		
		
		Consumer<List<Integer>> p=list -> list.stream().forEach(b -> System.out.print(b +" "));
		
		p.accept(n);
		
		
		

	}

}

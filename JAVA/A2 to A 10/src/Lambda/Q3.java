package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//functional interface Supplier
		Supplier<Double> r=()-> Math.random();
		System.out.println("Value given by supplier interface :"+r.get());
		
		//functional interface Consumer
		
		Consumer<Integer> display=a -> System.out.println(a);
		display.accept(500);
		
		//functional interface Predicate
		
		Predicate<Integer> compare=i -> (i<15);
		System.out.println("Is the number less than 15 :" + compare.test(12));
		
		//Functional interface Function
		
		Function<Integer, Double> l= a -> a/2.0;
		l=l.andThen(a->a*3.0);
		System.out.println(l.apply(10));



	}

}

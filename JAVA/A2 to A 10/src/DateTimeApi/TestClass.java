package DateTimeApi;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class TestClass {

	public static void main(String[] args) {
		
		List<Fruits> fru=Arrays.asList(
    			new Fruits("Strawberry",98,45,"Pink"),
    			new Fruits("Watermelon",102,30,"Green"),
    			new Fruits("Pineapple",120,55,"Gray"),
    			new Fruits("Apple",78,34,"White"));
    	
    	
    	List<News> news1=Arrays.asList(
    			new News(1,"Bhargavi","Kavalanekar","XYZ"),
    			new News(2,"Sandeep","Parkar","YAB"),
    			new News(3,"Sanchit","P","Boo"),
    			new News(4,"Zoya","G","Hi"),
    			new News(5,"Hingula","S","Hello"),
    			new News(6,"Aditya","P","India Won The Game"));
    	
        Trade ramesh = new Trade("Doon", "Mumbai");
        Trade suya = new Trade("Jissoo","Bangalore");
        Trade abhi = new Trade("Vicky","Pune");
        Trade santosh = new Trade("Bhuvnesh","Chennai");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(santosh, 2021, 150), 
            new Transaction(ramesh, 2020, 1500),
            new Transaction(ramesh, 2011, 400),
            new Transaction(abhi , 2018, 710),	
            new Transaction(suya, 2016, 700),
            new Transaction(abhi, 2017, 950)
        );	
        

		//Displayed the fruit names of low calories fruits i.e. calories < 100 sorted in
		//descending order of calories.
		System.out.println("Acoording to <less calories ");
		fru.stream()
		.filter(t->(t.FruitCalories<100))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t));

		//Display color wise list of fruit names
		System.out.println("\nSort according to color");
		fru.stream()
		.sorted((p1,p2)->p1.FruitColor.compareTo(p2.FruitColor))
		.forEach(System.out::println);
		
		//Display only red color fruits sorted as per their price in ascending order.
		System.out.println("\nSort Gray color fruits sorted withprice in ascending");
		fru.stream()
		.filter(t->t.FruitColor.equals("Gray"))
		.forEach(t->System.out.println(t));
		
		//Find out the newsId which has received maximum comments.
		System.out.println("\nnewsId which has received maximum comments");
		int  P=news1.stream()
				.min((p1,p2)-> {
					return (int) p1.getNewsID()+p2.getNewsID();
					}).get().getNewsID();
			 System.out.println(P);
	
		
	    //Find out how many times the word 'budget' arrived in user comments all news.
		        System.out.println("\nthe word 'budget' arrived in user comments ");
		news1.stream()
		.filter(t->t.NewsComment.contains("budget"))
		.forEach(t->System.out.println(t));
		
		//Find out which user has posted maximum comments.
		 System.out.println("\nwhich user has posted maximum comments");
	 	String  n=news1.stream()
		.max((p1,p2)-> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
			}).get().getNewsCommentbyUser();
	
		System.out.println(n);

		//Display commentByUser wise number of comments
		 System.out.println("\ncommentByUser wise number of comments");
	   	news1.stream()
		.sorted((p1,p2)->p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
		.collect(Collectors.toList())
		.forEach(t->System.out.println(t.NewsCommentbyUser+"="+t.NewsComment));
		
		
        //Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> y = transactions.stream()
                                               .filter(transaction -> transaction.getYear() == 2011)
                                               .sorted(comparing(Transaction::getValue))
                                               .collect(toList());
        System.out.println(y);
        
        //What are all the unique cities where the traders work?
        List<String> cities = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getCity())
                        .distinct()
                        .collect(toList());
        System.out.println(cities);

        //Find all traders from Pune and sort them by name.
        
        List<Trade> traders = 
            transactions.stream()
                        .map(Transaction::getTrader)
                        .filter(trader -> trader.getCity().equals("Pune"))
                        .distinct()
                        .sorted(comparing(Trade::getName))
                        .collect(toList());
        System.out.println(traders);
        
        
        //Return a string of all traders’ names sorted alphabetically.
        
        String traderStr = 
            transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        System.out.println(traderStr);
        
        //Are there any trader based in Pune?
        
        boolean Pune =
            transactions.stream()
                        .anyMatch(transaction -> transaction.getTrader()
                                                            .getCity()
                                                            .equals("Pune")
                                 );
        System.out.println(Pune);
   
        
        //What's the highest value in all the transactions?
        int highestValue = 
            transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(0, Integer::max);
        System.out.println(highestValue);   
        
        //What's the lowest value in all the transactions?
        int lowestValue = 
                transactions.stream()
                            .map(Transaction::getValue)
                            .reduce(1500, Integer::min);
            System.out.println(lowestValue);    
            
            
        //Are there any trader in indore?
            
       boolean IndoreBased =
                transactions.stream().anyMatch(transaction -> transaction.getTrader().getCity().equals("indore"));
                System.out.println(IndoreBased);

	}

}

package Collections;

public class date {

	static int month;
	static int day;
	static int year;


	public date(int month, int day, int year) { 
	this.day = day;
	this.month = month;
	this.year = year;
	}

	public static int getMonth() {
	return month;
	}

	public static int getDay() {
	return day;
	}

	public static int getYear() {
	return year;
	} 
   
  
   public String toString() {
	   return "" + day + ", " + month + " , " + year + "";
   }
   
    	
    }
 

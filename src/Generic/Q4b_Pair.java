package Generic;

import java.util.Date;

class P<key,date>{
	private key k;
	private date d;
	
	public P(key k, date d) {
		super();
		this.k = k;
		this.d = d;
	}

	public key getK() {
		return k;
	}

	public void setK(key k) {
		this.k = k;
	}

	public date getD() {
		return d;
	}

	public void setD(date d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "pair [k=" + k + ", d=" + d + "]";
	}
	
	
	
}
public class Q4b_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P<String, Date> p = null;
		java.util.Date javaDate = new java.util.Date();

        p = new P<String,Date>( "Today is ", new java.util.Date());
       

        System.out.println( "Pair is = " + p);
       
        

	}

}

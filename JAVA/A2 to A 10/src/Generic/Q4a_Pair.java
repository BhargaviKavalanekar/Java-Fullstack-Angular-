package Generic;

import java.util.LinkedList;

class pair<key,value>{
	
	private key k;
	private value v;
	
	public pair(key k, value v) {
		super();
		this.k = k;
		this.v = v;
	}

	public key getK() {
		return k;
	}

	public void setK(key k) {
		this.k = k;
	}

	public value getV() {
		return v;
	}

	public void setV(value v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "pair [k=" + k + ", v=" + v + "]";
	}
	
	
}


public class Q4a_Pair {

	public static void main(String[] args) {
		
		pair<String, String> p = null, p1 = null;

        p = new pair<String, String>( "1", "Hello");
        p1 = new pair<String, String>( "2", "Bye" );

        System.out.println( "1st Pair = " + p );
        System.out.println( "2nd pair = " + p1);
        
		
	}
	}



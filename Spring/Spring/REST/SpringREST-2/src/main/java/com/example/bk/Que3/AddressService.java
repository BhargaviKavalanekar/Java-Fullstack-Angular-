package com.example.bk.Que3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
	
	private List<Address> address= new ArrayList<Address>(Arrays.asList(
			new Address("400029","Maharastra","Mumbai","India"),
			new Address("400029","Maharastra","Mumbai","India")
			));
	
	public List<Address> getAllAddress(){
		return address;
	}
	
	public Address getOneAddress(String zipcode) {
		return address.stream().filter(A -> A.getZipcode().equals(zipcode)).findFirst().get();
	}

}

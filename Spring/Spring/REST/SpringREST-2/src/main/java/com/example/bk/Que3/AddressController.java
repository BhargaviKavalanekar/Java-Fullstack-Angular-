package com.example.bk.Que3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@RequestMapping(value="/all")
	public List<Address> getAll(){
		return addressService.getAllAddress();
	}

	@RequestMapping(value="/all/{zipcode}")
	public Address getOne(@PathVariable String zipcode) {
		return addressService.getOneAddress(zipcode);
	}
}

package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptops")
public class OnlineStoreController {

	@RequestMapping("/product")
	public String OnlineStore() {
		return "Mac book pro";
	}

	// @RequestMapping("/Lenovo")
	// public String Onlinestore() {
	// return "Lenovo Laptop";

	// }

	@GetMapping("/get")
	public List<OnlineStores> getAllLaptops()

	{
		System.out.println("jj");
		return Arrays.asList(new OnlineStores(123, "Lenovo", "Yang yuanquing"),
				new OnlineStores(123, "Apple", "Timcook"), new OnlineStores(123, "hp", "meg Whitman"));

	}
}

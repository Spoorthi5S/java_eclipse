package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/share")
public class FiComponent {
	
	public FiComponent() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(@RequestParam String foodname, @RequestParam String type, @RequestParam int Quantity,
			@RequestParam double Price) {
		System.out.println("Running the onSend:-");
		System.out.println("foodname :"+foodname);
		System.out.println("type :"+type);
		System.out.println("Quantity :"+Quantity);
		System.out.println("Price :"+Price);
		return "index.jsp";
	}

}

package com.xworkz.laser.component;

import org.springframework.stereotype.Component;

@Component
public class FiftyRupeeComponent {
	
	public FiftyRupeeComponent() {
		System.out.println("created "+ this.getClass().getSimpleName());
	}

}

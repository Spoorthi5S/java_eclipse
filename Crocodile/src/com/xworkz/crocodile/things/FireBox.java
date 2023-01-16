package com.xworkz.crocodile.things;

import org.springframework.stereotype.Component;

import com.xworkz.crocodile.interfac.Browser;
@Component
public class FireBox implements Browser {
	
	public FireBox() {
		System.out.println("Created fireBox no-args const...");
	}

	@Override
	public void browse() {
		System.out.println("override browse by fireBox..");

	}

}

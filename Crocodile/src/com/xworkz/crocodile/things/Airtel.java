package com.xworkz.crocodile.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.crocodile.interfac.Browser;
import com.xworkz.crocodile.interfac.Provider;
@Component
public class Airtel implements Provider {
	
	
	public Airtel() {
		System.out.println("Created Airtel no-args const by spring..");
	}

	@Override
	public void connect() {
		System.out.println("overriding connect by airtel");
	}

}

package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;
	@Autowired
	private Producer producer;
	
	public Movie() {
		System.out.println("Created Movie default const by spring");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.director.hashCode()+" hashcode of director" + this.cameraMan.hashCode()+" hashcode of cameraMan"+ this.producer.hashCode()+" hashcode of producer");
	}

}

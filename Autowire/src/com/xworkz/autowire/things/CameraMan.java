package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	
	public CameraMan() {
	System.out.println("created cameraMan const by spring");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.camera.hashCode()+"hashcode of camera");
	}

}

package com.xworkz.autowire.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	private Skill skill;
	
	public Experience() {
		System.out.println("Created experience const by spring");
	}
	
	public void checkPropertyRef() {
		System.out.println(this.skill.hashCode()+ "hashcode of skill");
	}

}

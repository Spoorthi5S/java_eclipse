package com.xworkz.autowire.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowire.bean.Hardwareshop;
import com.xworkz.autowire.bean.KITCollege;
import com.xworkz.autowire.bean.Pencil;
import com.xworkz.autowire.bean.Rubber;
import com.xworkz.autowire.bean.Software;
import com.xworkz.autowire.bean.SoftwareEngineer;
import com.xworkz.autowire.configuration.AutowireConfiguration;

public class AutowireRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(AutowireConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		
		System.out.println("=================================Hardwareshop================================");
		
		Hardwareshop refOfHardwareshop = container.getBean(Hardwareshop.class);
		System.out.println(refOfHardwareshop.getAddress());
		System.out.println(refOfHardwareshop.getGstNo());
		System.out.println(refOfHardwareshop.getId());
		System.out.println(refOfHardwareshop.getName());
		System.out.println(refOfHardwareshop.getOwnerName());
		
		System.out.println("=================================Software===============================");
		
		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware.getDate());
		System.out.println(refOfSoftware.getDeveloper());
		System.out.println(refOfSoftware.getName());
		System.out.println(refOfSoftware.getClass());
		System.out.println(refOfSoftware.getFree());
		
		System.out.println("================================SoftwareEngineer===================================");
		
		SoftwareEngineer refOfEng = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfEng.getCompanyName());
		System.out.println(refOfEng.getExperience());
		System.out.println(refOfEng.getName());
		System.out.println(refOfEng.getSalary());
		
		System.out.println("===================================Pencil==================================");
		
		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil.getColor());
		System.out.println(refOfPencil.getName());
		System.out.println(refOfPencil.getPrice());
		System.out.println(refOfPencil.getType());
		System.out.println(refOfPencil.getStolen());
		System.out.println(refOfPencil.getSharp());
		
		System.out.println("==================================Rubber==================================");
		
		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber.getColor());
		System.out.println(refOfRubber.getDuddu());
		System.out.println(refOfRubber.getName());
		System.out.println(refOfRubber.getSize());
		System.out.println(refOfRubber.getType());
		System.out.println(refOfRubber.getSharp());
		System.out.println(refOfRubber.getStolen());
		
		System.out.println("==================================KITCollege===================================");
		
		KITCollege refOfCollege = container.getBean(KITCollege.class);
		System.out.println(refOfCollege.getBranches());
		System.out.println(refOfCollege.getBranchStaff());
		System.out.println(refOfCollege.getCgpa());
		System.out.println(refOfCollege.getFees());
		System.out.println(refOfCollege.getName());
		System.out.println(refOfCollege.getSection());
		System.out.println(refOfCollege.getOfficeStaff());
		System.out.println(refOfCollege.getStudent());


	}

}

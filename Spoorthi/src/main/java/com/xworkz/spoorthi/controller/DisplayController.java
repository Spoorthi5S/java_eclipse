package com.xworkz.spoorthi.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spoorthi.dto.BeverageDTO;
import com.xworkz.spoorthi.dto.ChatDTO;
import com.xworkz.spoorthi.dto.EducationDTO;
import com.xworkz.spoorthi.dto.FamilyDTO;
import com.xworkz.spoorthi.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
	
	public DisplayController() {
System.out.println("Running DisplayController");
	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("running Email");
		model.addAttribute("spoorthi", "spoorthi.xworkz@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("running Mobile");
		long number=7892647108l;
		model.addAttribute("mobile",number);
		return "index.jsp";
	}
	
	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("running Aadhar");
		model.addAttribute("aadhar","4597 4165 9155");
		return "index.jsp";
	}
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running Age");
		int age=21;
		model.addAttribute("age",age);
		return "index.jsp";
	}
	@GetMapping("/dobTime")
	public String onDobTime(Model model) {
		System.out.println("running Dob with time");
		model.addAttribute("dobTime",LocalDateTime.of(2021, 02, 23, 8, 33));
		return "index.jsp";
	}
	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("running Dob with time");
		model.addAttribute("salary",3.4d);
		return "index.jsp";
	}
	@GetMapping("/BestFriends")
	public String onBestFriends(Model model) {
		System.out.println("running bestFriends");
		List<String> ref=new ArrayList<String>();
		ref.add("priyanka");
		ref.add("nayana");
		ref.add("shashank");
		ref.add("krishnaVeni");
		ref.add("tilak");
		model.addAttribute("prends", ref);
		return "index.jsp";
	}
	@GetMapping("/visitedPlace")
	public String onVisitedPlace(Model model) {
		System.out.println("running mostVisitedPlace");
		List<String> place=new ArrayList<String>();
		place.add("x-workz");
		place.add("bashyamCircle");
		place.add("kushiPg");
		place.add("OldXworkz");
		model.addAttribute("place", place);
		return "index.jsp";
	}
	
	@PostMapping("/place")
	public String onPlaces(Model model) {
		System.out.println("Running onPlaces");
		List<String> ref = new ArrayList<String>();
		ref.add("Bangalore");
		ref.add("Mangalore");
		ref.add("Udupi");
		model.addAttribute("place", ref);
		return "index.jsp";
	}

	@PostMapping("/skill")
	public String onskills(Model model) {
		System.out.println("Running onSkills");
		List<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("HTML");
		ref.add("Servlets");
		model.addAttribute("skill", ref);
		return "index.jsp";
	}

	@PostMapping("/education")
	public String onEducation(Model model) {
		System.out.println("Running onEducation");
		EducationDTO dto = new EducationDTO();
		dto.setQualification("BE in Computer science");
		dto.setSchoolName("Mary innaculate girls high school");
		dto.setBePercentage(78.7);
		dto.setBranch("Computer science");
		dto.setPuCollege("Akshara");
		dto.setPuPercentage(62.7);
		dto.setEngineeringCollege("Kalpataru institute of technology");
		dto.setLearntJava(true);
		dto.setSslcPercentage(60.64);
		dto.setTrainingInstitute("x-workz");
		model.addAttribute("info",dto);
		return "index.jsp";
	}
	
	@PostMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running onFamily");
		FamilyDTO dto = new FamilyDTO();
		dto.setFatherName("Suresh");
		dto.setGrandFather("Shomashekarappa");
		dto.setGrandMother("Leelavathi");
		dto.setLivesIn("Shivamoga");
		dto.setMarried(false);
		dto.setMotherName("Geetha");
		dto.setNoOfPeople(4);
		dto.setSiblingName("Sujan");
		dto.setSiblingRelation("Brother");
		dto.setSiblings(true);
		model.addAttribute("fam",dto);
		return "index.jsp";
	}
	
	@PostMapping("/mobiledto")
	public String onMobileDTO(Model model) {
		System.out.println("Running onMobileDTO");
		MobileDTO dto = new MobileDTO();
		dto.setCompany("Realme");
		dto.setDualSim(false);
		dto.setModel("note 5s");
		dto.setNoOfSim(1);
		dto.setSimCompany("jio");
		model.addAttribute("sim",dto);
		return "index.jsp";
	}
	
	@PostMapping("/juice")
	public String onJuice1(Model model) {
		System.out.println("Running onJuice");
		BeverageDTO dto = new BeverageDTO();
		dto.setAlcohol(false);
		dto.setBrand(" coco cola");
		dto.setColor("black");
		dto.setGoodForHealth(false);
		dto.setMadeOfFruit(false);
		dto.setPrice(40);
		dto.setQuantity(750);
		dto.setTastesGood(true);
		model.addAttribute("drink",dto);
		return "index.jsp";
	}
	
	@PostMapping("/chat")
	public String onChats(Model model) {
		System.out.println("Running onChats");
		ChatDTO dto = new ChatDTO();
		dto.setAvailable(true);
		dto.setDistance(3);
		dto.setGoodForHealth(false);
		dto.setLocation("bangalore");
		dto.setName("tikki puri");
		dto.setOwnerName("Darshan");
		dto.setPrice(30);
		dto.setShopClosesAt(LocalTime.of(10, 00));
		dto.setShopName("PreethiBekary");
		dto.setShopOpensAt(LocalTime.of(05, 00));
		dto.setTastesGood(true);
		model.addAttribute("chat",dto);
		return "index.jsp";
	}

}

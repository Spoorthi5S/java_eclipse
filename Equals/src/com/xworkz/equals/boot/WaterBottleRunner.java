package com.xworkz.equals.boot;

import com.xworkz.equals.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle waterbottle = new WaterBottle();
		waterbottle.setBrand("Cello");
		waterbottle.setCapType("normal");
		waterbottle.setColor("white");
		waterbottle.setDesign(false);
		waterbottle.setHotWater(false);
		waterbottle.setLiter(1);
		waterbottle.setPlastic(true);
		waterbottle.setSteel(false);
		waterbottle.setTwoLiter(false);
		waterbottle.setType("plastic");
		System.out.println(waterbottle);

		WaterBottle waterbottle1 = new WaterBottle("Milton", "glass", false, 2, true, "white", true, false, "normal",
				false);
		System.out.println(waterbottle1);

		boolean same = waterbottle.equals(waterbottle1);
		System.out.println(same);
	}

}

package com.xworkz.copy.overRiding.boot;

import com.xworkz.copy.overRiding.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		Moon moon =new Moon("moon", "0.0123 of Earth's", "1.022Km/s", "Lunar");
		moon.showOff();

	}

}

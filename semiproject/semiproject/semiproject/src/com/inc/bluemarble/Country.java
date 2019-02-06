package com.inc.bluemarble;

import javax.swing.ImageIcon;

public class Country {
	private double hotel = 10000;
	private double building = 8000;
	private double motel = 6000;
	
	private String name;
	private String owner = null;
	
	private ImageIcon image;
	
	public final static double korea = 0.2;
	public final static double usa = 0.3;
	public final static double bangladesh = 0.3;
	public final static double brazil = 0.3;
	public final static double canada = 0.3;
	public final static double chile = 0.3;
	public final static double china = 0.3;
	public final static double colombia = 0.3;
	public final static double finland = 0.3;
	public final static double france = 0.3;
	public final static double germany = 0.3;
	public final static double ghana = 0.3;
	public final static double india = 0.3;
	public final static double japan = 0.3;
	public final static double libya = 0.3;
	public final static double nepal = 0.3;
	public final static double newzealand = 0.3;
	public final static double nigeria = 0.3;
	public final static double pakistan = 0.3;
	public final static double peru = 0.3;
	public final static double poland = 0.3;
	public final static double russia = 0.3;
	public final static double saudiarabia = 0.3;
	public final static double singapore = 0.3;
	public final static double thailand = 0.3;
	public final static double unitedkingdom = 0.3;
	public final static double uruguay = 0.3;
	public final static double NO_COUNTRY = -1;

	public Country(String name, double city, ImageIcon image) {
		this.name = name;
		this.motel *= city;
		this.hotel *= city;
		this.building *= city;
		this.image = image;
	}

	public double getHotel() {
		return hotel;
	}

	public double getMotel() {
		return motel;
	}

	public double getBuilding() {
		return building;
	}

	public String getName() {
		return name;
	}

	public ImageIcon getImage() {
		return image;
	}
}

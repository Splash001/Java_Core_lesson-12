package ua.lviv.lgs.task1;

import ua.lviv.lgs.task1.Engine;
import ua.lviv.lgs.task1.Wheel;

public class Car implements Wheel, Engine {

	private String name;
	private int power;
	private int releaseDate;

	@Override
	public void engineCyllinders() {
		int cyllinder = (int) Math.random() * 12;
	}

	@Override
	public void wheelDiametr() {
		int diametr = (int) Math.random() * 15;
	}

	@Override
	public void wheelMaterial() {
		String material = "Shit";
	}

	public Car(String name, int power, int releaseDate, int cyllinder, int diametr, String material) {
		super();
		this.name = name;
		this.power = power;
		this.releaseDate = releaseDate;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Car manufacturer = " + name + ", Engine power = " + power + "horses, Release Date = " + releaseDate +"";
	}

}


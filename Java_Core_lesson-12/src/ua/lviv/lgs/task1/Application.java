package ua.lviv.lgs.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		List<Car> list1 = new ArrayList<>();
		list1.add(new Car("Chevrolet", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Silk"));
		list1.add(new Car("BMW", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Rubber"));
		list1.add(new Car("Renault", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Glue"));
		list1.add(new Car("Mercedes", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Sponge"));
		list1.add(new Car("Hyundai", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Pepper"));
		list1.add(new Car("Mazda", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Mint"));
		list1.add(new Car("Audi", getRandomValueFromRange(100, 350), getRandomValueFromRange(1960, 2020),
				getRandomValueFromRange(2, 12), getRandomValueFromRange(5, 15), "Blades"));
		
		for (Object object : list1) {
			System.out.println(object + " ; ");
		}
			
	}

	public static int getRandomValueFromRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("min value must be lower than max value");
		}

		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}

}

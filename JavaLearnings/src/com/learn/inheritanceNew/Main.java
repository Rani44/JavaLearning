package com.learn.inheritanceNew;

public class Main {
	public static void main (String [] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		Dog dog = new Dog ("Rocky",  8, 5, 2, 4, 1,20,"Long Silky");
		dog.eat();
		dog.walk();
		dog.run();
		
		Fish fish = new Fish("Golden fish", 3, 1, 2, 2, 4);
		//fish.moveMuscles();
		fish.swim(9);
		
	}

}

package fileIO;

import animal.Animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Mock1", 23,"qwerty");
		FileIOInterface fio = new FileIO();
		fio.saveToFile(animal);
		System.out.println((Animal)fio.loadFromFile());

	}

}

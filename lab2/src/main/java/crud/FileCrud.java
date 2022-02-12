package crud;

import animal.Animal;
import fileIO.FileIO;
import fileIO.FileIOInterface;

public class FileCrud implements Lab2CrudInterface {
	
	FileIOInterface fio;
	
	public FileCrud() {
		this.fio = new FileIO();
	}

	@Override
	public Animal readAnimal() {
		// TODO Auto-generated method stub
		return (Animal) fio.loadFromFile();
	}

	@Override
	public void updateAnimal(Animal animal) {
		// TODO Auto-generated method stub
		fio.saveToFile(animal);

	}

}

package mock;

import animal.Animal;
import crud.Lab2CrudInterface;

public class Lab2CrudMock implements Lab2CrudInterface {

	@Override
	public Animal readAnimal() {
		// TODO Auto-generated method stub
		return new Animal("Mock1", 23,"qwerty");
	}

	@Override
	public void updateAnimal(Animal animal) {
		// TODO Auto-generated method stub

	}

}

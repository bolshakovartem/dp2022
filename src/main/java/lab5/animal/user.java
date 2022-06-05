package lab5.animal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1")
public class user {
	@Id
	@GeneratedValue
	int id;
	String name;
	int age;
	
	
	public user() {
		
	}
	
	
	public user(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "{\"id\":"+id+",\"name\":\""+name+"\", \"age\":"+age+"}";
	}
	

}
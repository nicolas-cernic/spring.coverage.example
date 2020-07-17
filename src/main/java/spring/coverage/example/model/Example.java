package spring.coverage.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Example {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int value;
	
	public Example(int id, String name, int value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public Example() {
		super();
	}

	@Override
	public String toString() {
		return "Example [id=" + id + ", name=" + name + ", value=" + value + "]";
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}

package kr.ac.kopo.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Car {
	private String no;
	private String model;
	
	public Car(String no, String model) {
		this.no = no;
		this.model = model;
	}
}

class Person extends Object {
	private String name;
	private String phone;

	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	

	/*
	@Override
	public boolean equals(Object obj) {
		
		if(this.name == null || this.phone == null)
			return false;
		
		Person p = (Person)obj;
		
		if(this.name.equals(p.name) 
				&& this.phone.equals(p.phone)) {
			return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return 9999999;
	}
	*/
	
	
}

public class MapMain02 {

	public static void main(String[] args) {

		Map<Person, Car> map = new HashMap<Person, Car>();
		
		map.put(new Person("홍길동", "010-1111-2222"),
					new Car("12가3456", "소나타"));
		
		map.put(new Person("홍길순", "010-3333-4444"), 
					new Car("34너5678", "싼타페"));
		
		map.put(new Person("홍길동", "010-5555-6666"), 
					new Car("55다2763", "모닝"));
		
		map.put(new Person("홍길동", "010-1111-2222"),
					new Car("11라3333", "제네시스"));
		
		System.out.println("등록된 차량개수 : " + map.size());
	}
}

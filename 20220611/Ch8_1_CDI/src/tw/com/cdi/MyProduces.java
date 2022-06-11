package tw.com.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import tw.com.bean.Fruit;

public class MyProduces {
	@Produces
	@Named("myFruit")
	private Fruit getMyFruit() {
		Fruit fruit = new Fruit("Apple",60);
		return fruit;
	}
	
	@Produces
	@Named("myFruit2")
	private Fruit getMyFruit2() {
		Fruit fruit = new Fruit("Charry",95);
		return fruit;
	}
}

package abst.domain;

public class SmartPhone extends Phone {
	
	
	public SmartPhone(String name) {
		super(name);
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 부팅합니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 Shoudown 합니다.");
	}


}

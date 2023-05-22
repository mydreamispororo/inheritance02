package abst.domain;

public abstract class Phone {
	String name;
	
	
	//클래스 이름에 abstract 강제성 
	public Phone(String name) {
		this.name = name;
	}
	
	//추상화(abstract)는 본체(중괄호)가 없습니다. 접근제한 리턴타입 메소드(파라미터)는 그대로 사용하고 내용만 바
	public abstract void turnOn();
	public abstract void turnOff();

}

package abstract2;

public class Cat extends Animal { //오버라이딩 할 때 하나라도 빠지면 안됨, 안쓰고 싶어도 가져는 와야됨.

	@Override
	public void eat() {
		System.out.println("고양이가 밥을 먹습니다.");
	}

	@Override
	public void sound() {
		System.out.println("고양이가 웁니다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	
}

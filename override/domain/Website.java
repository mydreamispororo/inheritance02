package override.domain;

public class Website extends Company {

	@Override
	public void login() {
		System.out.println("영업부 사이트 로그인 합니다.");
	}

	@Override
	public void logout() {
		System.out.println("영업부 사이트에서 로그아웃 합니다.");
	}

	@Override
	public void turnOn() {
		super.turnOn();
	}

	@Override
	public void turnOff() {
		super.turnOff();
	}
	

	
}

package myobj;

public class HealthCare extends Program{
	int walk = 0;
	public void create() {
		System.out.println("새로운 사람의 정보를 등록하는 기능");
	}
	
	public void read() {
		System.out.println("개인 정보, 예전 운동기록, 기초대사량 등을 조회");
	}
	
	public void update() {
		System.out.println("개인 정보를 수정하는 기능");
	}
	
	public void delete() {
		System.out.println("개인 정보를 삭제하는 기능");
	}
	
	public void walk() {
		walk++;
	}
	public void run() {
		walk += 3;
	}
	public void burn() {
		System.out.println("오늘 하루 소모한 칼로리를 계산하는 기능");
	}
}

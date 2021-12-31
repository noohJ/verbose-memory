package myobj;

public class Program {
	public void create() {
		System.out.println("CREATE");
	}
	public void read() {
		System.out.println("READ");
	}
	public void update() {
		System.out.println("UPDATE");
	}
	public void delete() {
		System.out.println("DELETE");
	}
	
	public static void main(String[] args) {
		Program p = new HealthCare();
		
		p.create();
		p.read();
		p.update();
		p.delete();
	}
}

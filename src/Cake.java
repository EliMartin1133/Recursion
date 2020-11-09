
public class Cake {
	
	private int bites = 10;
	
	public Cake() {
		//nothing needed
	}
	
	public void takeABite() {
		bites = bites - 1;
		System.out.println("yum");
	}

	public boolean isEmpty() {
		return bites == 0;
	}
	
	
}

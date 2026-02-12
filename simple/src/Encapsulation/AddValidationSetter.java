package Encapsulation;

public class AddValidationSetter {

	private int mark;
	private String name;
	
	public void setMark(int mark) {
		if(mark < 35) {
			System.out.println("Enabled to add marks because you are fail.");
			return;
		}
		
		this.mark = mark;
		System.out.println("Marks add successfully.");
	}	
	
}

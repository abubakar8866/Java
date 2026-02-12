package accessModifier;

public class AccessModifierPriority {

	public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
    	System.out.println(b);
        System.out.println(a);
        System.out.println(d);
        System.out.println(c);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AccessModifierPriority().display();
	}

}

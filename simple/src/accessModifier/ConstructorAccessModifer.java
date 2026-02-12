package accessModifier;

public class ConstructorAccessModifer {
	
	public ConstructorAccessModifer() {
        System.out.println("Public constructor");
    }

    protected ConstructorAccessModifer(int a) {
        System.out.println("Protected constructor");
    }

    ConstructorAccessModifer(double d) {
        System.out.println("Default constructor");
    }

    private ConstructorAccessModifer(String s) {
        System.out.println("Private constructor");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorAccessModifer();
        new ConstructorAccessModifer(10);
        new ConstructorAccessModifer(10.5);
        // new ConstructorDemo("Hi"); not accessible
	}

}

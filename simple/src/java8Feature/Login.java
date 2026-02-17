package java8Feature;

@FunctionalInterface
public interface Login {

	Boolean valid(String username,String password);
	
}

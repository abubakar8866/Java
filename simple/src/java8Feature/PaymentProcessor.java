package java8Feature;

@FunctionalInterface
public interface PaymentProcessor {

	Integer	paymentProcess(Integer id,String name);
	
}

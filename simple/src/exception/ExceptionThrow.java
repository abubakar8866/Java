package exception;

public class ExceptionThrow {

	public int[] arr = new int[1];
	
	public void mtd() throws ArrayIndexOutOfBoundsException {
		System.out.println(this.arr[2]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		try {			
			int c = 2/0;
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			/*try {
				int d = 2/0;				
			} catch (Exception e2) {
				e.printStackTrace();
			}*/
			int d = 2/0;
			e.printStackTrace();
		} finally {
			//System.exit(0);
			System.out.println("Always run..");
		}
		System.out.println("program run..");
		/*ExceptionThrow ex = new ExceptionThrow();
		try {
			ex.mtd();			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

}

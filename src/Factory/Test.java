package Factory;

public class Test {

	public static void main(String[] args) {
		IFactory factory = new UndergraduateFactory();
        LiFeng student = factory.CreateLiFeng();
        
        student.Buy();
	}

}

package Factory;

public class UndergraduateFactory implements IFactory{

	@Override
	public LiFeng CreateLiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}


}

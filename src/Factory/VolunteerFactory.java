package Factory;

public class VolunteerFactory implements IFactory{

	@Override
	public LiFeng CreateLiFeng() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

	

}

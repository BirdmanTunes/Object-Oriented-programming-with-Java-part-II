package week11._039_AxeClickEffect.applicationlogic;

public class PersonalCalculator implements Calculator{
	
	private int value;
	
	public PersonalCalculator() {
		value=1;
	}

	@Override
	public int giveValue() {
		return value;
	}

	@Override
	public void increase() {
		value++;
	}

}

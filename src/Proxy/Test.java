package Proxy;

public class Test {

	public static void main(String[] args) {
		
		Girl jGirl = new Girl();
		jGirl.setName("小华");
		
		Proxy proxy = new Proxy(jGirl);
		proxy.GiveDolls();
		proxy.GiveChocolate();
		proxy.GiveFlowers();
	}

}

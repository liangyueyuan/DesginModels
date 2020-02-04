package Proxy;

//追求者
public class ZhuiQiuZhe implements GiveGit{

	Girl girl;
	public ZhuiQiuZhe(Girl girl) {
		super();
		this.girl = girl;
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		System.out.println("送玩偶");
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		System.out.println("送花");
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		System.out.println("送巧克力");
	}

	

}

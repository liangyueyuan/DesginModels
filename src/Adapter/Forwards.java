package Adapter;

public class Forwards extends Player{

	private  String name;
	public Forwards(String name) {
		// TODO Auto-generated constructor stub
	   super(name);
	   this.name = name;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("前锋   "+name+"  进攻" );
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("前锋   "+name+"  防守");
	}

}

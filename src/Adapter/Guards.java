package Adapter;

public class Guards extends Player{

	private String name;
	public Guards(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.name = name;
	}

	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		System.out.println("后卫   "+name+"  进攻" );
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("后卫   "+name+"  进攻" );
	}

}

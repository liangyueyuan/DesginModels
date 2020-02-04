package Adapter;

import java.beans.IntrospectionException;

public class Center extends Player{

	private String name;
	public Center(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void Attack() {
		short s=1;
		// TODO Auto-generated method stub
		System.out.println("中锋   "+name+"  进攻" );
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		System.out.println("中锋   "+name+"  进攻" );
	}

}

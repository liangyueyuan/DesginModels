package Adapter;

//球员
public abstract class Player {

	private String name;
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;		
	}
    
	//进攻  防守方法
	public abstract void Attack();
	public abstract void Defense();
}

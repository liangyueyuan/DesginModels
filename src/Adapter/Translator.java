package Adapter;


//翻译君
public class Translator extends Player{

	//翻译类需要在内部实例化一个"外籍中锋"的对象   表明两者是有关系的
	private ForeignCenter foreignCenter = new ForeignCenter();
	public Translator(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		foreignCenter.setName(name);
	}

	//翻译者告诉外籍选手是否进攻和防守
	@Override
	public void Attack() {
		// TODO Auto-generated method stub
		foreignCenter.jingong();
	}

	@Override
	public void Defense() {
		// TODO Auto-generated method stub
		foreignCenter.fangshou();
	}

}

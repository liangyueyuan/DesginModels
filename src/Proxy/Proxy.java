package Proxy;


//代理类
public class Proxy implements GiveGit{

	//创建实体类的引用
	ZhuiQiuZhe zhuiQiuZhe;
	public Proxy(Girl girl) {
		zhuiQiuZhe = new ZhuiQiuZhe(girl);
	
	}

	@Override
	public void GiveDolls() {
		// TODO Auto-generated method stub
		zhuiQiuZhe.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		// TODO Auto-generated method stub
		zhuiQiuZhe.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		// TODO Auto-generated method stub
		zhuiQiuZhe.GiveChocolate();
	}

	
}

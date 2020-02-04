package Adapter;

public class Test {

  public static void main(String[] args) {
	
	Player aPlayer = new Forwards("小明");
	aPlayer.Attack();
	
	Player bpPlayer = new Guards("小狐");
	bpPlayer.Defense();
	
	//外籍中锋需要通过翻译君给他解释指令
	Player cPlayer = new Translator("姚明");
	cPlayer.Attack();
	cPlayer.Defense();

	
}
}

package Singleton;

//饿汉模式

/*在该模式下，当虚拟机启动，该类的实例化对象就会被自动创建*/
public class HungerModel {

	//需要构造该类的私有的构造方法   目的是为了防止外边的对该类的多次实例化
	private HungerModel(){}
	
	//在该类自己先实例化一个对象   
   private static HungerModel hungerModel= new HungerModel();
   
   //给外边类提供该类实例化的静态构造方法
   public static HungerModel getHungerModel(){
	return hungerModel;
	   
   }
   
}

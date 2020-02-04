package Singleton;

//懒汉模式
//即要加载的时候才实例化对象  构造一个延迟机制 
//缺点  该程序会引发线程安全问题  

public final class LazyModel {

	private LazyModel() {
		// TODO Auto-generated constructor stub
	}

	private static LazyModel lazyModel = null;
	
	public static LazyModel gLazyModel(){
		//判断该类是否已经有实例化的对象  没有则创建实例 
		if(lazyModel == null){
			lazyModel = new LazyModel();
		}
		return lazyModel;
		
	}
}

package Singleton;

public class LazyModel_2 {

	private LazyModel_2() {
		// TODO Auto-generated constructor stub
	}

	private static LazyModel_2 lazyModel_2 = null;
	
	public static LazyModel_2 gLazyModel_2(){
		//先判断实例是否存在  不存在则需要加锁  只让一个线程进行
		if(lazyModel_2 == null){
			synchronized (lazyModel_2) {
				
				//这里必须加判断   当两个线程同时调用gLazyModel_2的方法时，两个线程都可以通过第一个判断，此时进入加锁
				//另外一个线程在外边等待，当第一个线程执行完后，如果没有这个判断，那么第二个线程依旧可以实例化一个新的对象
				if(lazyModel_2 == null){
					lazyModel_2 = new LazyModel_2();
				}
			}
		}
		
		return lazyModel_2;
		
		
	}
	
}

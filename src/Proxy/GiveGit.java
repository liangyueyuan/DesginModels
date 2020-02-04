package Proxy;

/*代理模式：  是将真实类和代理类的想要做的方法用一个接口将其封装起来，
 *         真实类和代理类都需要实现该接口，且代理类需要保存一个引用使得代理可以访问实体
 * */
public interface GiveGit {

	void GiveDolls();
	void GiveFlowers();
	void GiveChocolate();
}

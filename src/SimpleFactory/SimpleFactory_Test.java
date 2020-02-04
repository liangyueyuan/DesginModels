package SimpleFactory;
//简单工厂模式
public class SimpleFactory_Test {

	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		LiFeng student = simpleFactory.CreateLiFeng("学雷锋的学生");
		student.Wash();
	}
}

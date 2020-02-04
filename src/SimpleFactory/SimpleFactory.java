package SimpleFactory;

//简单工厂类
public class SimpleFactory {

	//构建方法
	public static LiFeng CreateLiFeng(String type){
		
		LiFeng result = null;
		switch (type) {
		case "学雷锋的学生":
			 result = new Undergraduate();
			break;
			
        case "社区志愿者":
        	result =  new Volunteer();
		    break;
        	
		default:
			break;
		}
		return result;
		
	}

}

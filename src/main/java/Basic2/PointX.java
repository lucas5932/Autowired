package Basic2;

import org.springframework.stereotype.Component;
// 객체를 만들때 사용하는 어노테이션
@Component("PointX")
public class PointX implements Shape{

	public PointX() {
		System.out.println("PointX()");
	}
	
	@Override
	public String make() {
		return "X를 만들다.";
	}

	@Override
	public String delete() {
		return "X를 지우다";
	}

}

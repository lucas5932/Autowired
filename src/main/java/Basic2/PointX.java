package Basic2;

import org.springframework.stereotype.Component;
// ��ü�� ���鶧 ����ϴ� ������̼�
@Component("PointX")
public class PointX implements Shape{

	public PointX() {
		System.out.println("PointX()");
	}
	
	@Override
	public String make() {
		return "X�� �����.";
	}

	@Override
	public String delete() {
		return "X�� �����";
	}

}

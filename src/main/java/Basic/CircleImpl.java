package Basic;

public class CircleImpl implements Circle{

	Shape pointx;
	int x;
	int y;
	int radius;
	
	public Shape getPointx() {
		return pointx;
	}
	public void setPointx(Shape pointx) {
		this.pointx = pointx;
		System.out.println("setPointX(Shape pointx)");
	}
	
	public CircleImpl() {
		System.out.println("CircleImpl()");
	}
	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public String make() {
		return pointx.make();
	}

}

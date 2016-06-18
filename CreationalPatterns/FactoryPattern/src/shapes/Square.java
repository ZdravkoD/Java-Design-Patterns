package shapes;

public class Square implements Shape {

	@Override
	public Shape setFillColor(int Color) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public Shape setBorderColor(int Color) {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + getClass().getSimpleName() + "!");
	}

}

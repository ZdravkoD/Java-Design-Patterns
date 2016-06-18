package shapes;

public class Square implements Shape {

	private int FillColor;
	private int BorderColor;
	
	@Override
	public Shape setFillColor(int Color) {
		FillColor = Color;
		return this;
	}

	@Override
	public Shape setBorderColor(int Color) {
		BorderColor = Color;
		return this;
	}

	@Override
	public void draw() {
		System.out.println("Drawing " + getClass().getSimpleName() + "! FillColor: " + FillColor + ", BorderColor: "
				+ BorderColor);
	}

}

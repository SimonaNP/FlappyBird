import java.awt.Color;

public class FlappyBird extends MovingObject {
	Color color;

	public FlappyBird(int width, int height, double speed) {
		super(width, height, speed);

	}

	public void setColor(Color color) {
		this.color = color;
	}
}

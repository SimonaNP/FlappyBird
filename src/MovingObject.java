
public class MovingObject extends GameObject {
	double speed;
	int step = 1;

	public MovingObject(int width, int height, double speed) {
		super(width, height);
		this.speed = speed;

	}

	public void setStep(int step) {
		this.step = step;
	}

}

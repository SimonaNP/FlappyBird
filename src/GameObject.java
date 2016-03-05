
public class GameObject {
	int width;
	int height;
	int x;
	int y;

	public GameObject(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

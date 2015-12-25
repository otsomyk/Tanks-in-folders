package tank.objects;

import java.awt.Graphics;

import tank.behavior.Destroyable;
import tank.behavior.Drawable;

public class ObjectField implements Drawable, Destroyable {

	protected int x;
	protected int y;

	public ObjectField(int y, int x) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public void destroy() {

	}

	@Override
	public void draw(Graphics g) {

	}

	@Override
	public boolean isDestroyed() {
		
		return false;
	}

}

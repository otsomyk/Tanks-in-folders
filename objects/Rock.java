package tank.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Rock extends ObjectField {

	public Rock(int y, int x) {
		super(y, x);

	}

	@Override
	public void destroy() {
		setX(-100);
		setY(-100);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.GRAY);
		g.fillRect(x, y, 64, 64);
	}

}

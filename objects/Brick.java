package tank.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Brick extends ObjectField {

	public Brick(int y, int x) {
		super(y, x);
	}

	@Override
	public void draw(Graphics g) {

		g.setColor(Color.RED);
		g.fillRect(x, y, 64, 64);
	}

}

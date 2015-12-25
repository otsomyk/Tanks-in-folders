package tank.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Eagle extends ObjectField{

	public Eagle(int y, int x) {
		super(y, x);
		
	}
	
	@Override
	public void destroy() {
		setX(-100);
		setY(-100);
	}
	
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(getX(), getY(), 64, 64);
	}
	

}

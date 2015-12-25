package tank.objects;

import java.awt.Color;
import java.awt.Graphics;

public class Water extends ObjectField{

	public Water(int y, int x) {
		super(y, x);
		
	}
	
	 @Override
	    public void draw(Graphics g) {

	        g.setColor(Color.BLUE);
	        g.fillRect(x, y, 64, 64);
	 }

}

package tank.tanks;

import tank.behavior.ActionField;
import tank.behavior.Direction;
import tank.objects.BattleField;


public class Tank extends AbstractTank {
	
	public Tank(ActionField af, BattleField bf) {
		super(af, bf);
		
	}

	private int speed = 10;

	// current position on BF
	private int X;
	private int Y;
	private Direction direction;
	private Bullet bullet;

	private ActionField af;
	private BattleField bf;
	private TankColor color;
	private int crew;
	private int maxSpeed;
	private boolean COLORDED_MODE = false;

	public TankColor getColor() {
		return color;
	}

	public int getCrew() {
		return crew;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void turn(Direction direction) throws Exception {
		this.direction = direction;
		af.processTurn(this);
	}

	public void move() throws Exception {
		af.processMove(this);
	}

	public void destroy() {
		X = -100;
		Y = -100;
	}

	public void fire() throws Exception {
		Bullet bullet = new Bullet(X + 25, Y + 25, getDirection());
		af.processFire(bullet);
	}

	public void moveRandom() throws Exception {
		int rnd = (int) (System.currentTimeMillis() / 100) % 5;
		while (true) {
			if (rnd == 1) {
				turn(Direction.UP);
				move();
			} else if (rnd == 2) {
				turn(Direction.DOWN);
				move();
			} else if (rnd == 3) {
				turn(Direction.LEFT);
				move();
			} else {
				turn(Direction.RIGHT);
				move();

				Thread.sleep(speed);

			}
		}
	}

	public void updateX(int x) {
		this.X += x;
	}

	public void updateY(int y) {
		this.Y += y;
	}

	public Direction getDirection() {
		return direction;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public int getSpeed() {
		return speed;
	}

}
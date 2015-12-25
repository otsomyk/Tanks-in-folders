package tank.tanks;

import tank.behavior.ActionField;
import tank.behavior.Direction;
import tank.objects.BattleField;


public class T34 extends AbstractTank {

	public T34(ActionField af, BattleField bf) {
		super(af, bf);

	}

	public T34(ActionField af, BattleField bf, int x, int y, Direction direction) {
		super(af, bf, x, y, direction);

	}

}

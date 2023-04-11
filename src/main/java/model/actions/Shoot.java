package model.actions;

import model.Bullet;
import model.Game;
import model.Movable;
import model.Tank;

public class Shoot implements Action {

	@Override
	public void apply(Movable movable) {
		Bullet bullet = ((Tank) movable).shoot();
		// Bullet bullet = new
		// Bullet(tank.getDirection().getNextPotencialPosition(tank),
		// tank.getDirection());
		Game.getInstance().getLevel().getMap().appendEntity(bullet);
		Game.getInstance().getLevel().getMap().addObserver(bullet);
	}
}
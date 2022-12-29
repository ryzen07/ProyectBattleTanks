package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Tank;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class TankView extends JPanel implements Observer {

	private final Tank tank;
	Direction left = new Left();
	Direction right = new Right();
	Direction up = new Up();
	Direction down = new Down();

	public TankView(Tank tank) {
		this.tank = tank;
		setBackground(Color.red);
		paintTank();
	}

	@Override
	public void update(Observable o, Object arg) {
		paintTank();
	}

	private void paintTank() {
		if (tank.getDirection().isHorizontal()) {
			setBounds(tank.getCenter().getY(), tank.getCenter().getX(), Tank.MINOR_RADIUS, Tank.MAJOR_RADIUS);

		} else if (!tank.getDirection().isHorizontal()) {
			setBounds(tank.getCenter().getX(), tank.getCenter().getY(), Tank.MAJOR_RADIUS, Tank.MINOR_RADIUS);
		}
	}
}
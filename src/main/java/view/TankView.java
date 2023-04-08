package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Movable;
import model.directions.Direction;

public class TankView extends JPanel implements Observer {

	private final Movable tank;
	Direction left = Direction.getLeftDirection();
	Direction right = Direction.getRightDirection();
	Direction up = Direction.getUpDirection();
	Direction down = Direction.getDownDirection();

	public TankView(Movable tank) {
		this.tank = tank;
		setBackground(Color.red);
		paintTank();
	}

	@Override
	public void update(Observable o, Object arg) {
		paintTank();

	}

	private void paintTank() {
		setBounds(tank.getMinorX(), tank.getMinorY(), tank.getXRadius(), tank.getYRadius());
	}
}
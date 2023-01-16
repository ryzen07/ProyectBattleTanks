package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Movable;
import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class TankView extends JPanel implements Observer {

	private final Movable tank;
	Direction left = new Left();
	Direction right = new Right();
	Direction up = new Up();
	Direction down = new Down();

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
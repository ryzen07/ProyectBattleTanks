package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Tank;

public class TankView extends JPanel implements Observer {

	private final Tank tank;

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
		setBounds(tank.getCenter().getX(), tank.getCenter().getY(), Tank.MAJOR_RADIUS, Tank.MINOR_RADIUS);
		tank.Imprimir();
	}
}
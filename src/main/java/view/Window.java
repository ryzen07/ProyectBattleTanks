package view;

import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import model.Constants;
import model.Tank;

public class Window extends JFrame {
	private final TankView tankView;

	public Window(Tank tank) {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel content = new JPanel();
		tankView = new TankView(tank);
		content.add(tankView);
		content.setSize(Constants.WINDOWS_WIDTH, Constants.WINDOWS_HEIGHT);
		content.setLayout(null);
		setContentPane(content);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public Observer getTankView() {
		return tankView;
	}
}
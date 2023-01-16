package view;

import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import model.Board;
import model.Constants;
import model.Movable;

public class Window extends JFrame {
	private final TankView tankView;
	private final BoardView boardView;

	public Window(Movable tank, Board board) {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// setBounds(100, 100, 450, 300);
		setBounds(0, 0, 0, 0);
		JPanel content = new JPanel();
		tankView = new TankView(tank);
		boardView = new BoardView(board);
		content.add(tankView);
		content.add(boardView);
		content.setSize(Constants.WINDOWS_WIDTH, Constants.WINDOWS_HEIGHT);
		content.setLayout(null);
		// setContentPane(content);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public Observer getTankView() {
		return tankView;
	}

	public Observer getBoardView() {
		return boardView;
	}
}
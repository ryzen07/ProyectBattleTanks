package view;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.Board;
import model.Constants;

public class BoardView extends JPanel implements Observer {

	private final Board board;

	public BoardView(Board board) {
		this.board = board;
		setBackground(Color.blue);
		paintBoard();
	}

	@Override
	public void update(Observable o, Object arg) {
		paintBoard();
	}

	private void paintBoard() {
		setBounds(getX(), getY(), Constants.SQUARE_HEIGHT, Constants.SQUARE_WIDTH);
	}
}
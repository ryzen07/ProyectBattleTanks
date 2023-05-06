package model;

import java.util.ArrayList;

import model.directions.Direction;
import model.directions.Down;
import model.directions.Left;
import model.directions.Right;
import model.directions.Up;

public class Constants {
	public static int WINDOWS_HEIGHT = 500;
	public static int WINDOWS_WIDTH = 700;
	public static final int SQUARE_HEIGHT = 25;
	public static final int SQUARE_WIDTH = 25;

	public static final ArrayList<Direction> DIRECTIONS = new ArrayList<>();
	static {
		DIRECTIONS.add(Down.getInstance());
		DIRECTIONS.add(Up.getInstance());
		DIRECTIONS.add(Left.getInstance());
		DIRECTIONS.add(Right.getInstance());
	}
}

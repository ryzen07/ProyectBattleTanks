package model.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import model.Movable;
import model.Position;

public abstract class Direction {

	private static final ArrayList<Direction> DIRECTIONS = Lists.newArrayList(Up.getInstance(), Down.getInstance(),
			Left.getInstance(), Right.getInstance());
	private static Direction directionUp = Up.getInstance();
	private static Direction directionDown = Down.getInstance();
	private static Direction directionLeft = Left.getInstance();
	private static Direction directionRight = Right.getInstance();

	public void apply(Movable movable) {
		movable.setDirection(this);
		move(movable);
	}

	public static List<Direction> getDirections() {
		return DIRECTIONS;
	}

	public static Direction getUpDirection() {
		return directionUp;
	}

	public static Direction getDownDirection() {
		return directionDown;
	}

	public static Direction getLeftDirection() {
		return directionLeft;
	}

	public static Direction getRightDirection() {
		return directionRight;
	}

	public abstract boolean isHorizontal();

	protected abstract void move(Movable movable);

	public abstract Position getNextPotencialPosition(Movable movable);

}
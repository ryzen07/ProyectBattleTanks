package model.directions;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import model.Movable;
import model.Position;

public abstract class Direction {

	private static final ArrayList<Direction> DIRECTIONSNEW = new ArrayList<>();
	static {
		DIRECTIONSNEW.add(Down.getInstance());
		DIRECTIONSNEW.add(Up.getInstance());
		DIRECTIONSNEW.add(Left.getInstance());
		DIRECTIONSNEW.add(Right.getInstance());

	}
	private static final ArrayList<Direction> DIRECTIONS = Lists.newArrayList(Up.getInstance(), Down.getInstance(),
			Left.getInstance(), Right.getInstance());

	public void apply(Movable movable) {
		movable.setDirection(this);
		move(movable);
	}

	public static List<Direction> getDirections() {
		return DIRECTIONSNEW;
	}

	public abstract boolean isHorizontal();

	protected abstract void move(Movable movable);

	public abstract Position getNextPotencialPosition(Movable movable);

}
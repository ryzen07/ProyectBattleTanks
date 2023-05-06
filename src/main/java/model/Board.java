package model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Observable;

public class Board extends Observable {

	Square matrix[][] = new Square[Constants.SQUARE_HEIGHT][Constants.SQUARE_WIDTH];

	public Board() {
		for (int x = 0; x < Constants.SQUARE_HEIGHT; x++) {
			for (int y = 0; y < Constants.SQUARE_WIDTH; y++) {
				matrix[x][y] = new Square();
			}
		}
	}

	public boolean checkInBoardBounds(int minorX, int mayorX, int minorY, int mayorY) {
		if (minorX < 0) {
			return false;
		}
		if (mayorX > Constants.SQUARE_WIDTH - 1) {
			return false;
		}
		if (minorY < 0) {
			return false;
		}
		if (mayorY > Constants.SQUARE_HEIGHT - 1) {
			return false;
		}
		return true;
	}

	public void appendEntity(Entity entity) throws EntityOutOfRangeException {
		if (checkInBoardBounds(entity.getMinorX(), entity.getMajorX(), entity.getMinorY(), entity.getMajorY())) {
			for (int x = entity.getMinorX(); x <= entity.getMajorX(); x++) {
				for (int y = entity.getMinorY(); y <= entity.getMajorY(); y++) {
					matrix[x][y].add(entity);
				}
			}
		} else {
			throw new EntityOutOfRangeException();
		}
	}

	public void removeEntity(Entity entity) {
		for (int i = entity.getMinorX(); i <= entity.getMajorX(); i++) {
			for (int j = entity.getMinorY(); j <= entity.getMajorY(); j++) {
				if (matrix[i][j].contains(entity)) {
					matrix[i][j].remove(entity);
				}
			}
		}
	}

	public Square get(int x, int y) {
		return matrix[x][y];
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = matrix[0].length - 1; i >= 0; i--) {
			for (Square[] element : matrix) {
				sb.append(element[i]).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private Collection<Entity> getCollisionEntities(Movable movable) {
		Collection<Entity> entities = new HashSet<>();
		for (int i = movable.getPotentialMinorX(); i <= movable.getPotentialMajorX(); i++) {
			for (int j = movable.getPotentialMinorY(); j <= movable.getPotentialMajorY(); j++) {
				entities.addAll(matrix[i][j].getEntities());
			}
		}
		entities.remove(movable);
		return entities;
	}

	public void move(Movable movable) {
		if (checkInBoardBounds(movable.getPotentialMinorX(), movable.getPotentialMajorX(), movable.getPotentialMinorY(),
				movable.getPotentialMajorY())) {
			Collection<Entity> collisionEntities = getCollisionEntities(movable);

			InteractionManager interactionManager = new InteractionManager();

			for (Entity entity : collisionEntities) {
				interactionManager.add(movable.interact(entity));
			}
			if (interactionManager.canMove()) {
				removeEntity(movable);
				movable.doMove();
				appendEntity(movable);
			}
		}
	}

	/*
	 * public void update() { setChanged(); notifyObservers(); }
	 */
}

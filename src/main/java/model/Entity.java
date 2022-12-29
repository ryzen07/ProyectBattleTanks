package model;

import java.util.Observable;

public abstract class Entity extends Observable {
	protected Position center;
	private final int majorRadius, minorRadius;
	public boolean move = true;

	public Entity(Position center, int majorRadius, int minorRadius) {
		this.center = center;
		this.majorRadius = majorRadius;
		this.minorRadius = minorRadius;
	}

	protected int getXRadius() {
		return majorRadius;
	}

	protected int getYRadius() {
		return minorRadius;
	}

	public int getMinorX() {
		return center.getX() - getXRadius();
	}

	public int getMayorX() {
		return center.getX() + getXRadius();
	}

	public int getMinorY() {
		return center.getY() - getYRadius();
	}

	public int getMayorY() {
		return center.getY() + getYRadius();
	}

	public void Imprimir() {
		System.out.println(getMayorY());
		/*
		 * System.out.println(getMayorX()); System.out.println(getMinorY());
		 * System.out.println(getMayorY());
		 */
	}

	public boolean getMove() {
		return move;
	}

	public boolean setMove(boolean move) {
		this.move = move;
		return move;
	}

	public Position getPosition() {
		return center;
	}

	@Override
	public String toString() {
		return "#";
	}
}
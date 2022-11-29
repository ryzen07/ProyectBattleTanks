package controller;

import model.Board;
import model.Bullet;
import model.Direction;
import model.Position;
import model.Tank;

public class Main {
	public static void main(String[] args) {
		Board mapatest = new Board();
		Tank tanke = new Tank(Direction.LEFT, 10, 10);
		Bullet bullet = new Bullet(new Position(2, 3), Direction.LEFT);
		mapatest.add(tanke);
		mapatest.add(bullet);
		System.out.println(mapatest);
	}
}
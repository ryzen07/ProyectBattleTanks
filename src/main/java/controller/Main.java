package controller;

import model.Board;
import model.Bullet;
import model.Direction;
import model.Position;
import model.Tank;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Board mapatest = new Board();
		Tank tanke = new Tank(Direction.UP, 5, 5);
		Bullet bullet = new Bullet(new Position(2, 3), Direction.LEFT);
		mapatest.add(bullet);
		mapatest.add(tanke);
		mapatest.remove(tanke);
		mapatest.move(tanke);
		System.out.println(mapatest);
	}
}
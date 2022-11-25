package controller;

import model.Board;
import model.Direction;
import model.Tank;

public class Main {
	public static void main(String[] args) {
		Board mapatest = new Board();
		Tank tanke = new Tank(Direction.UP, 2, 2);
		mapatest.add(tanke);
		System.out.println(mapatest);
	}
}
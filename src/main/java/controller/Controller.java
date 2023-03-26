package controller;

import model.Game;

public class Controller {

	public Controller() {
		Game.getInstance().initialize();
	}

	public void run() throws InterruptedException {

		while (true) {
			update();
			Thread.sleep(1000);
		}
	}

	public void update() throws InterruptedException {
		Game.getInstance().getLevel().getMap().update();
		System.out.println(Game.getInstance().getLevel().getMap());
	}

	public static void ClearConsole() {
		try {
			String operatingSystem = System.getProperty("os.name"); // Check the current operating system

			if (operatingSystem.contains("Windows")) {
				ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
				Process startProcess = pb.inheritIO().start();
				startProcess.waitFor();
			} else {
				ProcessBuilder pb = new ProcessBuilder("clear");
				Process startProcess = pb.inheritIO().start();

				startProcess.waitFor();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
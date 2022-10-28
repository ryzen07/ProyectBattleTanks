package model;

public class Tank {

	private boolean allied;
	private int life;
	// private arrayList<powerup()> activePower;

	public Tank(boolean allied, int life) {
		this.allied = allied;
		this.life = life;
	}

	public int getLife() {
		return life;
	}

	public static int shoot() {
		// crearobjetobala
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shoot();
	}
}

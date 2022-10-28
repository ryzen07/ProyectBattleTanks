package model;

public class Tank {

	private boolean allied;
	private int life;
	// private arrayList<powerup()> activePower;

	public Tank(boolean allied, int life){
		this.allied = allied;
		this.life = life;
	}
	public int getLife() {
		return life;
	}
	public Bullet shoot() {
		Bullet bulletTank = new Bullet();
		return bulletTank;
	}
}
//sss
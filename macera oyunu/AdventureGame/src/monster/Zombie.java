package monster;

public class Zombie extends Monster{

	private int damage = 3;
	static private int healthy = 10;
	private int money = 4;
	private String name = "Zombi";
	
	
	public Zombie() {
	}

	public Zombie(int damage, int healthy, int money, String name) {
		super(damage, healthy, money, name);
	}
	
	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	
	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		Zombie.healthy = healthy;
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
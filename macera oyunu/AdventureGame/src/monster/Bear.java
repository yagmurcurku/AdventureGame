package monster;

public class Bear extends Monster{

	static private int damage = 7;
	static private int healthy = 20;
	private int money = 12;
	private String name = "Ayı";
	
	
	public Bear() {
	}

	public Bear(int damage, int healthy, int money, String name) {
		super(damage, healthy, money, name);
	}
	
	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		Bear.damage = damage;
	}

	
	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		Bear.healthy = healthy;
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
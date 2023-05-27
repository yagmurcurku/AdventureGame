package monster;

public class Vampire extends Monster{

	static private int damage = 4;
	static private int healthy = 14;
	private int money = 7;
	private String name = "Vampir";
	
	
	public Vampire() {
	}
	
	public Vampire(int damage, int healthy, int money, String name) {
		super(damage, healthy, money, name);
	}
	
	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		Vampire.damage = damage;
	}
	

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		Vampire.healthy = healthy;
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
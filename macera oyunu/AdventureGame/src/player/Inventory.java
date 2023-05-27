package player;

public class Inventory {

	private static boolean food;
	private static boolean firewood;
	private static boolean water;
	private String weaponName;
	private String armorName;
	private int weaponDamage;
	private int armorDefance;
	private int weaponMoney;
	private int armorMoney;
	
	
	public Inventory() {
	}

	public Inventory(boolean food, boolean firewood, boolean water, String weaponName, String armorName,
			int weaponDamage, int armorDefance, int weaponMoney, int armorMoney) {
		Inventory.food = food;
		Inventory.firewood = firewood;
		Inventory.water = water;
		this.weaponName = weaponName;
		this.armorName = armorName;
		this.weaponDamage = weaponDamage;
		this.armorDefance = armorDefance;
		this.weaponMoney = weaponMoney;
		this.armorMoney = armorMoney;
	}

	

	public static boolean isFood() {
		return food;
	}

	public static void setFood(boolean food) {
		Inventory.food = food;
	}

	
	public static boolean isFirewood() {
		return firewood;
	}

	public static void setFirewood(boolean firewood) {
		Inventory.firewood = firewood;
	}

	
	public static boolean isWater() {
		return water;
	}

	public static void setWater(boolean water) {
		Inventory.water = water;
	}

	
	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}
	

	public String getArmorName() {
		return armorName;
	}

	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}
	

	public int getWeaponDamage() {
		return weaponDamage;
	}

	public void setWeaponDamage(int weaponDamage) {
		this.weaponDamage = weaponDamage;
	}
	

	public int getArmorDefance() {
		return armorDefance;
	}

	public void setArmorDefance(int armorDefance) {
		this.armorDefance = armorDefance;
	}
	

	public int getWeaponMoney() {
		return weaponMoney;
	}

	public void setWeaponMoney(int weaponMoney) {
		this.weaponMoney = weaponMoney;
	}

	
	public int getArmorMoney() {
		return armorMoney;
	}

	public void setArmorMoney(int armorMoney) {
		this.armorMoney = armorMoney;
	}
	
	
	
}
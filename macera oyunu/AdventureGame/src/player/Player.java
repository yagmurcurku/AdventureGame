package player;

import java.util.Scanner;

public class Player {
	
	private String name;
	private static int damage;
	private static int healthy;
	private static int money;
	private Inventory inventory;
	private int characterNo;
	private static int defence;
	
	
	public Player() {
		super();
	}
	
	public Player(String name, int damage, int healthy, int money, Inventory inventory, int characterNo, int defence) {
		this.name = name;
		Player.damage = damage;
		Player.healthy = healthy;
		Player.money = money;
		this.inventory = inventory;
		this.characterNo = characterNo;
		Player.defence = defence;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		Player.damage = damage;
	}


	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		Player.healthy = healthy;
	}


	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		Player.money = money;
	}


	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
	public int getCharacterNo() {
		return characterNo;
	}

	public void setCharacterNo(int characterNo) {
		this.characterNo = characterNo;
	}
	
	
	public int getDefence() {
		return defence;
	}
	
	public void setDefence(int defence) {
		Player.defence = defence;
	}
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	//KARAKTERLERİ TANITMA METODU
	public void selectChar() throws Exception{
		System.out.println("Oyuna başlamak için karakterini seçmelisin");
		scanner.nextLine();
		System.out.println("Karakterler ve özellikleri: ");
		System.out.println("🥷🏽 Samuray --> hasar: 5, sağlık: 21, sahip olduğu para: 15");
		System.out.println("🏹 Okçu    --> hasar: 7, sağlık: 18, sahip olduğu para: 20");
		System.out.println("🤴🏼 Şovalye --> hasar: 8, sağlık: 24, sahip olduğu para: 5");
		scanner.nextLine();
		select();
	}
	
	
	//KARAKTER SEÇME METODU
	public void select() {
		System.out.println("Hangi karakteri seçmek istiyorsun ?");
		System.out.println("1 : Samuray");
		System.out.println("2 : Okçu");
		System.out.println("3 : Şovalye");

		characterNo = scanner.nextInt();
		
		//characters:
		//1 --> samuray
		//2 --> okçu
		//3 --> şovalye
		
		switch (characterNo) {
		case 1: {
			this.setName("Samuray");
			this.setDamage(5);
			this.setHealthy(21);
			this.setMoney(15);
			this.setCharacterNo(1);
			System.out.println("TEBRİKLER ! ARTIK BİR SAMURAYSIN 🥷🏽");
			characterInformation();
			break;
		}
		case 2: {
			this.setName("Okçu");
			this.setDamage(7);
			this.setHealthy(18);
			this.setMoney(20);
			this.setCharacterNo(2);
			System.out.println("TEBRİKLER ! ARTIK BİR OKÇUSUN 🏹");
			characterInformation();
			break;
		}
		case 3: {
			this.setName("Şovalye");
			this.setDamage(8);
			this.setHealthy(24);
			this.setMoney(5);
			this.setCharacterNo(3);
			System.out.println("TEBRİKLER ! ARTIK BİR ŞOVALYESİN 🤴🏼");
			characterInformation();
			break;
		}
		default:
			System.out.println();
			System.out.println("Geçersiz karakter seçimi !!! 1-3 aralığında bir değer girmelisin");
			select();
		}	
	}
	
	
	//KARAKTER BİLGİLERİNİN VERİLDİĞİ METOD
	public void characterInformation() {
		System.out.println("❤ Mevcut sağlığın: " + getHealthy());
		System.out.println("💲 Mevcut paran: " + getMoney());
		System.out.println("🗡 Mevcut hasar gücün: " + getDamage());
	}
		
	
}
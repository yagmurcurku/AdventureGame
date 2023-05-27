package location;

import java.util.Scanner;

import location.BattleLoc.Cave;
import location.BattleLoc.Forest;
import location.BattleLoc.River;
import location.normalLoc.SafeHouse;
import location.normalLoc.ToolStore;
import monster.Bear;
import monster.Monster;
import monster.Vampire;
import monster.Zombie;
import player.Player;

public abstract class Location {

	Player player;	
	String locationName;
	int locationNo;

	
	public Location() {
	}

	public Location(Player player) {
		this.player = player;
	}
	
	
	
	public Player getPlayer() {    
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}


	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	

	public int getLocationNo() {
		return locationNo;
	}

	public void setLocationNo(int locationNo) {
		this.locationNo = locationNo;
	}
	
	
	
	//SEÇİLEN BÖLGEDEKİ İŞLEMLERİN GERÇEKLEŞECEĞİ METOD
	public abstract void onLocation() throws Exception;
	
	
	Scanner scanner = new Scanner(System.in);

	//BÖLGE SEÇME METODU
	public void selectLocation() throws Exception {
		scanner.nextLine();
		System.out.println("Hangi bölgeye gitmek istiyorsun ?");
		System.out.println("🏠 1: Güvenli bölge");
		System.out.println("💎 2: Eşya mağazası");
		System.out.println("⚔ 3: Savaş alanı");
		
		//locations;
		//1 --> güvenli bölge
		//2 --> eşya mağazası
		//3 --> savaş alanı
		
		int location = scanner.nextInt();
		
		switch (location) {
		
		//******GÜVENLİ BÖLGE******
		case 1: {
			setLocationName("güvenli bölge");
			setLocationNo(1);
			SafeHouse safeHouse = new SafeHouse(player);
			safeHouse.onLocation();
			break;
		}
		
		//******EŞYA MAĞAZASI******
		case 2: {
			setLocationName("eşya mağazası");
			setLocationNo(2);
			ToolStore store = new ToolStore(player);
			store.onLocation();
			break;
		}
		
		//******SAVAŞ ALANI******
		case 3: {
			setLocationName("savaş alanı");
			setLocationNo(3);
			System.out.println();
			System.out.println("Burası savaş alanı. Kendini koru 😈");
			System.out.println("Mağarada zombiler 🧟, Ormanda vampirler 🧛🏻, Nehirde ayılar 🐻 olabilir !!!");
			System.out.println();
			selectBattleLocation();
			break;
		}
		default:
			System.out.println();
			System.out.println("YANLIŞ ALAN SEÇİMİ YAPTIN ! LÜTFEN TEKRAR DENE");
			this.selectLocation();
		}	
	}
	
	
	//SAVAŞ ALANI SEÇME METODU
	public void selectBattleLocation() throws Exception {
		System.out.println("Mağarada savaşmak istiyorsan 1'e bas");
		System.out.println("Ormanda savaşmak istiyorsan 2'ye bas");
		System.out.println("Nehirde savaşmak istiyorsan 3'e bas");
		int battleLocation = scanner.nextInt();
		
		switch (battleLocation) {
		case 1: {
			Monster zombie = new Zombie();
			Cave cave = new Cave(player, zombie);
			cave.onLocation();
			break;
		}
		case 2: {
			Monster vampire = new Vampire();
			Forest forest = new Forest(player, vampire);
			forest.onLocation();
			break;
		}
		case 3: {
			Monster bear = new Bear();
			River river = new River(player, bear);
			river.onLocation();
			break;
		}
		default:
			System.out.println("");
			System.out.println("YANLIŞ ALAN SEÇİMİ YAPTIN ! LÜTFEN TEKRAR DENE");
			selectBattleLocation();
			break;
		}
	}
	
}
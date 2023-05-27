package game;

import java.util.Scanner;

import location.Location;
import player.Inventory;
import player.Player;

public class Game {

	Player player;
	Location location;
	
	public Game() {
	}
	
	public Game(Player player, Location location) {
		this.player = player;
		this.location = location;
	}

	
	Scanner scanner = new Scanner(System.in);

	public void start() throws Exception {
		
		System.out.println("⚔️⚔⚔⚔️⚔⚔ SAVAŞ OYUNUNA HOŞGELDİN ⚔️⚔⚔⚔️⚔⚔");
		scanner.nextLine();
		System.out.println("Oyunu kazanmak için mağaradan yemek 🍗, ormandan odun 🪵 ve nehirden su 💧 toplamalısın");
		System.out.println("Eğer ölmeden tüm malzemeleri toplayabilirsen oyunu başarılı bir şekilde bitirmiş olacaksın");
		scanner.nextLine();
		System.out.println("Fakat malzemeleri toplamak için savaş alanına gidip karşına çıkan canavarlarla savaşman gerekecek 😈");
		scanner.nextLine();
		
		//KARAKTER SEÇİMİ
		Player player = new Player();
		player.selectChar();
		
		//BÖLGE SEÇİMİ
		for(int i=player.getHealthy(); i>0;) {
			
			Location location = new Location(player) {
				
				@Override
				public void onLocation() throws Exception {
				}
			};
			location.selectLocation();
			
			//OYUNU BİTİRME ŞARTI		
			if((Inventory.isFood())&&(Inventory.isWater())&&(Inventory.isFirewood())) {
			System.out.println("🏆🏆🏆 TEBRİKLER ! TÜM MALZEMELERİ TOPLADIN 🏆🏆🏆");
				throw new Exception("🏆🏆🏆🏆🏆🏆 OYUNU KAZANDINIZ 🏆🏆🏆🏆🏆🏆");
			}
		}
	
	}
	
	
}
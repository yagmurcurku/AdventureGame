package location.normalLoc;

import player.Player;

public class SafeHouse extends NormalLoc{

	public SafeHouse(Player player) {
		super(player);
		System.out.print("🏠 Güvenli bölgeye hoşgeldin 🏠");
	}

	
	@Override
	public void onLocation() {
		System.out.println(" Buradan sağlığın full şekilde çıkarsın.");
		
		//characters:
		//1 --> samuray
		//2 --> okçu
		//3 --> şovalye
		
		System.out.print("❤ Mevcut sağlığın: ");
		if(getPlayer().getCharacterNo()==1) {
			getPlayer().setHealthy(21);
		}
		else if (getPlayer().getCharacterNo()==2) {
			getPlayer().setHealthy(18);
		}
		else if (getPlayer().getCharacterNo()==3) {
			getPlayer().setHealthy(24);
		}
		System.out.println(getPlayer().getHealthy());
	}	
	
}
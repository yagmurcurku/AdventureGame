package location.normalLoc;

import java.util.Scanner;

import player.Inventory;
import player.Player;

public class ToolStore extends NormalLoc{

	public ToolStore(Player player) {
		super(player);
		System.out.println("💎 Eşya mağazasına hoşgeldin 💎");
	}

	
	Scanner scanner = new Scanner(System.in);

	@Override
	public void onLocation() throws Exception {
		
		System.out.println("🔫 Silah almak istiyorsan 1'e bas, 🛡 zırh almak istiyorsan 2'ye bas");
		int weaponOrArmor = scanner.nextInt();
		
		if(weaponOrArmor == 1) {
			System.out.println("<<<<< 🔫 SİLAHLAR 🔫 >>>>>");
			System.out.println("TABANCA --> Hasar : 2,  Ücret : 25");
			System.out.println("KILIÇ   --> Hasar : 3,  Ücret : 35");
			System.out.println("TÜFEK   --> Hasar : 7,  Ücret : 45");
			scanner.nextLine();
			System.out.println("💲 Mevcut paran: " + getPlayer().getMoney());
			scanner.nextLine();
			menuWeapon();
		}
		else if (weaponOrArmor == 2) {
			System.out.println("<<<<< 🛡 ZIRHLAR 🛡 >>>>>");
			System.out.println("HAFİF --> Engelleme : 1,  Ücret : 15");
			System.out.println("ORTA  --> Engelleme : 3,  Ücret : 25");
			System.out.println("AĞIR  --> Engelleme : 5,  Ücret : 40");
			scanner.nextLine();
			System.out.println("💲 Mevcut paran: " + getPlayer().getMoney());
			scanner.nextLine();
			menuArmor();
		}
		else {
			System.out.println("Yanlış seçim yaptın !");
			onLocation();
		}
	}

	
	//SİLAH SEÇME METODU
	public void menuWeapon() throws Exception {
		System.out.println("Hangi silahı almak istiyorsun ?");
		System.out.println("1: Tabanca");
		System.out.println("2: Kılıç");
		System.out.println("3: Tüfek");
		
		int weaponSelection = scanner.nextInt();
		
		switch (weaponSelection) {
		case 1: {
			Inventory inventory1 = new Inventory();
			inventory1.setWeaponName("Tabanca");
			inventory1.setWeaponDamage(2);
			inventory1.setWeaponMoney(25);
			buyWeapon(inventory1);
			break;
		}
		case 2: {
			Inventory inventory2 = new Inventory();
			inventory2.setWeaponName("Kılıç");
			inventory2.setWeaponDamage(3);
			inventory2.setWeaponMoney(35);
			buyWeapon(inventory2);
			break;
		}
		case 3: {
			Inventory inventory3 = new Inventory();
			inventory3.setWeaponName("Tüfek");
			inventory3.setWeaponDamage(7);
			inventory3.setWeaponMoney(45);
			buyWeapon(inventory3);
			break;
		}
		default:
			System.out.println("Yanlış silah seçimi !!! Tekrar seçim yapmalısın.");
			System.out.println();
			scanner.nextLine();
			menuWeapon();
		}
	}
	
	
	//ZIRH SEÇME METODU
	public void menuArmor() throws Exception {
		System.out.println("Hangi zırhı almak istiyorsun ?");
		System.out.println("1: Hafif");
		System.out.println("2: Orta");
		System.out.println("3: Ağır");
		
		int armorSelection = scanner.nextInt();
		
		switch (armorSelection) {
		case 1: {
			Inventory inventory1 = new Inventory();
			inventory1.setArmorName("Hafif");
			inventory1.setArmorDefance(1);
			inventory1.setArmorMoney(15);
			buyArmor(inventory1);
			break;
		}
		case 2: {
			Inventory inventory2 = new Inventory();
			inventory2.setArmorName("Orta");
			inventory2.setArmorDefance(3);
			inventory2.setArmorMoney(25);
			buyArmor(inventory2);
			break;
		}
		case 3: {
			Inventory inventory3 = new Inventory();
			inventory3.setArmorName("Ağır");
			inventory3.setArmorDefance(5);
			inventory3.setArmorMoney(40);
			buyArmor(inventory3);
			break;
		}
		default:
			System.out.println("Yanlış zırh seçimi !!! Tekrar seçim yapmalısın.");
			System.out.println();
			scanner.nextLine();
			menuArmor();
		}
	}
	
	
	
	//SİLAH ALMA METODU
	public void buyWeapon (Inventory inventory) throws Exception {
		if(getPlayer().getMoney()>=inventory.getWeaponMoney()) {
			getPlayer().setInventory(inventory);
			getPlayer().setMoney(getPlayer().getMoney()-inventory.getWeaponMoney());
			
			if(getPlayer().getCharacterNo()==1) {
				getPlayer().setDamage(5 + inventory.getWeaponDamage());
			}else if(getPlayer().getCharacterNo()==2) {
				getPlayer().setDamage(7 + inventory.getWeaponDamage());
			}else if(getPlayer().getCharacterNo()==3) {
				getPlayer().setDamage(8 + inventory.getWeaponDamage());
			}
			System.out.println("✔ "+ inventory.getWeaponName() + "  alımı başarılı ✔");
			System.out.println("💲 Kalan paran: " + getPlayer().getMoney());
			System.out.println("🛡 Mevcut hasar gücün: " + getPlayer().getDamage());
		}else {
			System.out.println("❌ Paran bu silaha yetmiyor ❌");
			selectLocation();
		}
	}
	
	
	//ZIRH ALMA METODU
	public void buyArmor (Inventory inventory) throws Exception {
		if(getPlayer().getMoney()>=inventory.getArmorMoney()) {
			getPlayer().setInventory(inventory);
			getPlayer().setMoney(getPlayer().getMoney()-inventory.getArmorMoney());
			getPlayer().setDefence(inventory.getArmorDefance());
			System.out.println("✔ "+ inventory.getArmorName() + " zırh alımı başarılı ✔");
			System.out.println("💲 Kalan paran: " + getPlayer().getMoney());
			System.out.println("🛡 Mevcut savunma gücün: " + getPlayer().getDefence());
		}else {
			System.out.println("❌ Paran bu zırha yetmiyor ❌");
			selectLocation();
		}
	}
	
	
}
package location.BattleLoc;

import java.util.Scanner;

import monster.Monster;
import player.Player;

public class Cave extends BattleLoc{
	
	Monster zombie;
	
	
	public Cave() {}
	
	public Cave(Player player, Monster zombie) {
		super(player, zombie);
		this.zombie = zombie;
		zombie.setDamage(zombie.getDamage()-getPlayer().getDefence());
		if(zombie.getDamage()<0) {
			zombie.setDamage(0);
		}
	}
	
	
	Scanner scanner = new Scanner(System.in);
	
	public void onLocation() throws Exception {
		int mN = zombie.monsterNumber();
		System.out.println();
		System.out.println("Dikkatli ol! Mağarada birden fazla zombi olabilir");
		System.out.println("Zombilerin üstesinden gelebilirsen mağaradan yemek kazanarak çıkacağını unutma");
		System.out.println("Fakat zombilerin üstesinden gelemezsen ölürsün 💀");
		scanner.nextLine();
		System.out.println("Zombilerin saldırı gücü --> 3");
		System.out.println("Zombileri öldürdüğünde kazanacağın para --> " + zombie.getMoney());
		scanner.nextLine();
		battleLocation(zombie, mN);
	}
	

}
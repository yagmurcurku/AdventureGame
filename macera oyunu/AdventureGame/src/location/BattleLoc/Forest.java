package location.BattleLoc;

import java.util.Scanner;

import monster.Monster;
import player.Player;

public class Forest extends BattleLoc{
	
	Monster vampire;
	
	
	public Forest() {}

	public Forest(Player player, Monster vampire) {
		super(player, vampire);
		this.vampire = vampire;
		vampire.setDamage(vampire.getDamage()-getPlayer().getDefence());
		if(vampire.getDamage()<0) {
			vampire.setDamage(0);
		}
	}

	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void onLocation() throws Exception {
		int mN = vampire.monsterNumber();
		System.out.println();
		System.out.println("Dikkatli ol! Ormanda birden fazla vampir olabilir");
		System.out.println("Vampirlerin üstesinden gelebilirsen ormandan yakacak odun kazanarak çıkacağını unutma");
		System.out.println("Fakat vampirlerin üstesinden gelemezsen ölürsün 💀");
		scanner.nextLine();
		System.out.println("Vampirlerin saldırı gücü --> 4");
		System.out.println("Vampirleri öldürdüğünde kazanacağın para --> " + vampire.getMoney());
		scanner.nextLine();
		battleLocation(vampire, mN);
	}
	
	
}
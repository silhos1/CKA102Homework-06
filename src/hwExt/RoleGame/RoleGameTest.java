package hwExt.RoleGame;


public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		saber.atkStrategy(new AttackSword());
		saber.movStrategy(new MoveGeneral());
		saber.defStrategy(new DefendGeneral());
		
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		archer.atkStrategy(new AttackArrow());
		archer.movStrategy(new MoveGeneral());
		archer.defStrategy(new DefendGeneral());
		
		saber.attack();
		saber.move();
		saber.defend();
		
		archer.attack();
		archer.move();
		archer.defend();
	}

}

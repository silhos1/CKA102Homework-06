package hwExt.RoleGame;


public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	private AttackStrategy atkStrategy;
	private	DefendStrategy defStrategy;
	private MoveStrategy movStrategy;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	//
	
	public void atkStrategy(AttackStrategy atkStrategy) {
		this.atkStrategy = atkStrategy;
	}
	
	public void defStrategy(DefendStrategy defStrategy) {
		this.defStrategy = defStrategy;
	}
	
	public void movStrategy(MoveStrategy movStrategy) {
		this.movStrategy = movStrategy;
	}
	
	//
	
	public void attack() {
		atkStrategy.attack();
	}
	
	public void move() {
		movStrategy.move();
	}
	
	public void defend() {
		defStrategy.defend();
	}
}

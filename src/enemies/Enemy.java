package enemies;

public abstract class Enemy {
    protected int health;
    protected int attackPower;
    protected String name;

    public Enemy(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public boolean alive() {
        return health > 0;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}

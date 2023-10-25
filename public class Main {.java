interface Monster {
    String getDescription();
    int getHealth();
    boolean isDead();
    void heal(int points);
    void hit(int damage);
    void burn(int damage);
}

class Wumpus implements Monster {
    private String name;
    private int health;
    private final int maxHealth = 20;

    public Wumpus(String name) {
        this.name = name;
        this.health = maxHealth;
    }

    @Override
    public String getDescription() {
        return name + " (wumpus; health: " + health + ")";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health == 0;
    }

    @Override
    public void heal(int points) {
        health = Math.min(health + points, maxHealth);
    }

    @Override
    public void hit(int damage) {
        health = Math.max(0, health - damage / 2);
    }

    @Override
    public void burn(int damage) {
        health = Math.max(0, health - damage);
    }
}

class Owlbear implements Monster {
    private String name;
    private int health;
    private final int maxHealth = 59;

    public Owlbear(String name) {
        this.name = name;
        this.health = maxHealth;
    }

    @Override
    public String getDescription() {
        return name + " (owlbear; health: " + health + ")";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health == 0;
    }

    @Override
    public void heal(int points) {
        health = Math.min(health + points, maxHealth);
    }

    @Override
    public void hit(int damage) {
        health = Math.max(0, health - damage / 2);
    }

    @Override
    public void burn(int damage) {
        health = Math.max(0, health - damage);
    }
}

class Demogorgon implements Monster {
    private String name;
    private int health;
    private final int maxHealth = 200;

    public Demogorgon(String name) {
        this.name = name;
        this.health = maxHealth;
    }

    @Override
    public String getDescription() {
        return name + " (demogorgon; health: " + health + ")";
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isDead() {
        return health == 0;
    }

    @Override
    public void heal(int points) {
        health = Math.min(health + points, maxHealth);
    }

    @Override
    public void hit(int damage) {
        health = Math.max(0, health - damage);
    }

    @Override
    public void burn(int damage) {
        health = Math.max(0, health - damage / 2);
    }
}

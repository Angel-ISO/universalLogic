package project.HeroesBattle;


public abstract class Heroe {
    private Integer life;
    private String name;
    private Integer maxDamage;
    private Integer minDamage;
    private Integer Damage;

    public Heroe(Integer life, String name, Integer maxDamage, Integer minDamage, Integer damage) {
        this.life = life;
        this.name = name;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        Damage = damage;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }

    public Integer getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public Integer getDamage() {
        return Damage;
    }

    public void setDamage(Integer damage) {
        Damage = damage;
    }


    public void takeDamage(Integer damage){
        int lifeAdjusted = getLife() - damage;
        if (lifeAdjusted < 0) {
            lifeAdjusted = 0;
        }
        setLife(lifeAdjusted);
    }
    public void doDamage(){
        int influyedDamage = (int) (Math.random() * (getMaxDamage() - getMinDamage() + 1) + getMinDamage());
        setDamage(influyedDamage);
        System.out.println(getName() + " hace " + influyedDamage + " puntos de daño.");
    }
    public abstract void refoundLife();
    public abstract void doCombo();
}

package project.HeroesBattle;

public class Wolveryne extends Heroe{
    public Wolveryne(Integer life, String name, Integer maxDamage, Integer minDamage, Integer damage) {
        super(life, name, 120, 10, damage);
    }

    @Override
    public void refoundLife() {
        int regeneration = (int)(getLife() * 0.3);
        int lifenew = regeneration + getLife();
        setLife(lifenew);
        System.out.println(getName() + " se regenera " + regeneration + " puntos de vida.Su Vida actual es de: " + getLife());
    }

    @Override
    public void doCombo() {
      int multipleDamage = (int)(getMaxDamage() * 2);
      int result = multipleDamage + getDamage();
      setDamage(result);
        System.out.println(getName() + " Acaba de hacer un combo con daño de " +getDamage() + "Esto es ta que arde!!!");

    }
}

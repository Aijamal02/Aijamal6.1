public class Skeleton extends Boss{
private int numberOfArrows;

public Skeleton(int health, int damage,  int numberOfArrows ){
    super(health, damage);
    this.numberOfArrows=numberOfArrows;

}
    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String info() {
        return "Skeleton health: " + getHealth()
                + "\nSkeleton damage: " + getDamage()
                + "\nSkeleton weapon type: " + weapon.getType()
                + "\nSkeleton weapon: " + weapon.getName()
                + "\nSkeleton numberOfArrows : " + getNumberOfArrows();
    }
}

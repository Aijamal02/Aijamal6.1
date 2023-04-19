public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(700, 80);
        boss.setDamage(80);
        boss.setHealth(700);
        boss.weapon.setType(WeaponType.FIREARM);
        boss.weapon.setName("Master");
        System.out.println(boss.info());

        Skeleton skeleton1=new Skeleton(100,15,5);
        Skeleton skeleton2=new Skeleton(200,25,10);
        skeleton1.weapon.setType(WeaponType.STEEL_ARMS);
        skeleton1.weapon.setName("Dagger");
        skeleton2.weapon.setType(WeaponType.WEAPON_FOR_HUNTING);
        skeleton2.weapon.setName("Hunting caliber");
        System.out.println(skeleton1.info());
        System.out.println(skeleton2.info());
    }
}
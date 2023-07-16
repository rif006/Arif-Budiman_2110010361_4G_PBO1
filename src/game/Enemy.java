package game;


public class Enemy extends Karakter{
     private int enemyLevel;

    public Enemy(String nama, int level, int enemyLevel) {
        super(nama, level , "Enemy");
        this.enemyLevel = enemyLevel;
    }

    @Override
    public void attackEnemy(String enemyName) {
        super.attackEnemy(enemyName);
        System.out.println(nama + " menyerang " + enemyName + " dengan kekuatan " + (attackPower + enemyLevel));
    }

    @Override
    public void specialAbility() {
        System.out.println(nama + " menggunakan kemampuan khusus: Self-Destruct!");
        System.out.println(nama + " menyerang dirinya sendiri dengan kekuatan maksimum!");
        health = 0;
        System.out.println(nama + " mengorbankan diri dalam pertarungan!");
    }
}

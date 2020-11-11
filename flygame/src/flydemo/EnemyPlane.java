package flydemo;

/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-11 08:54
 **/
public class EnemyPlane extends Abstractfly implements Enemy {
    /**
     * 走路的步数
     */
    private int speed = 2;
    @Override
    public int getScores() {
        return 0;
    }
}

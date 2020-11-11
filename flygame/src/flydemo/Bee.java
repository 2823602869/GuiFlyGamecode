package flydemo;

/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-11 09:11
 * 蜜蜂类
 * 蜜蜂是飞行物，也是奖励
 * extends 继承类；implements 实现接口。
 **/
public class Bee extends Abstractfly implements Award{
    /**
     * x,y坐标步数
     */
    private int xspeed = 1;
    private int yspeed = 2;
    /**
     * 获取奖励类型
     */
    private int awardType;

    /**
     * 重写方法
     * @return
     */
    @Override
    public int getType() {
        return 0;
    }
}

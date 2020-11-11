package flydemo;

/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-11 08:50
 * 定义一个奖励接口
 **/
public interface Award {
    /**
     *火力
     */
    public int ENEMY_FILE = 0;
    /**
     * 命
     */
    public int STATIC_LIFE = 1;

    /**
     * 0为火力奖励 1为生命奖励
     * @return
     */
    public int getType();
}

package flydemo;

/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-11 09:11
 * �۷���
 * �۷��Ƿ����Ҳ�ǽ���
 * extends �̳��ࣻimplements ʵ�ֽӿڡ�
 **/
public class Bee extends Abstractfly implements Award{
    /**
     * x,y���경��
     */
    private int xspeed = 1;
    private int yspeed = 2;
    /**
     * ��ȡ��������
     */
    private int awardType;

    /**
     * ��д����
     * @return
     */
    @Override
    public int getType() {
        return 0;
    }
}

package flydemo;

/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-11 08:50
 * ����һ�������ӿ�
 **/
public interface Award {
    /**
     *����
     */
    public int ENEMY_FILE = 0;
    /**
     * ��
     */
    public int STATIC_LIFE = 1;

    /**
     * 0Ϊ�������� 1Ϊ��������
     * @return
     */
    public int getType();
}

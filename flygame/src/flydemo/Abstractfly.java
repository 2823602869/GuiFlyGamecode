package flydemo;
import java.awt.image.BufferedImage;
/**
 * @program: flygame
 * @description
 * @author: taoli
 * @create: 2020-11-10 08:26
 * ���ó�����
 **/
public abstract class Abstractfly {
    /**
     * x����
     */
    private int x;
    /**
     * y����
     */
    private int y;
    /**
     * ��
     */
    private int width;
    /**
     * ��
     */
    private int height;
    /**
     * ͼƬ
     */
    private BufferedImage image;

    public Abstractfly() {
    }
/**
 *
 * @params [x, y, width, height, image]
 * @create 2020/11/11 9:03
 */
    public Abstractfly(int x, int y, int width, int height, BufferedImage image) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
        public int getHeight() {
            return height;
        }

        public void setHeight(int height){
            this.height = height;
        }

        public BufferedImage getImage () {
            return image;
        }

        public void setImage(BufferedImage image){
            this.image = image;
        }
}
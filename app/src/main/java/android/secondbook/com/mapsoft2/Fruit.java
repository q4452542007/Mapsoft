package android.secondbook.com.mapsoft2;

/**
 * Created by Administrator on 2017/8/10.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

}

package java;

/**
 * 描述： 测试
 *
 * @author pengjie_yao
 * @date 2019/9/16 14:48
 */
public class gitflowTest {

    public static void main(String[] args) {
        System.out.println("master");
        featureOne();
    }

    public static void featureOne() {
        System.out.println("这是正在开发的功能,开发完毕");
    }


    public static void hitfixBug() {
        System.out.println("线上bug进行修复");
    }
}

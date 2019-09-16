package java;

/**
 * 描述： 测试
 *
 * @author pengjie_yao
 * @date 2019/9/16 14:48
 */
public class gitflowTest {

    public static void main(String[] args) {
        System.out.println("test1");
        System.out.println("developtest2");
        featureOne();
    }

    public static void featureOne() {
        System.out.println("这是功能开发1");
    }

    public static void featureTwo() {
        System.out.println("这是功能开发2");

    }

    public static void fixBug1() {
        System.out.println("修复不紧急的bug1");
    }
}

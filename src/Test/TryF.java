package Test;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 14:14 2018/9/10
 */
public class TryF {

    public static void main(String[] args) throws Exception {
        System.out.println(get());
    }
    private static int get() throws  Exception{
        try {
            int i = 1 / 2;
            System.out.println(i);
            return i;
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
            return 2;
        }

    }
}

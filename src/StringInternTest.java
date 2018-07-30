/**
 * @auther: WJoe
 * @Description:  intern()方法
 * @Date : 20:41 2018/7/29
 */
public class StringInternTest {

    public static void main(String[] args) {
        // 使用char数组来初始化a，避免在a被创建之前字符串池中已经存在了值为"abcd"的对象
        String a = new String(new char[]{'a', 'b', 'c', 'd'});
        String b = a.intern();
        if (b == a) {
            System.out.println("a ==b ,a被加入了字符串池中，没有新建对象");
        } else {
            System.out.println("b没被加入字符串池中，新建了对象");
        }

        String s = new String("1");
        System.out.println(" s的hash值 ："+s.hashCode());
        String s1= s.intern();
        System.out.println(" s1的hash值 ："+s1.hashCode());
        System.out.println(s == s1);

        String s3 = new String("1") + new String("1");
        System.out.println(" s3的hash值 ："+s3.hashCode());
        String s4= s3.intern();
        System.out.println(" s4的hash值 ："+s4.hashCode());
        //String s5 = "11";
        System.out.println(s3 == s4);
    }
}

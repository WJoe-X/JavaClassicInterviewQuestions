/**
 * @auther: WJoe
 * @Description:  1. 如果参数为正数，且小数点后第一位>=5，运算结果为参数的整数部分+1。
 * 2. 如果参数为负数，且小数点后第一位>5，运算结果为参数的整数部分-1。
 * 3. 如果参数为正数，且小数点后第一位<5；或者参数为负数，且小数点后第一位<=5，运算结果为参数的整数部分。
 *
 *      Math类的round()方法的运算结果是一个<=(参数值+0.5)的最大整数
 * @Date : 22:02 2018/7/29
 */
public class MathTest {

    public static void main(String[] args) {
        System.out.println("小数点后第一位=5");
        System.out.println("正数：Math.round(11.5)=" + Math.round(11.5));
        System.out.println("负数：Math.round(-11.5)=" + Math.round(-11.5));
        System.out.println();
        System.out.println("小数点后第一位<5");
        System.out.println("正数：Math.round(11.46)=" + Math.round(11.46));
        System.out.println("负数：Math.round(-11.46)=" + Math.round(-11.46));
        System.out.println();
        System.out.println("小数点后第一位>5");
        System.out.println("正数：Math.round(11.68)=" + Math.round(11.68));
        System.out.println("负数：Math.round(-11.68)=" + Math.round(-11.68));
    }
}

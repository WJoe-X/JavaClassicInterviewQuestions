/**
 * @auther: WJoe
 * @Description: 两个操作数（包括byte、short、int、char）都将会被转换成int类型，并且结果也是int类型
 * 当使用+=、-=、*=、/=、%=、运算符对基本类型进行运算时，遵循如下规则：
 * •运算符右边的数值将首先被强制转换成与运算符左边数值相同的类型，然后再执行运算，且运算结果与
 * 运算符左边数值类型相同
 * @Date : 21:59 2018/7/29
 */
public class PrimitiveTypeTest {

    public static void main(String[] args) {
        short s1 = 1;
        // 这一行代码会报编译错误,因为 s1 +1 的类型为int
        // s1 = s1 + 1;
        // 这一行代码没有报错
        s1 = 1 + 1;
        // 这一行代码也没有报错
        s1 += 1;
    }
}

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:51 2018/9/10
 */
public class subString {

    static int substringIndex(String source, String target) {
        if (source == null || source.length() == 0 || target == null || target.length() == 0)
            return -1;
        return source.indexOf(target);
    }
}

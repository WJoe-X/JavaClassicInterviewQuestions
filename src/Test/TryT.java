package Test;

import yuanfudao.EightQueen;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 14:11 2018/9/10
 */
public class TryT {

    public static void main(String[] args) throws Exception {
        try {
            int i = 1 / 0;
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
            throw new Exception();
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
}

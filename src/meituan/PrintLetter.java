package meituan;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:31 2018/8/22
 */
public class PrintLetter {

    private  static Lock reentrantLock = new ReentrantLock();

    private static Condition  condition =  reentrantLock.newCondition();

    public static void main(String[] args) throws Exception {
        reentrantLock.lock();
        new Thread(new PrintABC("A" ,0)).start();
        Thread.sleep(10);
        new Thread(new PrintABC("B" ,1)).start();
        Thread.sleep(10);
        new Thread(new PrintABC("C" ,2)).start();
        Thread.sleep(10);
    }
}

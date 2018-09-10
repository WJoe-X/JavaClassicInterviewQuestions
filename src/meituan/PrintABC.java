package meituan;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @auther: WJoe
 * @Description: 三个线程循环打印 abc
 * @Date : 20:09 2018/8/22
 */
public class PrintABC implements Runnable {
    private String symnbol;
    private Integer go = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public void run() {
        while (true) {
            if (atomicInteger.get() % 3 == go) {
                System.out.print(symnbol);
                atomicInteger.getAndIncrement();
            }
            if (atomicInteger.get() == 100)
                break;
        }

    }

    public PrintABC(String symbol, Integer go) {
        this.go = go;
        this.symnbol = symbol;

    }
}

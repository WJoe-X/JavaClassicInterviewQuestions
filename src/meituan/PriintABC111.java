package meituan;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 20:47 2018/8/22
 */
public class PriintABC111 {
        private static class MyThread extends Thread {
            int which; // 0：打印A；1：打印B；2：打印C
            static  int state; // 线程共有，判断所有的打印状态
            static final Object t = new Object();
            public MyThread(int which) {
                this.which = which;
            }
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    synchronized (t) {
                        while (state % 3 != which) {
                            try {
                                t.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.print(toABC(which)); // 执行到这里，表明满足条件，打印
                        System.out.print(state);
                        state++;
                        t.notifyAll(); // 调用notifyAll方法
                    }
                }
            }
        }
        public static void main(String[] args) {
            new MyThread(0).start();
            new MyThread(1).start();
            new MyThread(2).start();
        }
        private static char toABC(int which) {
            return (char) ('A' + which);
        }

}

package yuanfudao;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 19:23 2018/8/24
 */
public class EightQueenMe {
    private  int count = 0;
    private  int[] arrs = new int[8];


    public static void main(String[] args) {
        EightQueenMe eightQueenMe =new EightQueenMe();
        eightQueenMe.eightQueen(0);
    }
    private  void  eightQueen(int n){
        if (n==8){
            count++;
            System.out.println("第" + count + "种方法:");
            printA();
            return;
        }
        for (int i = 0; i <8 ; i++) {
            arrs[n] =i;
            if (isvalid(n))
                eightQueen(n+1);
        }

    }

    private   boolean isvalid(int n){
        for (int i = 0; i <n ; i++) {
            if ((arrs[n] ==arrs[i])||( Math.abs(arrs[n]- arrs[i])==n-i))
                return false;
        }
        return true;
    }
    private   void printA(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8 ; j++) {
                if (arrs[i]==j)
                    System.out.print("*");
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}

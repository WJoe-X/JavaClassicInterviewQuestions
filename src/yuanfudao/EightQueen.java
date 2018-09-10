package yuanfudao;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 17:01 2018/8/24
 */
public class EightQueen {

    int[] queens = new int[8]; //记录每一列皇后的摆放位置
    int count = 0; //摆法总数

    public void dfs(int column) {
        if (column == 8) { //8个皇后都已经摆放
            count++;
            System.out.println("第" + count + "种方法:");
            print();
            return;
        }
        for (int i = 0; i < 8; i++) {
            queens[column] = i; //在该列的第i行上放置皇后
            if (isValid(column)) //检查摆放在该位置是否与前column-1列的皇后有冲突
                dfs(column + 1); //没有冲突则开始下一列8个位置的尝试
        }
    }

    private boolean isValid(int column) {
        for (int i = 0; i < column; i++) { //第column列上的皇后与前面column-1个皇后比较
            if (queens[i] == queens[column]) //两个皇后在同一行上
                return false;
            if (Math.abs(queens[i] - queens[column]) == (column - i)) //两个皇后在同一对角线上
                return false;
        }
        return true;
    }

    private void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (queens[i] == j)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EightQueen q = new EightQueen();
        q.dfs(0);
        System.out.println("共" + q.count + "种摆放方法");

    }
}

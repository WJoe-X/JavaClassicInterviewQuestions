/**
 * @auther: WJoe
 * @Description:
 * @Date : 21:05 2018/7/29
 */
public class ParentClass {
    public int i = 10;




    private  static int pva = 100;

    public int getPva() {
        return pva;
    }
    public static void main(String[] args) {
        ParentClass parentClass = new SubClass1();
        SubClass1 subClass = new SubClass1();
        System.out.println(parentClass.i + subClass.i);
        System.out.println(parentClass.getPva());
    }
}
 class SubClass1 extends ParentClass {
    public int i = 30;

     private  static int pva = 3000;

     public int getPva() {
         return pva;
     }
}
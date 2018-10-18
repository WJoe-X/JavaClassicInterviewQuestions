/**
 * @auther: WJoe
 * @Description:
 * @Date : 17:54 2018/9/21
 */
class A
{
    public void one() {System.out.println("one");}
    private void two() {System.out.println("two");}
    static void three() {System.out.println("three");}
    protected void four() {System.out.println("four");}
    public void test()
    {
        this.one();
        this.two();
        this.three();
        this.four();
    }
}

class B extends A
{
    public void one() {System.out.println("Bone");}
    private void two() {System.out.println("Btwo");}
    static void three() {System.out.println("Bthree");}
    protected void four() {System.out.println("Bfour");}
}
class test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B b = new B();
        b.test();
        b.three();
    }

}


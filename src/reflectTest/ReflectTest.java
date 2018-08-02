package reflectTest;

import java.lang.reflect.Constructor;

/**
 * @auther: WJoe
 * @Description:
 * @Date : 15:07 2018/8/1
 */
public class ReflectTest {


    public static void main(String[] args) throws  Exception{
        Class clazz = Class.forName("reflectTest.CheckUtil");
        Constructor constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        constructor.newInstance(null);
        float [] floats[] = new  float[6][];
    }

    }

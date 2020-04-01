package oldProject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args){
        try {
            Class circleClass = Class.forName(Circle.class.getName());
            Field radiusField = circleClass.getDeclaredField("radius");
            radiusField.setAccessible(true);
            Method findAreaMethod = circleClass.getDeclaredMethod("findArea");
            findAreaMethod.setAccessible(true);

            Circle circle2;
            circle2 = (Circle) circleClass.newInstance();
            radiusField.set(circle2, 4);
            System.out.println(circle2.toString());

            Circle circle3;
            circle3 = (Circle) circleClass.getConstructor(int.class).newInstance(3);
            System.out.println(circle3.toString());
            System.out.println("Area: " + findAreaMethod.invoke(circle3));

            System.out.println(getClassInformation(circleClass));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String getClassInformation(Class myClass){
        StringBuilder information = new StringBuilder("");
        information.append("Class name: " + myClass.getName()+ "\n");

        information.append("Class fields:\n");
        Field[] fields =  myClass.getDeclaredFields();
        for(Field field : fields){
            information.append(field.toString() + "\n");
        }

        information.append("Class constructions:\n");
        Constructor[] constructors = myClass.getConstructors();
        for(Constructor constructor : constructors){
            information.append(constructor.toString() + "\n");
        }

        information.append("Class methods:\n");
        Method[] methods = myClass.getDeclaredMethods();
        for(Method method : methods){
            information.append(method.toString() + "\n");
        }
        return information.toString();
    }
}

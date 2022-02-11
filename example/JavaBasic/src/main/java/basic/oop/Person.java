package basic.oop;

public class Person {
    private String name;
    private int age;
    private String[] courses;

    /*
        访问修饰符 返回数据类型 方法名（形参列表...）{
            ....
            return 返回值；
        }
    */
    private String showPeople(String name, int age) {
        return "姓名：" + name + "," + "年龄：" + age;
    }

    private void showPeople(int age,String name){ //顺序不同
        System.out.printf(name + ":" + age);
    }

    public int showPeople(String name,String gender,int age){ //个数不同
        System.out.println(name + gender);
        return age;
    }

    public String showPeople(String name,String age){ //类型不同
        return name + age;
    }
}

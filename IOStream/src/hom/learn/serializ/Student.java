package hom.learn.serializ;

import java.io.Serializable;

/**
 * @Descrption:
 * @Author: rootbee
 * @Date: 2020/3/25 - 上午11:29
 */

/*
    序列化均为对象，非static 类，
    transient 修饰的object成员变量 不能被序列化
 */
public class Student  implements Serializable {
    private static final long serialVersionUID = -8922831582379075261L;
    private String name;
    private String sex;

    public Student() {
    }

    public Student(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

package com.lyb.java;

/**
 * @author liuyabo
 * @create 2019-06-11 22:11
 */
public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.setCardId("610324199409214031");
        student.setName("liuyabo");
        student.setAge(25);
        student.setPhone("15001968297");

        StudentTest.show(student);
    }

    public static void show(Student student) {

        System.out.println("省份证：" + student.getCardId() + "名称：" + student.getName() + "年龄：" + student.getAge() +
                "联系方式：" + student.getPhone());

    }
}

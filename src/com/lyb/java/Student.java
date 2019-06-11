package com.lyb.java;

/**
 * @author liuyabo
 * @create 2019-06-11 21:33
 */
public class Student {

    private String CardId;
    private String Name;
    private int Age;
    private String Phone;


    public Student() {}

    public Student(String cardId, String name, int age, String phone) {
        CardId = cardId;
        Name = name;
        Age = age;
        Phone = phone;
    }

    public String getCardId() {
        return CardId;
    }

    public void setCardId(String cardId) {
        CardId = cardId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}

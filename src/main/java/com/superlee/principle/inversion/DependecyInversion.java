package com.superlee.principle.inversion;

/**
 * @author : lichao892
 * @date : 2019/10/21 15:25
 * <p>
 * 描述 :    TODO
 */

public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }

}

class Email {
    public String getInfo() {
        return "电子邮件信息：Hello";
    }
}

/**
 * 完成 Person 接受消息的功能
 * 方式1
 * 1. 简单容易想到
 * 2. 如果获取的对象是微信，短信等，则新增类，同时Person也要增加相应的接受方法
 * 3. 解决思路：引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口IReceiver发生依赖
 *             因为Email、微信属于接收范围，他们各自实现IReceiver接口就OK，这样符合依赖倒置原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
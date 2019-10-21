package com.superlee.principle.inversion.improve;

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

        person.receive(new WeiXin());
    }

}

interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息：Hello";
    }
}

class WeiXin implements IReceiver {

    @Override
    public String getInfo() {
        return "微信信息：Hello";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
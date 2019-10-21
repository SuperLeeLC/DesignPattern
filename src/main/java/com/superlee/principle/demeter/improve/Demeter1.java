package com.superlee.principle.demeter.improve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author : lichao892
 * @date : 2019/10/21 18:39
 * <p>
 * 描述 :    TODO
 */

public class Demeter1 {

    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollegeManager());
    }
}

class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class CollegeManager {
    //返回学院所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工Id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee() {
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------分公司员工--------------");
        for(CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

class SchoolManager {
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("学校总部员工ID= " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub) {
        sub.printEmployee();
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工--------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
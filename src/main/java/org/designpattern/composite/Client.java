package org.designpattern.composite;

/**
 * @Author: ybchen
 * @Date: 2023/7/5 10:49
 */
public class Client {
    public static void main(String[] args) {
        Component university = new University("清华大学","中国第一");
        Component college = new College("计算机学院","顶级学院");
        Component department= new Department("软件工程专业","码农");
        university.add(college);
        college.add(department);
        university.retrieve();

    }
}

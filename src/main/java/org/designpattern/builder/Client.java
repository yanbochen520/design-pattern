package org.designpattern.builder;

/**
 * @Author: ybchen
 * @Date: 2023/6/26 13:24
 */
public class Client {
    public static void main(String[] args) {
        User user=new User.UserBuilder("firstname","lastname").address("hubei").age(18).build();
        System.out.println(user);
    }
}

package org.ybchen1.iterator;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:44
 */

/**
 *客户端类，仅做测试使用
 */
public class Client {
    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf();
        bookShelf.appendBook(new Book("alice"));
        bookShelf.appendBook(new Book("bob"));
        bookShelf.appendBook(new Book("carly"));
        Iterator iterator= bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

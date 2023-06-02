package org.designpattern.iterator;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:42
 */

/**
 * 集合的元素
 */
public class Book {
    private  String authorName;



    public Book(String name) {
        this.authorName = name;
    }

    public Book() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String name) {
        this.authorName = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + authorName + '\'' +
                '}';
    }
}

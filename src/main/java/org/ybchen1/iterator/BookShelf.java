package org.ybchen1.iterator;

import java.util.ArrayList;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:43
 */

/**
 * 具体的集合类，此类实现iterator()
 */
public class BookShelf implements  Aggregate{

    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


    public int size(){
        return books.size();
    }

    public Book retriveBook(int index){
        return books.get(index);

    }
    public void appendBook(Book book){
        books.add(book);
    }
}

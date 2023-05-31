package org.ybchen1.iterator;

/**
 * @Author: ybchen
 * @Date: 2023/5/31 12:52
 */

/**
 * 具体的迭代器类
 */
public class BookShelfIterator implements  Iterator<Book>{

    private  BookShelf bookShelf;
    private  Integer index;


    public BookShelfIterator(BookShelf bookShelf,Integer index) {
        this.bookShelf = bookShelf;
        this.index=index;
    }
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index=0;
    }

    @Override
    public boolean hasNext() {
        return index< bookShelf.size();
    }

    @Override
    public Book next() {
        Book book=bookShelf.retriveBook(index);
        index=index+1;
        return book;
    }
}

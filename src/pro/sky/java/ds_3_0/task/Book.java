package pro.sky.java.ds_3_0.task;

import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
        return authorName + " : " + bookName + " : " + publishingYear;
        //здесь: bookName = getBookName() = this.getBookName() (метод в этом классе, он имеет доступ к полям напрямую)
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }
}

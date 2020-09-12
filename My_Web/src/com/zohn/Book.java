package com.zohn;

public class Book {
    private String bookAuthor;
    private String bookId;
    private String bookIntro;
    private String bookTitle;
    private String category;
    private String readCount;
    private String state;
    private String wordCount;

    public Book(String bookAuthor, String bookId, String bookIntro, String bookTitle, String category, String readCount, String state, String wordCount) {
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookIntro = bookIntro;
        this.bookTitle = bookTitle;
        this.category = category;
        this.readCount = readCount;
        this.state = state;
        this.wordCount = wordCount;
    }

    public Book() {
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWordCount() {
        return wordCount;
    }

    public void setWordCount(String wordCount) {
        this.wordCount = wordCount;
    }
}

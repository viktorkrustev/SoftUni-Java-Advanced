package IteratorsAndComparatorsLab.ComparableBook_03;

import java.util.ArrayList;
import java.util.List;

public class Book implements Comparable<Book>{
    private String title;
    private int year;
    List<String> authors;

    public Book(String title, int year, String... authors) {
        this.title = title;
        this.year = year;
        this.authors = new ArrayList<>(List.of(authors));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Book book2) {
        int result = this.title.compareTo(book2.title);
        if (result==0){
            result = Integer.compare(this.year, book2.year);
        }
        return result;
    }
}

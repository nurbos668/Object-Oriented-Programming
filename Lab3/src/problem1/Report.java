package problem1;

import java.util.List;

class Report implements Printable {
    private String title;
    private List<String> pages;

    public Report(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public void print() {
        System.out.println("--- " + title + " ---");
        pages.forEach(System.out::println);
    }
}
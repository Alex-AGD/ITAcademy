package main.java.workHome.multithreading.sample3;

public class Runner {
    static final String URL = " https://docviewer.yandex.by/view/17237602/?*=mfcKg%2BgRRq3NZczaIlerl96RTi97InVybCI6Inlh" +
            "LWRpc2s6Ly8vZGlzay%2FRgdGB0YvQu9C60Lgg0YDQsNCxLnR4dCIsInRpdGxlIjoi0YHRgdGL0LvQutC4INGA0LDQsS50eHQiLCJub2lm" +
            "cmFtZSI6ZmFsc2UsInVpZCI6IjE3MjM3NjAyIiwidHMiOjE1ODI0NjAyMjM4MjMsInl1IjoiODk0MDk1NDU4MTU2NDM1ODkzMCJ9";

    public static void main(String[] args) {



    Document doc = new Document();

    Writer[] writers = {
            new Writer(doc, "file1.pdf"),
            new Writer(doc, "file2.pdf"),
            new Writer(doc, "file3.pdf"),

    };
    for (Writer writer : writers)
    writer.start();

    Downloader downloader = new Downloader(URL,doc);
    downloader.start();
}}

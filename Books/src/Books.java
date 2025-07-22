import java.util.Scanner;

public class Books {
    private
    int year;
    String author;
    String name;

    Scanner scanner = new Scanner(System.in);

    Books(){}
    Books(String name,int year,String author){
        this.name = name;
        this.year = year;
        this.author = author;
    }

    public void setBooks(){
        scanner.next(name);
        scanner.nextInt(year);
        scanner.next(author);
    }

    public void getBooks(){
        System.out.println("Name of book is:"+name+" year:"+year+" author:"+author);
    }
}

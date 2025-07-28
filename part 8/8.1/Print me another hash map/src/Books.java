public class Books {
    private String bookName;
    private int publishDate;

    public Books(String bookName,int publishDate){
        this.bookName = bookName;
        this.publishDate = publishDate;
    }

    public String toString() {
        return "Name: "+bookName+"( "+publishDate+" )";
    }
}

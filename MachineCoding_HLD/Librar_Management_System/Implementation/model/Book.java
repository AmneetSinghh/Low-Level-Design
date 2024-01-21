package MachineCoding_HLD.Librar_Management_System.Implementation.model;

public class Book {
    private String author;
    private String subject;
    private String title;
    private long publishedAt;
    private int noOfPages;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;
    private String uniqueCode; // which will same for copies of all books.


    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(long publishedAt) {
        this.publishedAt = publishedAt;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }


    public void init(String uniqueCode){
        String mockk = "MOCKK_"+uniqueCode;
        setAuthor(mockk);
        setTitle(mockk);
        setAuthor(mockk);
        setAuthor(mockk);
        setUniqueCode(uniqueCode);
    }

}

package MachineCoding_HLD.Librar_Management_System.Implementation.model;

import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BooKType;
import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookFormat;
import MachineCoding_HLD.Librar_Management_System.Implementation.enums.BookStatus;

/*
* Book item is library book
*/

public class BookItem extends Book{
   private int id;
   private Rack rack;
   private BookStatus status;
   private BookFormat bookFormat;
   private BooKType type;



   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }




   public Rack getRack() {
      return rack;
   }

   public void setRack(Rack rack) {
      this.rack = rack;
   }

   public BookStatus getStatus() {
      return status;
   }

   public void setStatus(BookStatus status) {
      this.status = status;
   }

   public BookFormat getBookFormat() {
      return bookFormat;
   }

   public void setBookFormat(BookFormat bookFormat) {
      this.bookFormat = bookFormat;
   }

   public BooKType getType() {
      return type;
   }

   public void setType(BooKType type) {
      this.type = type;
   }

   public void init(int id, Book book){
      setId(id);
      setAuthor(book.getAuthor());
      setTitle(book.getTitle());
      setSubject(book.getSubject());
      setPublishedAt(book.getPublishedAt());
      setUniqueCode(book.getUniqueCode());
      setRack(new Rack());
      setStatus(BookStatus.AVAILABLE);
      setType(BooKType.CLASSIC);
   }

}

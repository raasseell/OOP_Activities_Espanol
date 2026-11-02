/*
  Name: Rushell E. Español
  Section: BSIT-2B
  Date: November 2, 2026
 */
public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(
            "Noli Me Tangere", "Jose Rizal", "ISBN-001", 350.00
        );

        Book book2 = new Book(
            "El Filibusterismo", "Jose Rizal", "ISBN-002", 320.00
        );

        EBook book3 = new EBook(
            "Florante at Laura",
            "Francisco Balagtas",
            "ISBN-003",
            150.00,
            "PDF"
        );

        System.out.println("===== BOOK INFORMATION =====");
        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        System.out.println("===== E-BOOK =====");
        book3.displayInfo();
        System.out.println();

        book2.setPrice(299.50);

        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());
    }
}

/*
  REFLECTION QUESTIONS
 
  1. Why is it better to change the price through setPrice()
     instead of making price public?
 
  Answer: Using setPrice() is better because it checks the value
  before changing the price. This helps prevent negative or invalid
  prices.
 
  2. Which members does EBook inherit from Book, and which does
     it add on its own?
 
  Answer: EBook inherits the title, author, ISBN, price, getters,
  setters, and displayInfo() method from Book. It also has its own
  fileFormat attribute, getter, setter, and updated displayInfo()
  method.
 
  3. If the library later adds an AudioBook, how can inheritance help?
 
  Answer: We can create an AudioBook class that extends Book.
  It can use the existing book information and methods, then add
  its own details like audio format and narrator. This saves time
  because we don't have to write everything again.
 */
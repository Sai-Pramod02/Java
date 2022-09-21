import java.util.Scanner;
class library{
    String []books = new String[100];
    int no_of_books;
    void addBook(String book){
        books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+" has been added successfully!");
    }
    void showAvailable_books(){
        for(int i=0;i<books.length;i++){
            if(this.books[i]==null){
                continue;
            }
            System.out.println(this.books[i]);
        }
    }
    void issueBooks(String book){
       for(int i=0;i<books.length;i++){

           if(book.equals(books[i])){
               System.out.println("The book has been issued");
               this.books[i]=null;
               return;

           }
       }
        System.out.println("This book does not exist");
    }
    void returnBooks(String book){
        books[no_of_books]= book;
        no_of_books++;
        System.out.println(book+" has been returned!");
    }
}
public class Library_Management {
    public static void main(String[] args) {
        library centralLibrary = new library();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1 FOR ADDING BOOK \n ENTER 2 FOR VIEWING AVAILABLE BOOKS \n ENTER 3 FOR ISSUING BOOK \n ENTER 4 FOR RETURNING BOOK");
        int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the book which is to be added");
                String b = sc.next();
                centralLibrary.addBook(b);

            } else if (choice == 2) {
                centralLibrary.showAvailable_books();
            } else if (choice == 3) {
                System.out.println("Enter the book to be issued");
                String a = sc.nextLine();
                centralLibrary.issueBooks(a);

            } else if (choice == 4) {
                System.out.println("Enter the book to be returned");
                String c = sc.nextLine();
                centralLibrary.returnBooks(c);

            }
        }
    }


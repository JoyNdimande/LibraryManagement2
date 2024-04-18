import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList; // Import ArrayList class

public class Main {
    static ArrayList<Book> bookCollection = new ArrayList<>(); // Declare BookCollection
    private static boolean isAvailable;

    public static void main(String[] args) {
        // Adding books from a string

        System.out.println("Welcome CTU-Library Menu");

        // Display options
        System.out.println("Please choose an option:");
        System.out.println("1. Add User");
        System.out.println("2. Return book(Add book)");
        System.out.println("3. Display All Books");
        System.out.println("4. Search Bar");
        System.out.println("5. Exit");

        // Read user input
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        // Perform based on selected option
        switch (option) {
            case 1:
                System.out.println("You selected Option 1.");
                getUserInformation();
                break;
            case 2:
                System.out.println("You selected Option 2.");
                addNewBook();
                break;
            case 3:
                System.out.println("You selected Option 3.");
                displayAllBooks();
                break;
            case 4:
                System.out.println("You selected Option 4.");
                searchBar();
                break;
            case 5:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please select a valid option.");
        }
    }


        static void getUserInformation() {
        System.out.println("Please enter preferred name:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter E-mail:");
        String email;
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        do {
            email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                System.out.println("Invalid E-mail. Please enter an active E-mail:");
            }
        } while (!pattern.matcher(email).matches());

        System.out.println("User added successfully.");
    }


        public static void addNewBook() {
        String[] books = {
                "50 shades of Grey by David Smith",
                "Lion King by Casssie Dlamini",
                "Empire by Flakes Ndimande",
                "2012 by Flankle Joe",
                "Queen of Rap by Nicki Minaj"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();
        System.out.println("Enter the author of the book:");
        String author = scanner.nextLine();
        Book book = new Book();
        System.out.println("Book added successfully: " + title + " by " + author);
            System.out.println("Thank you <3 ");
    }



        static void displayAllBooks() {
            System.out.println("Displaying All Books...");
            // Array of book titles
            String[] books = {
                    "50 shades of Grey by David Smith",
                    "Lion King by Casssie Dlamini",
                    "Empire by Flakes Ndimande",
                    "2012 by Flankle Joe",
                    "Queen of Rap by Nicki Minaj"
            };

            System.out.println("List of Books:");
            for (int i = 0; i < books.length; i++) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }



         static void  searchBar(){
            String[] books = {
                    "50 shades of Grey by David Smith",
                    "Lion King by Casssie Dlamini",
                    "Empire by Flakes Ndimande",
                    "2012 by Flankle Joe",
                    "Queen of Rap by Nicki Minaj"

            };
             Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the title of the book to search:");
            String searchTitle = scanner.nextLine();

            int index = searchBar(books, searchTitle);
            if (index != -1) {
                System.out.println("Book found at index ");
            } else {
                System.out.println("Book not found.");
            }
        }

    private static int searchBar(String[] books, String searchTitle) {
        return 0;
    }
}

    class Book {
        private String title;
        private String author;

        // Constructor
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Book() {

        }

        // Getters
        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }









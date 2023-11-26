public class App {
    public static void main(String[] args) {
        Author author1 = new Author("Лев","Толстой");
        Author author2 = new Author("Карл","Маркс");
        Book book1 = new Book("Война и мир", author1, 1873);
        Book book2 = new Book("Капитал", author2, 1867);
        System.out.println(book1);
        System.out.println(book2);
        book1.setPublishingYear(2020);
        book2.setPublishingYear(2023);
        System.out.println("\nПоменяли годы публикации книг:");
        System.out.println(book1);
        System.out.println(book2);
    }
}
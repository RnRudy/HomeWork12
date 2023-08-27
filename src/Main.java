public class Main {
    public static void createSpace() {
        System.out.println("~~~~~~~~~~~~~~~");
    }

    public static void main(String[] args) {
        Author author = new Author("Николай ", "Гоголь");
        Author author1 = new Author("Александр ", "Дюма");
        Author author2 = new Author("Эрих Мария ", "Ремарк");
        System.out.println(author.getName());
        Book book = new Book("Мертвые души", author, 1842);
        Book book1 = new Book("Граф Монте-Кристо", author1, 1844);
        Book book2 = new Book("Три товарища", author2, 1936);
        createSpace();
        System.out.println("Название книги: " + book.getBookName());
        System.out.println("Автор:  " + author.getName() + author.getSurname());
        System.out.println("Год издания: " + book.getYearOfPublishing());
        book.setYearOfPublishing(1846);
        System.out.println("Год издания (новый): " + book.getYearOfPublishing());
        createSpace();
        System.out.println("Название книги: " + book1.getBookName());
        System.out.println("Автор: " + author1.getName() + author1.getSurname());
        System.out.println("Год издания: " + book1.getYearOfPublishing());
        book1.setYearOfPublishing(1950);
        System.out.println("Год издания (новый): " + book1.getYearOfPublishing());
        createSpace();
        System.out.println("Название книги: " + book2.getBookName());
        System.out.println("Автор: " + author2.getName() + author2.getSurname());
        System.out.println("Год издания: " + book2.getYearOfPublishing());
        book2.setYearOfPublishing(2000);
        System.out.println("Год издания (новый): " + book2.getYearOfPublishing());


    }


}
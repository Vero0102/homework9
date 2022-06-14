package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        Author authorCardNumber1 = new Author("Габриэль Гарсиа", "Маркес");
        Author authorCardNumber2 = new Author("Кэти", "Сьерра");

        Book bookCardNumber1 = new Book("Сто лет одиночества", authorCardNumber1, 1967);
        Book bookCardNumber2 = new Book("Изучаем Java", authorCardNumber2, 2003);

        System.out.println("Название книги: " + bookCardNumber1.getTitle() + ". Год издания: " + bookCardNumber1.getYearOfPublication() + ". Автор: " + bookCardNumber1.getAuthor().getSurname() + " " + bookCardNumber1.getAuthor().getName() + ".");
        System.out.println("Название книги: " + bookCardNumber2.getTitle() + ". Год издания: " + bookCardNumber2.getYearOfPublication() + ". Автор: " + bookCardNumber2.getAuthor().getSurname() + " " + bookCardNumber2.getAuthor().getName() + ".");

        bookCardNumber2.setYearOfPublication(2021);

        System.out.println("Название книги: " + bookCardNumber2.getTitle() + ". Год издания: " + bookCardNumber2.getYearOfPublication() + ". Автор: " + bookCardNumber2.getAuthor().getSurname() + " " + bookCardNumber2.getAuthor().getName() + ".");
    }
}


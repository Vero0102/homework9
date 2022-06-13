package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        Author authorCardNumber1 = new Author("Габриэль", "Гарсиа", "Маркес", "", "", "");
        Author authorCardNumber2 = new Author("Кэти", "", "Сьерра", "Берт", "", "Бэйтс");

        Book bookCardNumber1 = new Book("Сто лет одиночества", authorCardNumber1, 1967);
        Book bookCardNumber2 = new Book("Изучаем Java", authorCardNumber2, 2003);

        System.out.println("Название книги: " + bookCardNumber1.getTitle() + ". Год издания: " + bookCardNumber1.getYearOfPublication() + ". Автор: " + bookCardNumber1.getAuthor().getSurname1() + " " + bookCardNumber1.getAuthor().getName1() + " " + bookCardNumber1.getAuthor().getMiddleName1() + ".");
        System.out.println("Название книги: " + bookCardNumber2.getTitle() + ". Год издания: " + bookCardNumber2.getYearOfPublication() + ". Авторы: " + bookCardNumber2.getAuthor().getSurname1() + " " + bookCardNumber2.getAuthor().getName1() + " и " + bookCardNumber2.getAuthor().getSurname2() + " " + bookCardNumber2.getAuthor().getName2() + bookCardNumber2.getAuthor().getMiddleName2() + ".");

        bookCardNumber2.setYearOfPublication(2021);

        System.out.println("Название книги: " + bookCardNumber2.getTitle() + ". Год издания: " + bookCardNumber2.getYearOfPublication() + ". Авторы: " + bookCardNumber2.getAuthor().getSurname1() + " " + bookCardNumber2.getAuthor().getName1() + " и " + bookCardNumber2.getAuthor().getSurname2() + " " + bookCardNumber2.getAuthor().getName2() + bookCardNumber2.getAuthor().getMiddleName2() + ".");
    }
}


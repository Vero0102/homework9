package pro.sky.java.course1;

public class Author {
    private final String name1;
    private final String middleName1;
    private final String surname1;
    private final String name2;
    private final String middleName2;
    private final String surname2;

    public Author(String name1, String middleName1, String surname1, String name2, String middleName2, String surname2) {
        this.name1 = name1;
        this.middleName1 = middleName1;
        this.surname1 = surname1;
        this.name2 = name2;
        this.middleName2 = middleName2;
        this.surname2 = surname2;
    }

    public String getName1() {
        return name1;
    }

    public String getMiddleName1() {
        return middleName1;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getName2() {
        return name2;
    }

    public String getMiddleName2() {
        return middleName2;
    }

    public String getSurname2() {
        return surname2;
    }
}


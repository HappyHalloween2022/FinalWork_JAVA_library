import java.io.*;

public class ReaderMain {
    public static void main(String[] args) {

        class Reader {
            private String name;
            private int number;
            private String date;
            private String phone;
            private String facult;

            public void setName(String name) {
                this.name = name;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public void setFacult(String facult) {
                this.facult = facult;
            }

            public String getName() {
                return name;
            }

            public int getNumber() {
                return number;
            }

            public String getDate() {
                return date;
            }

            public String getPhone() {
                return phone;
            }

            public String getFacult() {
                return facult;
            }

            public void takeBook(String book) {
                System.out.println("Студент " + name + " взял книгу " + book);
            }

            public void returnBook(String book) {
                System.out.println("Студент " + name + " вернул книгу " + book);
            }

            public void info() {
                System.out.println(name + " " + number + " " + facult + " " + phone);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())
                    return false;

                Reader reader = (Reader) o;

                if (number != reader.number)
                    return false;
                if (name != null ? !name.equals(reader.name) : reader.name != null)
                    return false;
                if (date != null ? !date.equals(reader.date) : reader.date != null)
                    return false;
                if (phone != null ? !phone.equals(reader.phone) : reader.phone != null)
                    return false;
                return facult != null ? facult.equals(reader.facult) : reader.facult == null;
            }

        }
        Reader st1 = new Reader();
        Reader st2 = new Reader();

        st1.setName("Петров В. В");
        st1.setNumber(215);
        st1.setDate("25/09/1990");
        st1.setFacult("Юриспруденция");
        st1.setPhone("0500005454");
        System.out.println("Студент " + st1.getName() + " с чит. билетом номер " + st1.getNumber()
                + " который учится на факультете " + st1.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Иванов А.А.");
        st2.setNumber(216);
        st2.setDate("12/05/1990");
        st2.setFacult("Логистика");
        st2.setPhone("0500546974");
        System.out.println("Студент " + st2.getName() + " с чит. билетом номер " + st2.getNumber()
                + " который учится на факультете " + st2.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());

        st1.takeBook("Приключения");

        st1.returnBook("Ужасы");

        st1.info();
        st2.info();

    }
}

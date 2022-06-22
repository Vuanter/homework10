public class Main {
    public static void main(String[] args){

// Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на прошлом уроке.
// Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.


        Author author1 = new Author("Александр", "Пушкин");
        System.out.println(author1);
        System.out.println(author1.hashCode());


        Author author2 = new Author("Антон", "Чехов");
        System.out.println(author2);
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));

        Book book1 = new Book("Капитанская дочка", author1, 1836);
        System.out.println(book1);
        System.out.println(book1.hashCode());


        Book book2 = new Book("Хамелеон", author2, 1884);
        System.out.println(book2);
        System.out.println(book2.hashCode());

        System.out.println(book1.equals(book2));



    }

}
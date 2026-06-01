import java.util.*;

class Book {
    ArrayList <String> details=new ArrayList<>();
    Book(){
        details.add("book details");
        System.out.println("details");
    }
    Book(String name){
        System.out.println("book name = " + name);
    }
    Book(String name, int price){
        System.out.println(name+" "+price);
    }
    Book(String name, int price , String author ){
        System.out.println(name+" "+price+" "+author);
    }
    Book(String name, int price , String author, String language ){
        System.out.println(name+" "+price+" "+author+" "+language);
    }
    public static void main(String[] args) {
        Book b1= new Book();
        Book b2= new Book("java");
        Book b3= new Book("python",500);
        Book b4= new Book("c++",600,"Jhon deo");
        Book b5= new Book("Javascrpipt", 750, "Ramjus Lerder","Scriptiing");
    }
    
}









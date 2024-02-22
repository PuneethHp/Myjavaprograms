package Myprogs.Aggregation;
class Publisher{

    String name;
    String publisherID;
    String city;

    Publisher(String name, String publisherID, String city) {
        this.name = name;
        this.publisherID = publisherID;
        this.city = city;
    }
}


class Authors
{
    String authorName;
    int age;
    String place;


    Authors(String name, int age, String place)
    {
        this.authorName = name;
        this.age = age;
        this.place = place;
    }
}

class Books
{
    String name;
    int price;

    Authors auther;
    Publisher publisher;
    Books(String n, int p, Authors auther, Publisher publisher )
    {
        this.name = n;
        this.price = p;
        this.auther = auther;
        this.publisher = publisher;
    }
    public static void main(String[] args) {
        Authors auther = new Authors("King", 35, "India");
        Publisher publisher = new Publisher("Moon Publication","Moon-III4", "Nellore");
        Books b = new Books("Study of Java", 500, auther, publisher);
        System.out.println("Book Name: "+b.name);
        System.out.println("Book Price: "+b.price);
        System.out.println("----Author Details-----");
        System.out.println("Auther Name: "+b.auther.authorName);
        System.out.println("Auther Age: "+b.auther.age);
        System.out.println("Auther place: "+b.auther.place);
        System.out.println("------Publisher Details-------");
        System.out.println("Publisher Name: "+b.publisher.name);
        System.out.println("Publisher ID: "+b.publisher.publisherID);
        System.out.println("Publisher City: "+b.publisher.city);
    }

}


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class person {

    private String name, surname, city, zipCode, street;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Retrieving data about a person.");

        System.out.println("Enter surname:");
        surname = br.readLine();

        System.out.println("Enter first name:");
        name = br.readLine();

        System.out.println("Enter street:");
        street = br.readLine();

        System.out.println("Enter zip code:");
        zipCode = br.readLine();

        System.out.println("Enter city:");
        city = br.readLine();
    }

    public void print() {
        System.out.println("Display the data");

        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + name);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) throws IOException {
        person person = new person();
        person.initialize();
        person.print();
    }
}

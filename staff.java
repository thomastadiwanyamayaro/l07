import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Person {

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
}

class staff extends person {
    String education;
    String position;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();

        System.out.println("Enter education:");
        education = br.readLine();

        System.out.println("Enter position:");
        position = br.readLine();
    }

    public void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

class HR {
    public static void main(String[] args) throws IOException {
        staff employee = new staff();
        employee.initialize1();
        employee.print1();
    }
}

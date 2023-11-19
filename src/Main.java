import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("== LAB_3 ==");
        //3.2Konwersja znaków na liczby odpowiednich typów (int, float, long, double)
        System.out.println("Zad.2");
        System.out.println("--------------------------------------");
        String txt = "20231119";
        System.out.println("Łańcuch znaków: " + txt);
        //Konwersja na int
        int zmiennaInt = Integer.parseInt(txt);
        System.out.println("Konwersja łańcuchu znaków na int: " + zmiennaInt);
        //Konwersja na long
        long zmiennaLong = Long.parseLong(txt);
        System.out.println("Konwersja łańcuchu znaków na long: " + zmiennaLong);
        //Konwersja na float
        float zmiennaFloat = Float.parseFloat(txt);
        System.out.println("Konwersja łańcuchu znaków na float: " + zmiennaFloat);
        //Konwersja na double
        double zmiennaDouble = Double.parseDouble(txt);
        System.out.println("Konwersja łańcuchu znaków na double: " + zmiennaDouble);
        //3.3 Przetestuj działanie operatora trójargumentowego
        System.out.println("Zad.2");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź dowolną liczbę całkowitą: ");
        int liczbaCal = scanner.nextInt();
        String wynik = (liczbaCal % 2 == 0) ? "Jest to liczba Parzysta!" : "Jest to liczba Nieparzysta!";
        System.out.println(wynik);
        //System.out.println("Liczba całkowita to: " + liczbaCal);


    }
}
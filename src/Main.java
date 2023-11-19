// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

    }
}
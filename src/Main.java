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
        System.out.println("Zad.3");
        System.out.println("--------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź dowolną liczbę całkowitą: ");
        int liczbaCal = scanner.nextInt();
        String wynik = (liczbaCal % 2 == 0) ? "Jest to liczba Parzysta!" : "Jest to liczba Nieparzysta!";
        System.out.println(wynik);
        //System.out.println("Liczba całkowita to: " + liczbaCal);
        //3.4 Przetestuj działanie słów kluczowych brake i contiue wraz z etykietą
        System.out.println("Zad.4");
        System.out.println("--------------------------------------");
        //Etykieta i break
        System.out.println("Etykieta i Break");
        E1:
        for(int k = 0; k <= 3; k++){
            for(int l = 0; l <= 3; l++){
                System.out.println(k + "\t" + l);
                if(k==2 && l==3){
                    break E1;
                }
            }System.out.println();
        }
        System.out.println();
        //Etykieta i continue
        System.out.println("Etykieta i Continue");
        E2:
        for(int k = 0; k <= 3; k++){
            for(int l = 0; l <= 3; l++){
                System.out.println(k + "\t" + l);
                if(k==1){
                    continue E2;
                }
            }System.out.println();
        }
        //3.5 Przetestuj działanie operatorów oraz ustal ich kolejność
        System.out.println("Zad.5");
        System.out.println("--------------------------------------");
        int x = 3;
        int y = 5;
        int z = 12;
        //Operator arytmetyczny
        int wynik1 = (x + y) * z;
        int wynik2 = x + y * z;
        System.out.println("(x + y) * z =  " + wynik1);
        System.out.println("x + y * z =  " + wynik2);
        //3.6 Porównać działanie operatora == i metody equals.
        System.out.println("Zad.6");
        System.out.println("--------------------------------------");
        //Operator '==' porównuje referencje obiektów, a nie ich zawartość.
        //Jeżeli porównywane obiekty będą znajdowały się pod tą samą referencją w pamięci to zwrócona zostanie
        //wartość true
        String String1 = new String(" Przykładowy tekst.");
        String String2 = new String(" Przykładowy tekst.");
        System.out.println("String1 == String2 >> " + (String1 == String2) + " - ta sama wartość, inne miejsce w pamięci.");
        String String3 = new String ("Kolejne porównanie");
        String String4 = new String ("Inne wartości w porównywanych stringach");
        System.out.println("String3 == String4 >> " + (String3 == String4) + " - inna wartość, inne miejsce w pamięci." );
        String String5 = String3;
        System.out.println("String5 == String3 >> " + (String5 == String3) + " - to samo miejsce w pamięci.");

        //W przypadku typów prostych, jak int czy char, operator '==', porówna wartości
        int v = 7;
        int w = 7;

        System.out.println( "Porównanie int v z int w (v == w) " +  (v == w));

        //Metoda equals służy do porównywania zawartości obiektów, a nie ich referencji,
        // dlatego też zazwyczaj jest przesłaniana przez klasy.

        System.out.println("String1.equals(String2) >> " + String1.equals(String2) + " - te same wartości.");
        System.out.println("String3.equals(String4) >> " + String3.equals(String4) + " - różne wartości.");

        //3.7 Napisz metodę, która przyjmuje tablicę liczb całkowitych i odwraca jej kolejność.
        //Wykorzystaj pętlę for do przejścia przez tablicę.
        System.out.println("Zad.7");
        System.out.println("--------------------------------------");
        //Utworzenie tablicy liczb całkowitych
        int[] TablicaInt = {1,2,3,4,5,6,7,8,9,10};
        //Wypisanie elementów tablicy za pomocą pętli for
        System.out.print("TablicaINT: ");
        for (int i = 0; i < TablicaInt.length; i++)
        {
            System.out.print(TablicaInt[i] + " ");
        }
        //Odwrócenie kolejności elementów Tablicy za pomocą metody odwrocTablice
        odwrocTablice(TablicaInt);
        System.out.println();
        // Wypisanie elementów tablicy po odwróceniu
        System.out.print("Odwrócona TablicaINT: ");
        //Inny rodzaj pętli for
        for (int value: TablicaInt)
        {
            System.out.print(value + " ");
        }








        System.out.println("\n");
    }
    //Metoda odwracająca tablicę
    public static void odwrocTablice(int[] array)
    {
        //uzyskanie długości (licz. elem) tablicy
        int dlugosc = array.length;
        for(int i = 0, j = dlugosc - 1; i < j; i++, j--)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
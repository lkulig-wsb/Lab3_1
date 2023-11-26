import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("== LAB_3 ==");
        //3.2 Konwersja znaków na liczby odpowiednich typów (int, float, long, double)
        System.out.println("Zad.2");
        System.out.println("--------------------------------------");
        String txt = "20231119";
        System.out.println("Łańcuch znaków: " + txt);
        // Parsowanie ciągu znaków na liczbę całkowitą za pomocą metody Integer.parseInt().
        // Jako argument do metody parseInt() przekazujemy zmienną String o nazwie txt.
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
        //Wczytanie liczby całkowitej od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź dowolną liczbę całkowitą: ");
        int liczbaCal = scanner.nextInt();
        //Użycie operatora trójargumentowego ('? :') do sprawdzenia czy liczba jest parzysta, czy nie.
        //Jeżeli reszta z dzielenia przez 2 wynosi 0, to wyświetlany jest komunikat że liczba jest parzysta, innaczej
        //komunikat że liczba jest nieparzysta.
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
        int a = 10;
        int b = 20;
        //Operator arytmetyczny
        int wynik1 = (x + y) * z;
        int wynik2 = x + y * z;
        System.out.println("(x + y) * z =  " + wynik1);
        System.out.println("x + y * z =  " + wynik2);
        //Hierarchia operatorów
        // 1. x * y - mnożenie 3 * 5 daj 15
        // 2. a++ postinkrementacja zwraca oryginalną wartość 'a', czyli 10, a następnie zwiększa a o 1,
        // więc po tej operacji a wynosi 11
        // 3. (a++)/a daje nam wynik 10/11 ponieważ postinkrementacja miała miejsce w poprzedniej operacji
        // 4. (z+x*y) - a (10/11), następnie podstawiamy wartości (12+15) - (10 + (10/11))
        // 10/11 jest zaokrąglane w dół do 0 w kontekście liczb całkowitych
        // 5. 27 - (10 + 0) = 27 - 10 = 17
        System.out.println("Test hierarchii operatorów: ");
        System.out.println("(z+x*y)-a+(a++)/a = " + ((z+x*y)-a+(a++)/a));
        //int q = 11;
        //int r = 10;
        //System.out.println(r/q);
        //Operatory jednoargumentowe (iteracja, dekrementacje).
        System.out.println("z = "+ z);
        // inkrementacja, zwiększenie zmiennej z o 1, czyli z+1.
        z++;
        System.out.println("z++  =" + z);
        System.out.println("y = " + y);
        // dekrementacja, zmiejszenie wartości zmiennej y o 1, czyli y-1.
        y--;
        System.out.println("y-- = " + y);
        System.out.println("a = " + a);
        ++a;
        System.out.println("++a = " + a);
        System.out.println("b = " + b);
        --b;
        System.out.println("--b = " + b);

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
        System.out.print("TablicaInt[]: ");
        for (int i = 0; i < TablicaInt.length; i++)
        {
            System.out.print(TablicaInt[i] + " ");
        }
        //Odwrócenie kolejności elementów Tablicy za pomocą metody odwrocTablice
        odwrocTablice(TablicaInt);
        System.out.println();
        // Wypisanie elementów tablicy po odwróceniu
        System.out.print("Odwrócona TablicaInt[]: ");
        //Inny rodzaj pętli for
        for (int value: TablicaInt)
        {
            System.out.print(value + " ");
        }

        //3.8 Wykonaj kod z instrukcji laboratoryjnej dotyczący parametrów programów wyniki
        //umieść w sprawozdaniu.

        System.out.println();
        System.out.println("Zad.8");
        System.out.println("--------------------------------------");

        System.out.println("Liczba wprowadzonych parametrów: " + args.length);
        System.out.print("Wprowadzone parametry to: ");
        for(int i=0; i < args.length; i++)
        {
            System.out.print(args[i] + "\t");
        }

        //3.9 Przygotować dwie metody zwracające boolean i wyświetlające informacje na ekran,
        //wykorzystać obie w instrukcji if z wykorzystaniem operatorów logicznych.
        System.out.println();
        System.out.println("Zad.9");
        System.out.println("--------------------------------------");
        System.out.print("Wprowadź liczbę całkowitą: ");
        int liczba = scanner.nextInt();
        if(czyLiczbaParzysta(liczba) && czyLiczbaWiększa(liczba))
        {
            System.out.println("Liczba jest parzysta i większa od 20!");
        }else if (czyLiczbaParzysta(liczba) && !czyLiczbaWiększa(liczba))
        {
            System.out.println("Liczba jest parzysta, ale nie większa od 20!");
        } else if (!czyLiczbaParzysta(liczba) && czyLiczbaWiększa(liczba)) {
            System.out.println("Liczba nie jest parzysta, ale jest większa od 20!");
        }else {System.out.println("Liczba nie jest parzysta i liczba nie jest większa od 20!");}

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
    // Metoda sprawdzająca czy liczba jest parzysta
    public static boolean czyLiczbaParzysta(int liczba)
    {
        return liczba % 2 == 0;
    }
    //Metoda sprawdzająca czy liczba jest większa od 20
    public static boolean czyLiczbaWiększa(int liczba)
    {
        return liczba > 20;
    }


}
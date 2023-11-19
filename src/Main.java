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

    }
}
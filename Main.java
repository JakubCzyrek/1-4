import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
  Scanner Wczytywanie = new Scanner(System.in);
    int x, y, suma;
    System.out.println("Wprowadz liczbe x:");
    x=Wczytywanie.nextInt();
    System.out.println("Podaj liczbe y:");
    y=Wczytywanie.nextInt();
    System.out.println("wybierz działanie");
    System.out.println("1 suma boków dwóch kwadratów o bokach x oraz y");
    System.out.println("2 Pole kwadratu o bokach x oraz y");
      System.out.println("3 Pole rombu o przekątnych x oraz y");
    System.out.println("4 Suma pol dwoch prostokątów o bokach x i y");

    System.out.pritln("Wybierz funkcje 1-4");
      int wariant =scan.nextInt();

    switch(wariant){
      case 1  ;
        a=4 * Math.pow(x,2);
        b=6 * Math.pow(y,2);
        wynik=a+b;
        System.out.println("Wynik ="+wynik);
        break;
      case 2
        c=x+y;
        wynik=c;
        System.out.println("wynik="+wynik);
        break;
    }
  }
}
}
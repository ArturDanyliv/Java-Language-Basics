import  *;
import  java.awt.event*;
class Impreza{
    public static void tworzZaproszenie() {
        Frame f = new Frame();
        Label l = new Label("Impreza u Tomka!");
        Button b = new Button("Sie rozumie!");
        Button c = new Button("Zapomnij :-(");
        Panel p = new Panel();
        p.add(|);
        // ... dalsza czesc kodu 
    }
}


int wielkosc = 27; // Deklaruje zmienna calkowita o nazwie wielkosc i przypisuje jej wartosc 27

String imie  = "Azorek"; // Deklaruje zmienna lanuchowa o nazwie immie i przypisuje jej wartosc Azorek

Pies mojPies = new Pies (imie , wielkosc); // Deklaruje zmienna typu Pies o nzawie mojPies i tworzy nowy obiekt klasy 
// Pies uzywajac przy tym zmiennych imie i wielkosc 

x = wielkosc - 5; // Odejmuje liczbe 5 od 27 (wartosci zmiennej "wielkosc") i wynik zapisuje w zmiennej "x"

if ( x < 15) nojPies.szczekaj(8); // Jesli wartosc zmiennej x (czyli 22) jest mniejsza od 15 to kaze psu zaszczekac osiem razy 

while(x > 3) {  // Wykonuje petle tak dlugo , jak dlugo wartosc zmiennej x jest wieksza od 3

    myPies.zabawa(); // kaze psu bawic sie (cokolwiek to dla niego znaczy...)

} // To wyglada na koniec petli -- caly kod umieszczony pomiedzy nawiasami {} jest wykonywany w petli 

int[] listaNum = {2, 4, 6, 8}; // Deklaruje zmienna listaNum , ktora bedzie zawierac liczby calkowite i zapisuje w niej liczby : 2, 4, 6 i 8

System.out.print("Witamy"); // Wyswietla slowo Witamy najprawdopodobniej w wierszu polecen 

System.out.print("Pies: " + imie); // Wyswietla tekst ("Pies: Azorek" ma wartosc "Azorek") w wierszu polecen 

String liczba = "8"; // Deklaruje zmienna lancuchowa o nazwie "liczba" i zapisuje w niej znak "8" 

int z = Integer.parseInt(liczba); // Konwerujhe lancuch zawierajacy znakow "8" na liczbe o wartosci "8"

try {   // Probuje cos zrobic ... jednak wcale nie ma gwarancji  ze wykonanie operacji sie powiedzie  

    czytajPlik("mojPlik.txt"); // Odczytuje plik tekstowy o nazwie "mojPlik.txt"(a przynajmniej probuje to zrobic ...)

}  // ta proba kiedys musi sie skonczyc choc mozna by sprobowac zrobic takze inne rzeczy 

catch (FileNotFoundException ex) {  // To chyba tutaj dowiadujemy sie czy nasza proba zakonczyla sie powodzeniem 

    System.out.print("Nie znaleziono pliku ."); // Jesli nie udalo sie wykonac zamierzonej operacji w wierszu polecen 
    // wyswietlany jest kounikat "Nie znaleziono pliku"

} // Wyglada na to ze wszystko co umieszczono pomiedzy nawiasami {}, ma byc wykonane w razie niepowiedzenia operacji z bloku "try"

// 1.------> Umiesc definicje klasy w pliku zrodlowym
// 2.------> W klasie umiesc definicje metod 
// 3.------> W metodach umiesc instrukcje 

// 1.
public class Pies {

}

// 2.
public class Pies {
    void szczekaj(){

    }
}

// 3.
public class Pies {
    void szczekaj(){
        instrukcja1;
        instrukcja2;
    }
}

public class MojaPierwszaAplikacja {
    public static void main (String[] args){
        System.out.print("Ja rzadze!");
    }
}

// 1 ---> public klaca publiczna do ktorej kazdy ma dostep
// 2 ---> class klasa
// 3 ---> MojaPierwszaAplikacja to jest nazwa klasy 
// 4 ---> void typ wyniku zwracanego przez metode void oznacza ze metoda nie zwraca zadnej wartosci 
// 5 ---> main nazwa tej metody 
// 6 ---> (String[] args) argumenty przekazywane do metod do tej metody nalezy przekazac tablice lancuchow znakow (danych typu String) a tablica ta bedzie nosic nazwe Sring 
// 7 ---> System.out.print to wyswietenie danych na standardowym wyjsciu (wiersz polecen systemu)
// 8 ---> Lancuch znakow ktory chcemy wyswietlic 

// Instrukcje : deklaracke przypisanie wywolania metod i tak dalej 
int x = 3;
String imie = "Azorek";
x = x + 17;
System.out.print("x = " + x);
double b = Math.random();
// a to jest komentarz 

// Wukonala cos wielokrotnie : Petle for oraz while
while (x > 12) {
    x= x - 1;
}
for (int x = 0; x < 10; x = x +1){
    System.out.print("aktualnie x =  " + x );
}

/// Wykonala cos pod pewnym warunkiem 
/// Rozgalezienia testy if oraz if-else 
if (x == 10) {
    System.out.print("x musi miec wartosc 10");
} else {
    System.out.print("x jest rozne od 10 ");
}
if ((x < 3) && (imie.equals("Azorek"))) {
    System.out.print("Nie rusz! Do nogi! ");
} 
System.out.print("Ten wiersz jest wykonywany niezaleznie od wszystkiego! ");

public class Petelki {
    public static void main( String[] args) {
        int x = 1;
        System.out.println("Przed wykonaniem petli ");
        while (x < 4) {
            System.out.println("Wewnatrz petli ");
            System.out.println("Wartosc x = " + x);
            x = x + 1; 
        }
        System.out.println("I juz po petli ... ");
    }
}

// java Petelki 
// Przed wykonaniem petli 
// Wewnatrz petli
// Wartosc x = 1
// Wewnatrz petli 
// Wartosc x = 2
// Wewnatrz petli 
// Wartosc x = 3
// I juz po petli

class TestIf {
    public static void main(String[] args) {
        int x = 3;
        if ( x == 3) {
            System.out.println("x musi miec wartosc 3");
        }
        System.out.println("Ta instrukcja zawsze zostanie wykonana");
    }
}

// java TestIf
// x musi miec wartosc 3
// Ta instrukcja zawsze zostanie wykonana

class TestIf2 {
    public static void main(String[] args) {
        int x = 3;
        if (x == 3) {
            System.out.println("x musi miec wartosc 3");
        } else {
            System.out.println("x jest rozne od 3");
        }
        System.out.println("Ta instrukcja zawsze zostanie wykonana ");
    }
}

// java TestIf
// x musi miec wartosc 3
// Ta instrukcja zawsze zostanie wykonana 

class DooBee {
    public static void main (String[] args) {
        int x = 1;
        while ( x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1;
        }
        
        if (x == 1) {
            System.out.println("Do");
        }
    }
}

// > java Test
// DooBeeDooBeeDo

class PiosenkaOPiwie {
    public static void main ( String [] agrs ) {
        int iloscButelek = 99;
        String slowo = "bottles";
        while(iloscButelek > 0) {
            if (iloscButelek == 1) {
                slowo = "bottle"; // liczba pojedyncza 
            }
            System.out.println(iloscButelek + " " + slowo + "of beer on the wall");
            System.out.println(iloscButelek  + " " + slowo + "of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            iloscButelek = iloscButelek - 1;
            if (iloscButelek > 0) {
                System.out.println("iloscButelek " + " " + slowo + " of beer on the wall");

            } else {
                System.out.println("No more bottles of beer on the wall");
            } // koniec else
        } // koniec while
    } // koniec metody main
} // koniec klasy  

public class Krasnomowaca {
    public static void main (String[] args) {
        String[] listaSlow1 = {"sdfsd" , "sdfsfs", "gsgsdgs", "lmdgsl;mgsd", "gsgggsd"};
        String[] listaSlow2 = {"sdgsdgsg", "sdgsdgds", "gsgssd", "gsgsdgsdgs", "sdgsdgsdgds"};
        String[] listaSlow3 = {"gsgsd", "sdgdsgdg", "sdgsdgs", "gsdgsdgsdg", "gdsgsdgsg", "gsdgsdgsg"};
        
        // okreslenie ile slow jest w kazdej z list 
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;
        
        // generacja trzech losowych slow (lub zwrotow)
        int rnd1 = (int) (Math.random() * lista1Dlugosc); 
        int rnd2 = (int) (Math.random() * lista2Dlugosc);    
        int rnd3 = (int) (Math.random() * lista3Dlugosc);
        
        //stworzenie zdania 
        String zdanie = listaSlow1[rnd1] +" "+ listaSlow2[rnd2] +" "+ listaSlow3[rnd3];

        //Wyswietlenie zdania 
        System.out.println("To jest to czego nam trzba" + zdanie);
    }
}

class Ukladanka {
    public static void main (String[] args) {
        int x = 3;
        while (x > 0){
            { if (x > 2){
                System.out.println("a");
            }
            x = x -1;
            System.out.println("-");
            }
            
            if (x == 2) {
            System.out.println("b c");
            }
        
            x = x-1;
            System.out.println(" - ");

            if ( x == 1) {
                System.out.println("d");
                x = x - 1;
            }

        }
    } 
}

class CzwiczeniaB{
    public static void main(String[] args) {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3){
                System.out.println("Malutkie x");
            }
        }
    } 
}

class CwiczeniaA {
    public static void main (String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("Wielkie X");
            }
        }
    }
}

class Cwiczenie1C {
    int x = 5; { 
        while (x > 1) {
            x = x - 1;
            if (x < 3) {
                System.out.println("Malutkie x");
            }
        } 
    }
}

class ZagadkowyBasen1 {
    public static void nain (String[] args) {
        int x = 0;
        while (x < 4) {
            System.out.println("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if ( x > 1) {
                System.out.print("tyczny");
                x = x + 2;
            }
            if  ( x == 1) {
                System.out.print("asz");
            }
            System.out.println("");
            x = x + 1; 
        }
        
    }
}

class Pies {
    int wielkosc;
    String rasa;  // skladowe                  | 
    String imie ; // wielkosc ; rasa ; imie ;  |

    void szczekaj() {    // metoda szczekaj 
        System.out.println("Chau! Chauuu");
    }
}

// Napisz klase testujaca (Tester).
class PiesTester{
    public static void main (String[] args) {
        // Tutaj umiescimy kod         |
        // testujacy klase Pies        | klasa tylko metode main() (w nastepnym kroku umiescimy w tej metodzie jakis kod)
    }
}

// W klasie testujacej stworz obiekt i uzyj jego skladowych i metod 
class PiesTester1 {
    public static void main(String[] args) {
        Pies p = new Pies(); // utworz obiekt Pies
        p.wielkosc = 40; // uzyc operatora kropki (.) w celu okreslenia wilkosci Psa  ----> operator
        p.szczekaj ();'' // i wywolania jego metody szczekaj () -----> kropki 
    }
}

// Tworzenie i testowanie obiektow Film 
class Film {
    String tytul;
    String rodzaj;
    int ocena;

    void odtworz () {
        System.out.println("Odtwarzamy film.");
    }
}
public class FilmTester {
    public static void main (String[] args) {
        Film pierwszy = new Film();
        pierwszy.tytul = " Przeminelo z hossa ";
        pierwszy.rodzaj = "Tragedia";
        pierwszy.ocena = -2;
        
        Film drugi = new Film();
        drugi.tytul = " Matrix dla zuchwalych ";
        drugi.rodzaj = " Komedia ";
        drugi.ocena = 5;
        drugi.odtworz();

        Film trzeci = new Film();
        trzeci.tytul = " Byte Club ";
        trzeci.rodzaj = " Tragedia , ale o wydzwieku optymistycznym ";
        trzeci.ocena = 127;
    }
}

class Zgadywanka {
    Gracz p1;
    Gracz p2; // Klasa zgadywanka ma trzy skladowe sluzace do przechowywania trzech obiektow Gracz.
    Gracz p3;
    
    public void RozpocznijGre() {
        p1 = new Gracz(); 
        p2 = new Gracz(); // Utworzenie trzech obiektow Gracz i zapisanie ich w trzech skladowych 
        p3 = new Gracz();
    
        int typp1 = 0;
        int typp2 = 0; // Deklaracja trzech zmiennych w ktorych beda przechowywane trzy liczby wytypowane przez poszczegolnych graczy 
        int typp3 = 0;

        boolean p1odgad1 = false;
        boolean p2odgad2 = false; // Deklaracja trzech zmiennych ktore beda przechowywac wartosci true (prawda) lub false (falsz) w zaleznosci od odpowiedzi konkretnego gracza
        boolean p3odgad3 = false;  

        int liczbaOdgadywana = (int) (Math.random() * 10);                // Wyznaczanie liczby , jaka beda musieli ogadnac gracze 
        System.out.println("Mysle o liczbie z zakresu od 0 do 9..."); 
        
        while(true) {
            System.out.println("Nalezy wytypowac liczbe: " + liczbaOdgadywana);

            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println("Gracz pierwszy wytypowal liczbe: " + typp1); // |
            //                                                             
            typp2 = p2.liczba;                                               
            System.out.println("Gracz pierwszy wytypowal liczbe: " + typp2); // | Pobranie liczb wytypowanych przez kazdego z graczy (wynikow wywolania metody zgaduj()) poprzez odczytanie jej ze skladowych obiektow graczy 

            typp3 = p3.liczba;
            System.out.println("Gracz pierwszy wytypowal liczbe: " + typp3); // | 

            if (typp1 == liczbaOdgadywana) {
                p1odgad1 = true;
            }

            if (typp2 == liczbaOdgadywana) { // Sprawdzene liczb wytypowanych przez graczy w celu okreslenia czy odpowiadaja one wyznaczonej liczbie .Jesli gracz wytypowal
                p2odgad2 = true;             // poprawnie , to odpowiednej zmiennej przypisywana jest wartosc true (pamietaj ze domyslnie zmienna ta ma wartosc false )
            }

            if (typp3 == liczbaOdgadywana) {
                p3odgad3 = true;
            }

            if (p1odgad1 || p2odgad2 || p3odgad3) { // Jesli gracz pierwszy lub gracz drugi , lub trzeci odgadl ...( operator || to logiczne LUB )
                System.out.println("Mamy zwyciezce!");
                System.out.println("Czy gracz pierwszy wytypowal poprawnie ? " + p1odgad1);
                System.out.println("Czy gracz drugi wytypowal poprawnie ? " + p2odgad2);
                System.out.println("Czy gracz trzeci wytypowal poprawnie ? " + p3odgad3);
                System.out.println("Koniec gry");
                break;  // Gra skonczona , zatem wychodzimy z petli while 
            } else {
                System.out.println("Gracze beda musieli sprobowac jeszcze raz ."); // W przeciwnym przypadku petla jest dalej realizowana , a gracze sa proszeni o wytypowanie kolejnych liczb 
            }  // koniec if - else         
        } // koniec while
    } // koniec metody rozpocznijGre
} // koniec klasy 

class Gracz {
    int liczba = 0; // tu jest zapisywana typowana liczba

public void zgaduj() {
    liczba = (int) (Math.random() * 10) ;
    System.out.println("Typuje liczbe: " + liczba);
    }
}
class StarterGry {
    public static void main (String[] args) {
        Zgadywanka gra = new Zgadywanka();
        gra.RozpocznijGre();
    }
}
////////////////////////// A
class Magnetofon {
    boolean mozeNagrywac = false ;
    
    void odtworzTasme() {
        System.out.println("Odtwarzam tasme ");
    }
}

class MagnetofonTester {
    public static void main(String [] args ) {
        Magnetofon m = new Magnetofon();
        m.mozeNagrywac = true;
        m.odtworzTasme();

        if (m.mozeNagrywac == true ) {
            m.mozeNagrywac = true;
            m.odtworzTasme();
            //m.NagrajTasme();
        }
    }
}
////////////////////////// Jak powinno byc 
//////////// Badz kompilatorem A
class Magnetofon { 
    boolean mozeNagrywac = false;

    void odtworzTasme() {
        System.out.println("Odtwarzam tasme");
    }

    void nagrajTasme() {
        System.out.println("Nagrywam Tasme ");
    }
}

class MagnetofonTester {
    public static void main (String[] args) {
        Magnetofon m = new Magnetofon() ;
        m.mozeNagrywac = true;
        m.odtworzTasme();

        if (m.mozeNagrywac == true) {
            m.nagrajTasme();
        }
    }
}

////////////////////////// B Uazam ze dobrze zrobilem 
class OdtwarzaczDVD {
    boolean mozeNagrywac = false ;
    boolean mozeOtwierac = false ;

    void nagrajPlyteDVD(){
        System.out.println("nagrywam i otwieram plyte DVD");
    }
    void otworzPlyteDVD() {
        System.out.println(" Otwieram plyte ");
    }
}

class OdtwarzacDVDTester {
    public static void main (String[] args) {
        OdtwarzaczDVD  o = new OdtwarzaczDVD();
        o.mozeNagrywac = true;
        o.mozeOtwierac = true;
        
        if (o.mozeOtwierac == true) {
            o.otworzPlyteDVD();
        }
        
        if (o.mozeNagrywac == true ) {
            o.nagrajPlyteDVD();
            
        } 
    }
}
////////////////////////// Jak powinno byc B 
class OdtwarzaczDVD {
    boolean mozeNagrywac = false ;

    void nagrajPlyteDVD(){
        System.out.println("nagrywam i otwieram plyte DVD");
    }
    void otworzPlyteDVD() {
        System.out.println(" Otwieram plyte ");
    }
}

class OdtwarzaczDVDTester {
    public static void main (String[] args) {
        OdtwarzaczDVD  o = new OdtwarzaczDVD();
        o.mozeNagrywac = true;
        o.odtworzPlyteDVD();
        
        if (o.mozeOtwierac == true) {
            o.otworzPlyteDVD();
        }
        
        if (o.mozeNagrywac == true ) {
            o.nagrajPlyteDVD();
            
        } 
    }
}
////////////////////////// 
class Perkusja {
    boolean talerze = true ;
    boolean baben = true;

    void zagrajNaBabnie(){
        System.out.println("bam ,bam ,baaaa-am-am");
    }

    void zagrajNaTalerzach(){
        System.out.println("brzdek, brzrzrzdeek");
    }
}

class PerkusjaTester {
    public static void main (String[] args) {
        Perkusja p  = new Perkusja();
        p.zagrajNaBabnie();
        p.baben = false;
        p.zagrajNaTalerzach();

        if (p.baben == true) {
            p.zagrajNaBabnie();
        }
    }
}
////////////////////////////
class Magnetofon {
    boolean mozeNagrywac = false;

    void odtworzTasme(){
        System.out.println("odtwarzam tasme");
    }

    void nagrajTasme(){
        System.out.println("nagrywam tasme");
    }
}

class MagnetofonTester {
    public static void main(String[] args) {
        
        Magnetofon m = new Magnetofon();
        m.mozeNagrywac = true;
        m.odtworzTasme();

        if (m.mozeNagrywac == true) {
            m.nagrajTasme();
        }
    }
}

/////////////////////////////////////
class OdtwarzaczDVD {
    boolean mozeNagrywac = false;
    void nagrajPlyteDVD() {
        System.out.println("Nagrywam plyte DVD");
    }
    void odtworzPlyteDVD() {
        System.out.println("odtwarzam plyte DVD");
    }
}
class OdtwarzaczDVDTester {
    public static void main(String[] args) {
        OdtwarzaczDVD o = new OdtwarzaczDVD();
        o.mozeNagrywac = true;
        o.odtworzPlyteDVD();

        if (o.mozeNagrywac == true) {
            o.nagrajPlyteDVD();
        }
    }
}

////////////////// Zagadkowy basen 
public static EchoTester {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo(); // poprawna odpowiedz 

        // -- lub --

        Echo e2 = e1; // odpowiedz na pytanie dodatkowe 
        int x = 0;
        while ( x < 4) {
            el.witaj();
            el.ilosc = el.ilosc + 1;
            if  (x == 3) {
                e2.ilosc = e2.ilosc + 1;
            }
            if (x > 0) {
                e2.ilosc = e2.ilosc + e1.ilosc;
            }
            x = x + 1;
        }
        System.out.println(e2.ilosc);
    }
}

class Echo {
    int ilosc = 0;
    void witaj() {
        System.out.println("sieeemasz...");
    }
}

// Tabela slow zarezorwanych 
// boolean       abstract    while 
// protected     do          implements 
// else          extends     try 
// class         finally     double 
// cath          char        native 
// byte          final       switch


// import 
// throw 
// float 
// static 
// case 
// instanceof 
// throws 
// int 
// strictfp 
// default
// interface 
// return 
// long 
// synchronized 
// for 
// new 
// void 
// short 
// transient 
// break 
// package 
// const 
// public 
// volatile 
// continue 
// super 
// goto 
// private 
// if 
// assert 
// this 
// enum 



class Pies {
    String imie;
}
public  static void main (String[] args) {
    // tworzymy obiekt Pies i uzywamy go 
    Pies pies1 = new Pies();
    pies1.szczekaj();
    pies1.imie = "Azorek";

    // teraz tworzymy tablice obiektow Pies 
    Pies[] mojePsy = new Pies[3];
    // i zapisujemy w niej obiekty
    mojePsy[0] = new Pies();
    mojePsy[1] = new Pies();
    mojePsy[2] = pies1;

    // teraz uzyskujemy dostep do obiektow 
    // odwolujac sie do nich przez tablice 
    mojePsy[0].imie = "Szarik";
    mojePsy[1].imie = "Cywil";

    // Hm...jak ma na imie pies 
    // z komorki mojePsy[2] ?
    System.out.print("Ostatni pies ma na imie ");
    System.out.println(mojePsy[2].imie);

    // A teraz w petli kazemy wszystkie 
    // psom szczekac 
    int x = 0 ;
    while (x < mojePsy.length) {  // Tablice dysponuja skladowa "Jength" ktora okresla ilosc elemntow w tablicy 
        mojePsy[x].szczekaj();
        x = x + 1;
    }
}
public void szczekaj () {
    System.out.println(imie + " " + " Szczekaj: Hau, Hau !");
}

public void jedz() {
    public void gonKota() { }
}


int rozmiar = 32;       // deklarujemy zmienna calkowita typu int o nazwie rozmiar i przypisujemy jej wartosc 32
char pierwsza = 'j';    // deklarujemy zmienna znakowa o nazwie pierwsza i zapisujemy w niej wartosc 'j';
double d = 3242.34;     // deklarujemy zmienna zmiennoprzecinkowa o podwojnej precyzji o nazwie d i zapisujemy w niej wartosc 3242.34;
boolean czyToWariat;    // deklarujemy zmienna logiczna o nazwie czyToWariat (i, jak na razie , nie przepisujemy jej zadnej wartosci);
czytoWariat = true;     // przypisujemy wartosc true zadeklarowanej wczesniej zmiennej czyToWariat;
int y = x + 456;        // deklarujemy zmienna calkowita typu int o nazwie y i przypisujemy jej wartosc bedaca suma wartosci zmiennej x (jaka by ona nie byla) i liczby 456 

// short int boolean char long double float 
//  Slucha i Badz Bardzo Czujny Ludzie Duzo Fantazjuja 
// S_I_B_B_C_L_D_F

class Ksiazka {
    String tytul;
    String autor;
} 

class KsiazkaTester {
    public static void main (String[] args) {
        Ksiazka[] mojeKsiazki = new Ksiazka[3];
        int x = 0;
        mojeKsiazki[0].tytul = "Czterej koderzy i Java";
        mojeKsiazki[1].tytul = "Java nocy letniej";
        mojeKsiazki[2].tytul = "Java. Receptury";
        mojeKsiazki[0].autor = "janek";
        mojeKsiazki[1].autor = "wilhelm";
        mojeKsiazki[2].autor = "ian";

        while (x < 3) {
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(", autor ");
            System.out.println(mojeKsiazki[x].autor);
            x = x + 1; 
        }
    }
}

class TestTablica {
    public static void Main(String[] args) {
        String[] wyspy = new String[4];
        wyspy[0] = "Bermudy";
        wyspy[1] = "Fiji";
        wyspy[2] = "Azory";
        wyspy[3] = "Kozumel";

        int[] indeks = new int[4];
        indeks[0] = 1;
        indeks[1] = 3;
        indeks[2] = 0;
        indeks[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = indeks[y];
            System.out.println("wyspa = ");
            System.out.println(wyspy[ref]);
            y = y + 1;
        }
    }
}


class Ksiazka1 {
    String tytul;
    String autor;
}

class Ksiazka1Tester {
    public static void Main (String[] args){
        Ksiazka1[] mojeKsiazki = new Ksiazka1 [3];
        int x = 0;
        mojeKsiazki[0] = new Ksiazka1 ();
        mojeKsiazki[1] = new Ksiazka1 ();
        mojeKsiazki[2] = new Ksiazka1 ();

        mojeKsiazki[0].tytul = "Chuj wie co";
        mojeKsiazki[1].tytul = "Chuj wie co 1";
        mojeKsiazki[2].tytul = "Chuj wie co 2";

        mojeKsiazki[0].autor = "Ja";
        mojeKsiazki[1].autor = "jestem";
        mojeKsiazki[2].autor = "autorem";

        while (x < 3) {
            System.out.print(mojeKsiazki[x].tytul);
            System.out.print(" , autor ");
            System.out.print(mojeKsiazki[x].autor);
            x = x + 1;
        }

    } 
}



Class Hobbit1 {
    String name ;
    public static void Main(String[] args){
        Hobbit1[] h = new Hobbit1[3] ;

        int z = -1;
        while(z < 2){
            z = z + 1;
            h[z] = new Hobbit1();
            h[z].name = "Bilbo";
            if (z == 1) {
                h[z].name = "Frodo";
            }
            if (z == 2) {
                h[z].name = "Sam";
            }
            System.out.print(h[z].name + "jest");
            System.out.println("dobrym imieniem dla Hobbita ");
        }
    }

}

class TestTablic {
    public static void Main (String[] args){
        int [] indeks = new int[4];
        indeks[0] = 1;
        indeks[1] = 3;
        indeks[2] = 0;
        indeks[3] = 2;

        String[] wyspy = new String[4];
        wyspy[0] = "Bermudy";
        wyspy[1] = "Xd";
        wyspy[2] = "Xd1";
        wyspy[3] = "Xd2";

        int y = 0;
        int ref;
        while(y < 4) {
            ref = indeks[y];
            System.out.println(wyspy[ref]);
            System.out.print(" wyspa = ");
            y = y + 1;
        }

    }
}


class Trojkat {
    double pole;
    int wysokosc;
    int dlugosc;
    public static void main(String[] args){
        int x = 0;
        Trojkat[] ta = new Trojkat[4];
        while (x < 4) {
            ta[x] = new Trojkat();
            ta[x].wysokosc = (x+1) * 2;
            ta[x].dlugosc = x + 4;
            ta[x].okreslPole();
            System.out.print("trojkat "+x+" , pole ");
            System.out.println(" = " + ta[x].pole);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Trojkat t5 = ta[2];
        ta[2].pole = 343;
        System.out.print("y = " + y);
        System.out.println(", pole t5 = "+ t5.pole);
    }
    void okreslPole() {
        pole = (wysokosc * dlugosc) / 2;
    }
}

Kontakt [] kn = new Kontakt[10];
while (x < 10) { // tworzymy 10 obiektow kontaktow 
    kn[x] = new Kontakt();
    x = x +1;
}
// aktualizujemy liste kontaktow podlogujac sie tablica kn

Kontakt odwk;
while ( x < 10 )  {
    odwk = new Kontakt();
    x = x + 1;
}
// wykonujemy zlozona aktualizacje listy kontaktow , poslogujac sie 
// odwolaniem odwk

class Pies {
    int wielkosc;
    String imie;
    void szczekaj(){
        if (wielkosc > 23) {
            System.out.println("Houu! Houu!");
        } else if  (wielkosc > 6)  {
            System.out.println ("Chau! Chau! ");
        } else {
            System.out.println("Hiau! Hieau!");
        }
    }
}


class PiesTester {
    public static void main ( String[] args) { 
        Pies pierwszy = new Pies();
        pierwszy.wielkosc = 40;
        Pies drugi = new Pies();
        drugi.wielkosc = 2;
        Pies trzeci = new Pies();
        trzeci.wielkosc = 8;
        pierwszy.szczekaj();
        drugi.szczekaj();
        trzeci.szczekaj();
    }
}

// d.szczekaj(3) ---> szczeka 3 razy 
// Metoda uzywa parametrow .Kod wywolujacy metode przekazuje do niej argumenty 
// Jesli metoda ma jakies parametry , to konieczne trzeba cos do niej przekazac 

// 1. WYWOLUJEMY METODE SZCZEKAJ() poslugujac sie odwolaniem do obiektu Pies i przekazujemy wartosc 3
// 2. Bity reprezentujace wartosc 3 sa przekazywane do metody szczekaj()
// 3. Bitysa umieszczane w parametrze iloscSzczekniec (typu int)
// 4. Parametr i iloscSzczekniec jest uzywanyjako zmienna w kodzie metody 
Pies p = new Pies();
p.szczekaj(3);
void szczekaj(int iloscSzczekniec) {
    while (iloscSzczekniec > 0) {
        System.out.println("hauu");
        iloscSzczekniec = iloscSzczekniec - 1;
    }
}

// Metody moga zwracac wartosci . W deklaracjach mozna okreslic typ wyniku jednka jak do tej pory wszystkie do tego metody byly void co oznacza co oznacza nie zwracalo zednych wynnikow 
// void idz() {
// }

// Metoda ktora zwraca do kodu wywolujacego wartosci okreslonego typu. pRZYKLAD TAKIEJ METODY 
int podajTajnyNumer() {
    return 42;
}

// Jesli obiecales ze metoda bedzie cos zwracac to lepiej to zwracac 
int tajnyNumer =  zycie.podajTajnyNumer();
int podajTajnyNumer() {    // Te typy musza sobie odpowiadac int    i    int  
    return 42;  // ta wartosc musi sie zmiescic w zmiennej typu int 
}

// Bity reprezentujace wartosc 42 sa zwracane z metody podajTajnyNumer() i zostaja zapisane z zmiennej o nazwie tajnyNumer

// Wywolanie metody z dwoma parametrami i przekazanie do niej dwoch argumentow 
void idz(){
    Tester t = new Tester ();
    t.dwaPrametry(12, 34);
}
// Przekazywane argumenty sa zapisywane w takiej samej kolejnosci  w jakiej zostaly podane .Pierwszy argumenty trafia do pierwszego , drugi argument do drugiego parametru i tak dalej 

void dwaParametry(int x, int y) {
    int z = x + y;
    System.out.priuntln("suma wynosi : " + z);
}

// Do metody mozna przekazywac wartosci zmiennych o ile typy tych zmiennych odpowiadaja typom parametrow 
void idz() {
    Tester t = new Tester();
    int arg1 = 7;               
    int arg2 = 3;
    t.dwaParametry(arg1, arg2);
}
// Wartosci zmiennych arg1 i arg3 sa umieszczane odpowidznio w parametrach x oraz y 
// A zatem aktualnie bity w parametrze x sa takie same jak bity atualnie bity w parametrze x sa takie same jak bity zmiennej arg1 (sa to bity odpowiadajace wartosci calkowitej 7)
// a bity w y sa takie same jak bityw arg 2 
void dwaParametry(int x, int y) {
    int z = x + y;
    System.out.println (" Suma wynosi " + z);
}


class GitaraElektryczna {
    String rodzaj;
    int iloscKonwerterow;
    boolean uzywanaPrzezGwiazde;

    String getRodzaj() {
        return rodzaj;
    }

    void setRodzaj(String rodzajGitary) {
        rodzaj = rodzajGitary;
    }

    int getiloscKonwerterow() {
        return iloscKonwerterow;
    }

    void setIloscKonwerterow(int ilosc) {
        iloscKonwerterow = ilosc;
    }

    boolean getUzywanaPrzezGwiazde() {
        return uzywanaPrzezGwiazde;
    }

    void setUzywanaPrzezGwiazde(boolean takCzyNie) {
        uzywanaPrzezGwiazde = takCzyNie;
    }
}



kot.wysokosc = 27;
kot.wysokosc = 0;
public void setWysokosc(int w){
    if (w > 9) {
        wysokosc = w;
    }
}

// Implementacja 
// public void main ---> metody ustawiajace i zwracajace powinny byc publiczne

//Hermetyzacja
// private  void main ---> Skladowe obiektow nalezy znaczac jako prywatne 
// a katrola dostepu powinna byc realizowane za pomoca publicznych metod ustawiajacych i zwracaacych
// Hermeteyzacja otacza mohe skladowe polem silowym dzikei ktoremu nikt nie moze przipisac im ujmijmy to delikatnie niewlasciwych danych 

// Najwazniejsze jest to ze w metodach ustawiajacych mozecie zrobic wszystko , natomiast jesli skladowe sa publiczne --> nie mozecie zrobic nic 
// Jesli chodzi o metody ustawiajace  ( jak rowniez zwracajace ) najwazniejsze jest to ze pozniej mozecie zmienic zdanie i to bez zagrozenia , ze w kodzie napisanym przez inne ososby pojawia sie jakies bledy ! 
// Sytuacja wszyscy w tojej firmie kady uzywa mojej klasy ktore skladowe publiczne i pewnego dnia z ta wartosc dzieje sie cos czego nie przewiedzielismy  i musimy zaczac korzystac z metody ustawiajacej i kod wszystkich osob przestal b dzialac 
// W hermatyzacji najlepsze jest to ze poznej mozna zienic zdanie 

// Hermetyzacja klasy DobryPiesek

class DobryPiesek {
    
    private int wielkosc;  // skladowe powinny byc oznaczone jako prywatne 

    public int getWielkosc() {         //  ---> 
        return wielkosc ;
    }                                                 // = metody zwracajace i ustawiajace powinny byc oznaczone jako publiczne 

    public void setWielkosc(int w) {   //  --->
        wielkosc = w;
    }

    void szczekaj() {
        if (wielkosc > 23) {
            System.out.println("Houu! Houu!");
        } else if (wielkosc > 6) {
            System.out.println("Chau! Chau!");
        } else {
            System.out.println("hIAU! Hiau!");
        }
    }
}

class DobryPiesekTester {
    public static void main(String[] args) {
        DobryPiesek pierwszy = new DobryPiesek();
        pierwszy.setWielkosc(70);
        DobryPiesek drugi = new DobryPiesek();
        drugi.setWielkosc(8);
        System.out.println ("Pierwszy pies: " + pierwszy.getWielkosc());
        System.out.println("Drugi Pies : " + drugi.getWielkosc());
        pierwszy.szczekaj();
        drugi.szczekaj();
    }
}

// W dowolnym miejscu kod u w ktorym zostala uzyta konkretna wartosc mozna takze zastosowac metode zwracajaca wartosc wynikowa tego samego tyopu ;

// Zamiast int x = 3 + 24
// Mozna napisac int x = 3 + pierwszy.getWielkosc();


Pies[] zwierzaki ;
zwierzaki = new Pies[7];
zwierzaki[0] = new Pies();
zwierzaki[1] = new Pies();
zwierzaki[0].setWielkosc(30);
int x = zwierzaki[0].getWielkosc();
zwierzaki[1].setWielkos(8);

// Deklarowanie i inicjalizacja skladowych 

// DEKLARACJA ZMIENNEJ WYMAGA PODANIA JEJ NAZWY I TYPU 
int wielkosc ;
String imie ;

// wiesz ze jednoczesnie mozna zainicjolizowac zmianna (czyli przypisac jej pewna wartosc 
int wielkosc = 420 ;
String imie = "Hubert";

// Ale co si dzieje gdy skladowa obiektu niezostanie zainicjolizowana , a wywolamy metode zwracajaca ? Innymi slowy Jaka jest wartosc skladowej , zanim zostanie zainicjolizowana 
class BiednyPies {
    private int wielkosc ;
    private String imie ;     // deklaracja dwoch skladowyh lecz bez okreslenoa ich wartosci 

    public int getWielkosc() {   // --->
        return wielkosc ;
    }                                   // = Jakie wartosci zwroca te metody 
                
    public String getImie() {    // --->
        return imie;
    }
}
public class BiednyPiesTester {
    public static void main(String[] args) {
        BiednyPies psinka = new BiednyPies() ;
        System.out.println( "Pies ma wielkosc " + psinka.getWielkosc());
        System.out.println(" Pies ma na imie: " + psinka.getImie());
        // Pies ma wielkosc : 0
        // Pies ma na imie : null 
    }
}
// Nie musisz inicjaizowac skladowych gdyz zawsze maja one wartosci domyslne . skladowe liczbowe typow podstawowych 
// W ym takze takze char przyjmuja wartosc 0 
// Skladowe logiczne ( typu boolean ) wartosc false 
// Odwolanie do obiektow wartosc null  (odwolanie bez zadnego obiektu docelowego wartosc null )

// Roznica pomiedzy skladowymi a zmiennymi lokalnymi 

// 1. Skladowe sa deklarowane wewnatrz kasy a nie wewnatrz metody.
class Kon {
    private double wysokosc = 15.2;
    private String rasa;
    // pozostala czesc kodu 
}

// 2. Zmienne lokalne sa deklarowane wewnatrz metody.
class Dodawanie {
    int a;
    int b = 12;

    public int dodaj() {
        int suma = a + b;
        return suma;
    }
}

// 3. Przed uzyciem zmiennych lokalnych koniecznie trzeba je zainicjalizowac 
class Test {
    public void jazda() {
        int x;
        int z = x + 3;          // To sie nie skompiluje Mozna zadeklarowac zmienna x bez przypisywania jej wartosci ale w momencie gdy sprobujesz jej UZYC, kompilator zgosi blad 
    }
}

// Zmiennym lokalnym nie sa przypisywane zadne wartosci domysle .Kompilator zglosi blad , jesli sprobujesz uzyc zmiennej lokalnej , zanik zostanie ona zinicjolizowana 


// Porownywanie zmiennych (typow podstawowych oraz odwolan) operator == , czy dwa obiekty sa takie same equals() ---> ekspedycja ,
// == do porownywania dwoch typow 
int a = 3;
byte b = 3;
if (a == b) // to prawda}  // operator == nie zwraca uwagi na wielkosc zmiennych a zatem wszystkie dodatkowe zera znajdujace sie z lewej strony wartosci nie sa uzwgledniane 

Test a = new Test();
Test b = new Test();
Test c = a;
if (a == b) 
if ( a == c)
if ( b == c)

class XCopy { // xcopy kompiluje sie i dziala poprawnie w podanej postaci generowanie wyniku to 42.84 .W javie argumenty przekazywane w wartosciach co oznacza ze przekazywana jest kopia wartosci zmienna org nie jest zmienna przez wywolanie metody jazda 
    public static void main (String[] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.jazda(org);
        System.out.println(org + " " + y);
    }
    int jazda(int arg) {
        arg = arg * 2;
        return arg;
    }
}

class Zegar {
    String czas;

    void setCzas(String c) {
        czas = c;
    }

    String getCzas() { // bylo napisane i wystarczylo zmienic z void na wartosc sTRING 
        return czas;
    }
}
class ZegarTester {
    public static void main (String[] args) {
        Zegar z = new Zegar();

        z.setCzas("12345");
        String dta = z.getCzas();
        System.out.println("Czas :" + dta);
    }
}

// Klasa moze miec ich dowolna ilosc ---> skladowa,  metoda ustawiajaca , metoda zwracajaca , metoda 
// Metoda moze miec tylko jedna z nich   ---> wartosc wynikowa
// Moga byc nie jawnie rozszerzane ---> warosc wynikowa argument
// Wole aby moje skladowe byly prywatne  ---> hermetyzacja 
// W rzeczywistosci oznacza "utworzenie kopii " ---> przekazywanie przez wartosc
// Jedynie metody ustawiajace powinne je aktualizowac ---> skladowa 
// Metody moga miec ich dowolna liczbe ---> argument 
// Z definicji cos zwracam ---> metoda zwracajaca 
// Nie nalezy mnie stosowac wraz ze skladowymi ---> modyfikator public 
// Moge miec wiele argumentow ---> metoda 
// Z definicji wymagam podania tylko jednego argumentu ---> metoda ustawiajaca 
// Pomagaja w hermetyzacji ---> metoda zwracajaca , metoda ustawiajaca , modyfikator public , modyfikator private 
// Ja zawsze dzialam sam ---> wartosc wynikowa 

public class ProstyPortalTester {
    public static void main(String[] args) {
        ProstyPortal wit = new ProstyPortal(); // utwzorzenie obiektu klasy ProstyPortal

        int[] polozenia = {2, 3, 4}; // utworzenie tablicy liczb calkowitych okreslajacych polozenia zastapionego portalu (tablica ta zawiera trzy kolejne liczby calkowite sposrod 7 mozliwych )
        wit.setPolaPolozenia(polozenia); // wywolanie metody ustawiajacej uteorzonego obiektu
        String wybranePole = "2"; // symulacja pola wybranego przez gracza 
        String wynik = wit.sprawdz(wybranePole); // wywolanie metody sprawdz() utworzonego obiektu i przekazanie do niej wybranego pola 
        String wynikTestu = "niepowodzenie";
        if (wynik.equals("trafiony")) {
            wynikTestu = "zakonczony pomyslnie"; // jesli w odpowiedzi na symulowane pola wybrane przez gracza (2)  zostanie zwrocony wynik "trafiony ", oznacza to ze metoda dziala
        }
        System.put.println(wynikTestu); // zwracamy wynnik testu : "niepowdzenie " lub zakonczony pomyslnie
    }
}

// Metoda sprawdz 
// 1. POBIERZ pole wskazane przez gracza 
// 2. SKONWERTUJ  pole na liczbe typu int 
// 3. POWTORZ  dla wszystkich komorek w tablicy typu int 
// 4. JESLI wskazane pole odpowiada jednej z komorek polozenia 
// 5. INKREMENTUJEMY liczbe trafien 
// 6. SPRAWDZ czy to byla ostatnia komorka polozenia 
// 7. JESLI ilosc trafien wynosi 3 ZWROC wynik "zastapiony"
// 8. W PRZECIWNYM RAZIE  Portal nie zostal zastopiony wiec zwracamy trafiony 
// 9. W PRZECIWNYM RAZIE zwracamy "pudlo"

public String sprawdz(String stringPole) { // 1
    int strzal = Integer.parseInt(stringPole); // 2. konwersja lancucha znakowna liczbe calkowita 
    String wynik = "pudlo"; // utworzenie zmiennej , ktora bedzie przechowywac wynik metody; poczatkowo jest w niej zapisywany lancuch "pudko"(czyli zakladamy , ze gracz spudlowal)
    for (int pole : polaPolozenia) {  // 3. czynnosci w petli beda powtarzane dla kazdej komorki tablicy (kazdej komorki okreslajacej polozenie Portalu() 
        if (strzal == pole) { // 4. porownanie pola podanego przez gracza z tym elementem ( komorka) tablicy
            wynik = "trafiony";  // --->
            iloscTrafien++;      // 5. ---> gracz trafil 
            break;  // przerwanie realizacji petli , gdyz dalsze sprawdzanie komorek nie jest konieczne 
            } // koniec if
        } // koniec for 
        if (iloscTrafien == polaPolozenia.length) {  // 6.
            wynik = "zatopiony";   // 7. dzialanie petli zastalo zakonczenie ale nalezy sprawdzic czy Portal zostal "zatopiony" (trafiony trzy razy ) i w razie czego odpowiednio zmienic wynik 
    } // koniec if 
    System.out.println(wynik); // 8.
    return wynik; // 9.
}

// Konwersja lancucha znakow naa liczbe 
Integer.parseInt("3"){
    // Integer -- > klasa dostarczona razem z Java
    // ParseInt -- > metoda klasy Integer, ktora "wie" jak przetworzyc lancuch znakow na liczbe ktora ten lancuch reprezentuje 
    // ("3") -- > pobiera lancuch znakow 
}

// Petla for  
for (int pole : polaPolozenia) {
    // int pole -- > Deklarujemy zmienna ktora bedzie przechowywac jden element tablicy . Podczas kazdej iteracji petli zmienna ta (ktora w naszym przypadku nosi nazwe pole)
       // bedzie zawierac kolejny element tablicy , az do momentu pobrania kazdego z nich (lub wykonania instrukcji break, atrz punkt 4. ponizej)
    // polaPolozenia Tablica na ktorej ma operowac petla . Podczas kazddej iteracji petli ww zmiennej pole bedzie umieszczany kolejny element tablicy . 
}

// Operator postinkrementacji 
iloscTrafien++; 
    // ++ oznacz , ze do dowolnej biezacej wartosci zmiennej nalezy dodac 1 , (innymi slowy , ze wartosc zmiennej nalezy powiekszyc o jeden)

// Instrukcja break
break;
    // Przerywa dzialanie petli .W tym miejscu zadnych iteracji , zadnych testow ani warunkow , po prostu koniec -- koniec !

// Integer.parseInt() w nawiasy mozna wstawic tylko liczby od 0 do 9 nic innego bo kod wyleci w kosmos , lancuch 0d 0 do 9

// Inna petla for bardziej rozszerzona 
for (int i=0; i < 10; i++) {
    // wykonujemy cos 10 razy 
}



// Ostateczny kod klas ProstPortal oraz ProstyPortalTester
public class ProstyPortalTester {
    public static void main (String[] args) {
        ProstyPortal wit = new ProstyPortal();
        int[] polozenia = {2,3,4};
        wit.setPolaPolozenia(polozenia);
        String wybranePole = "2";
        String wynik = wit.sprawdz(wybranePole);
    }
}

class ProstyPortal {
    int[] polaPolozenia;
    int iloscTrafien;

    public void setPolaPolozenia(int[] ppol) {
        polaPolozenia = ppol;
    }

    public String sprawdz (String stringPole) {
        int strzal = Integer.parseInt(stringPole);
        String wynik = "pudlo";
        for (int pole: polaPolozenia) {
            if (strzal == pole) {
                wynik = "trafiony";
                iloscTrafien++;
                break;
            }
        } // koniec petli
        if (iloscTrafien == polaPolozenia.length) {
            wynik = "zatopiony";
        }
        System.out.println(wynik);
        return wynik;
    } // koniec metody 
} // koniec klasy 


// 139 strone zrobic 
public static void main(String[] args) {
    // ZADEKLARUJ zmienna typu int przechowujaca ilosc ruchow gracza, nadaj jej nazwe iloscRuchow i przypisz wartosc 0.
    // UTWORZ nowy obiekt klasy ProstyPortal
    // WYZNACZ liczbe losowa z zakresu od 0 do 4, ktora okresli poczatek miejsca, w ktorym zostanie umieszczony Portal
    // UTWORZ tablice liczb calkowitych z ktorych pierwsza bedzie wartoscia wygenerowana losowo , druga wartoscia o jeden wieksza , a trzecia -- wartoscia wieksza o 2 (na przyklad 2,3 i 4 )
    // WYWOLAJ metode setPolaPolozenia() obiektu ProstyPortal
    // ZADEKLARUJ zmienna logiczna reprezentujaca stan gry i nadaj jej nazwe czyIsnieje . PRZYPISZ tek zmiennej wartosc poczatkowa true.

    // DOPOKI Portal istnieje(czyli czyIstnieje == true):
        // POBIERZ dane wejsciowe wpisane przez gracza w wierszu polecen 
        // SPRAWDZ pole wskazane przez gracza 
        // WYWOLAJ metode sprawdz() obiektu klasy ProstyPortal
        // INKREMENTUJ zmienna iloscRuchow
        // SPRAWDZ, czy Portal zostal zatopiony
        // JESLI zwrocony zostal wynik "zatopiony":
            // PRZYPISZ zmiennej czyIstnieje wartosc false (co oznacza, ze petla nie zostanie juz wiecej wykonana)
            // WYSWIETL ilosc rucow gracza 
        // KONIEC jesli
    // KONIEC dopoki 
} // KONIEC metody 




//  1. Tworzac nowa klase , zaczniesz od napisania trzech wersji kodu : 
        // Kodu przygotowawczego 
        // kodu testowego 
        // wlasciwego kodu ( w Javie )
//  2. Kod przygotowawczy powienien opisywac co , a nie jak , nalezy wykonac , Implementacja bedziesz sie zajmowal pozniej 
//  3. Wykorzystaj kod przygotowawczy jako pomoc przy tworzeniu kodu testujacego 
//  4. Napisz kod testujacy , zanim zaczniesz implementowac metody 
//  5. Jesli wiesz ile razy powtorzyc wykonanie kodu umieszconego wewnatrz petli staramy sie korzystac z petli for a nie z petli while 
//  6. W celu dodania wartosci 1 do zmiennej uzywanej operatora preinkrementacji lub postinkrementacji (x++)
//  7. W celu odjecia wartosci 1 do zmiennej uzywanej operatora predekrementacji lub postdekrementacji (x--)
//  8. Uzywac Integer.parseInt w celu przetworzenia lancucha znakow na liczbe calkowita 
//  9. Integer.parseInt dziala tylko wtedy kiedy do nie przekazane lancuhc znakow od cyfr 0 do 9
//  10. Stosujemy break zeby wczesniej zakonczyc wykonywanie petli (nawet kiedy test logiczny jest spelniony)

public static void main(String [] args) {
    int iloscRuchow = 0;  // tworzymy zmienna ktora bedzie okreslac , ile ruchow wykonal gracz
    PomocnikGry pomocnik = new PomocnikGry(); // to specjalna napisana przez nas klasa ktora posiada metode pobierajaca dane wejsciowe podawane przez gracza i udaje , ze jest czescia jezyka Java
    ProstyPortal portal = new ProstyPortal(); //tworzymy obiekt ProstyPortal
    int liczbaLosowa = (int) (Math.random() * 5); // generujemy liczbe losowa ktora bedzie zapisana w pierwszej komorce tablicy i na jej podstawie okreslamy zawartosc tablicy polozenia --> to co na dole liczbaLosowa +1
    int[] polozenia = {liczbaLosowa, liczbaLosowa+1, liczbaLosowa+2};
    portal.setPolaPolozenia(polozenia); // przekazujemy do obiektu ProstyPortal jego polozenia (w formie tablicy)
    boolean czyIstnieje = true;  // tworzymy zmienna logiczna okreslajaca czy gra wciaz powinna sie toczyc , jest uzywana w warunku petli while ---> to co na dole
    while (czyIsnieje == true) {
        String pole = pomocnik.pobierzDaneWejciowe("Podaj liczbe"); // pobieramy lancuch znakow podany przez gracza 
        String wynik = portal.sprawdz(pole);  // prosimy obiekt ProstyPortal , aby sprawdzil pole podane przez gracza, zwrozony wynik jest zapisywany jako lancuch znakow 
        iloscRuchow++; // inkrementujemy wartosc zmiennej okreslajacej ilosc ruchow 

        if (wynik.equals("zatopiony")) {  // --->
            czyIstnieje = false;  //   --->                 A co jesli nasz Portal zostal "zatopiony"? W takim przypadku przypisujemy zmiennej czyIstnieje wartosc false (dzieki czemu zawartosc petli nie zostanie juz wiecej wykonana ) i wyswietlamy ilosc ruchow 
        } // koniec if
    } // konie while
} // koniec main 

// Po prostu skopiuj * ponizszy kod i skompiluj go 
// Umiesc wszystkie trzy klasy ProstyPortal + ProstyPortalGra + PomocnikGry w tym samym folderze i przejdz do innegoaby stal sie folderem roboczym 
// Za kazdym razem gdy zobaczysz ikone Gotowy kod nalezy przepisac bez zadnych zmian i wierzyc ze robi dokladnie to co trzeba . Zaufac mu

import java.io.*;
public class PomocnikGry {
    public String pobierzDaneWejsciowe(String komunikat) {
        String wierszWej = null;
        System.out.print(komunikat + " ");
        try {
            BufferedReader sw = new BufferedReader(
                new InputStreamReader(System.in));
            wierszWej = sw.readLine();
            if (wierszWej.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return wierszWej;
    }
}

// Oto co sie stanie kiedy wpiszemy liczby 1, 2, 3 ,4 ,5  oraz 6 Wyglada na to , ze wszystko jest w porzadku 
// Pelny przebieg gry (Twoje wyniki moga byc inne 
// Podaj liczbe 1 --> pudlo 
// Podaj liczbe 2 --> pudlo
// Podaj liczbe 3 --> pudlo
// Podaj liczbe 4 --> trafiony 
// Podaj liczbe 5 --> trafiony
// Podaj liczbe 6 --> zatopiony 
// --> 6 ruchow 

// Inny przyklad przebiegu gry (w ktorym mozna zauwazyc blad)
// Podaj liczbe 2 --> trafiony 
// Podaj liczbe 2 --> trafiony 
// Podaj liczbe 2 --> zatopiony
// 3 ruchow 

int i = 0;
while (i < 8) {
    System.out.println(i);
    i++;
}
System.out.println("Gotowe");

for (String imie : tablicaImion)  { }
//     ^      ^  ^       ^      ^
//     |      |  |       |      |
//     1      2  3       4      5

//  1. Elementy tablicy MUSZA byc zgodne z zadeklarowanym typem zmiennej 
//  2. Deklarujemy zmienna iteracyjna ktora bedzie przechowywac pojedynczy element tablicy
//   . Podczas kazdej iteracji tabeli w zmiennej "imie" zostanie zapisamy inny element tablicy
//  3. Dwukropek (:) oznacza w 
//  4. To kolekcja na ktorej elementach chcesz wykonywac operacje 
//   . Wyobraz sobie ze w jakims wczesniej wykonywanym fragmencie programu znalazl sie nastepujacy kod 
//   . String[] tablicaImion = {"Franek", "Mietek", "Janek"};
//   . Podczas pierwszej iteracji petli w zmiennej "imie" zostanie zapisana wartosc "Franek", podczas drugiej --"Mietek", a podczas ostatniej -- "Janek"
//  5. Tutaj jest umieszczany kod ktory bedzie wykonywany w petli (to jej zawartosc)

Integer.parseInt("3");
// ^        ^     ^
// |        |     |
// 1        2     3

// 1. Klasa dostarczona wraz z Java 
// 2. Metoda Integer , ktora "wie" w jaki sposob zmieniac lanuchy znakow reprezentujace liczby na faktyczne liczby 
// 3. metoda wymaga przekazania lancucha znakow 

// Rzutowanie wartosci typow podstawowych 

// long y = 42;
// int x = y; // blad 

long y = 42; 
int x = (int) y; // x = 42 super 

long y = 40002; // ta liczba przekracza zasres  // 

   
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Sukurkite ciklą kuris atspausdintų 10 kartų žodį “labas”.

    System.out.println("Pirma uzduotis:\n ");

        for (int i = 0; i < 10; i++) {
            System.out.println("labas");
        }

//Sukurkite ciklą kuris atspausdintų skaičius nuo 0 iki 9.

    System.out.println("------------------------------");
    System.out.println("\nAntra uzduotis:\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//Sukurkite masyvą iš dešimties augalų pavadinimų.

    System.out.println("------------------------------");
    System.out.println("\nTrecia uzduotis:\n");

        String[] plants = {"Agurkas", "Abrikosas", "Apelsinas", "Berzas", "Braske", "Brukne", "Citrina", "Dobilas", "Egle", "Gervuoge"};

//Atspausdinkite kiekvieną 3čio uždavinio augalą atskiroje eilutėje.

    System.out.println("------------------------------");
    System.out.println("\nKetvirta uzduotis:\n");

        for (int i = 0 ; i < 10; i++) {
            System.out.println(plants[i]);
        }

//Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

    System.out.println("------------------------------");
    System.out.println("\nPenkta uzduotis:\n");

        for (int i = plants.length -1; i >= 0 ; i--) {
            System.out.println(plants[i]);
        }

//Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius)

    System.out.println("------------------------------");
    System.out.println("\nSesta uzduotis:\n");

        for (int i = 10; i <= 50 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.
//( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

    System.out.println("------------------------------");
    System.out.println("\nSeptinta uzduotis:\n");

        for (int i = 10; i <= 50 ; i++) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                continue;
                }
                System.out.println(i);
            }
        }

//Sukurkite ciklą kuris suktųsi nuo 0 iki 20. Suskaičiuokite, kiek kartų kintamasis i turėjo porinę reikšmę

    System.out.println("------------------------------");
    System.out.println("\nAstunta uzduotis:\n");

        int even = 0;

        for (int i = 0; i <= 20 ; i++) {
            if (i % 2 ==0) {
                even +=1;
            }
        }
        System.out.println(even);

//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių trumpesnių nei 5 simboliai, ir kiek ilgesnių nei 7 simboliai. (du skaičiavimai)

    System.out.println("------------------------------");
    System.out.println("\nDevinta uzduotis:\n");

        int less5 = 0;
        int more7 = 0;

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
            int wordLength = plants[i].length();
            System.out.println(wordLength);

            if (wordLength < 5){
                less5 += 1;
            }
            if (wordLength > 7){
                more7 += 1;
            }

        }

        System.out.println("Zodziu su maziau nei 5 simboliai: " + less5);
        System.out.println("Zodziu su daugiau nei 7 simboliai: " + more7);

//Suskaičiuokite kiek 3čio uždavinio masyve yra žodžių ilgesnių nei 5 simboliai bet trumpesnių  nei 10 simboliai.(tarp 5 ir 10 simbolių ilgio)

    System.out.println("------------------------------");
    System.out.println("\nDesimta uzduotis:\n");

        int fiveToTen = 0;

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
            int wordLength = plants[i].length();
            System.out.println(wordLength);

            if (wordLength > 5 && wordLength < 10){
                fiveToTen += 1;
            }
        }
        System.out.println("Zodziu ilgesniu nei 5 bet trumpesniu nei 10 yra: " + fiveToTen);

//Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300, atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek
//tarp jų yra didesnių už 150.  Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

    System.out.println("------------------------------");
    System.out.println("\nPirma+ uzduotis:\n");

        Random rd = new Random();
        int[] randNumb = new int[300];
        int more = 0;
        for (int i = 0; i < 300; i++) {
            randNumb[i] = rd.nextInt(300);
            if (randNumb[i] > 150)
            {
                more += 1;
            }
            if (randNumb[i] > 275)
            {
                System.out.print("[" + randNumb[i] + "] ");
                continue;
            }
            System.out.print(randNumb[i] + " ");
        }

        System.out.println("\nDidesniu skaiciu uz 150 yra: " + more);

//Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos. Skaičius atskirkite
//kableliais. Po paskutinio skaičiaus kablelio neturi būti.

    System.out.println("------------------------------");
    System.out.println("\nAntra+ uzduotis:\n");

    String comma = "";

        for (int i = 1; i < 3001 ; i++) {
            if (i % 77 == 0)
            {

               comma += i + ", ";
            }
        }
        System.out.println(comma.substring(0,comma.length() -2));


//Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”

    System.out.println("------------------------------");
    System.out.println("\nTrecia+ uzduotis:\n");

        int size = 25;

        for (int y = 0; y < 25 ; y++){
            for (int x = 0; x < 25 ; x++) {
                System.out.print("* ");

            }
            System.out.println();
        }











            }
        }
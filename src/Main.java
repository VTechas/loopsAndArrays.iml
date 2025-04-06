import java.util.Arrays;
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

        for (int i = 0; i < 10; i++) {
            System.out.println(plants[i]);
        }

//Atspausdinkite 3čio uždavinio kiekvieną augalą pradedant nuo paskutinio, ir baigiant pirmuoju. (atvirkščias ciklas).

        System.out.println("------------------------------");
        System.out.println("\nPenkta uzduotis:\n");

        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }

//Atspausdinkite kas antrą skaičių nuo 10 iki 50 (porinius)

        System.out.println("------------------------------");
        System.out.println("\nSesta uzduotis:\n");

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

//Atspausdinkite kas antrą skaičių nuo 10 iki 50. (porinius) Jei skaičius dalinasi iš 10 be liekanos jo nespausdinkite.
//( naudokite continue.) (atspausdinti visus porinus skaičius, išskyrus tuos kurie dalinasi iš 10 be liekanos)

        System.out.println("------------------------------");
        System.out.println("\nSeptinta uzduotis:\n");

        for (int i = 10; i <= 50; i++) {
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

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                even += 1;
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

            if (wordLength < 5) {
                less5 += 1;
            }
            if (wordLength > 7) {
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

            if (wordLength > 5 && wordLength < 10) {
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
            if (randNumb[i] > 150) {
                more += 1;
            }
            if (randNumb[i] > 275) {
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

        for (int i = 1; i < 3001; i++) {
            if (i % 77 == 0) {

                comma += i + ", ";
            }
        }
        System.out.println(comma.substring(0, comma.length() - 2));


//Nupieškite kvadratą iš “*”, kurio kraštines sudaro 25“*”


        System.out.println("------------------------------");
        System.out.println("\nTrecia+ uzduotis:\n");

        int size = 25;

        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print("* ");

            }
            System.out.println();
        }

//Prieš tai nupieštam kvadratui nupieškite istrižaines zaigzdutę pakeisdami kitu simboliu.

        System.out.println("------------------------------");
        System.out.println("\nKetvirta+ uzduotis:\n");

        int size2 = 25;

        for (int y = 0; y < size2; y++) {
            for (int x = 0; x < size2; x++) {
                if (y == x || x == size2 - y - 1) {
                    System.out.print("@ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

//Metam monetą. Monetos kritimo rezultatą imituojam Math.random() funkcija, kur 0 yra herbas, o 1 - skaičius.
// Monetos metimo rezultatus išvedame į ekraną atskiroje eilutėje: “S” jeigu iškrito skaičius ir “H” jeigu herbas.
// Suprogramuokite tris skirtingus scenarijus kai monetos metimą stabdome:
//Iškritus herbui;
//Tris kartus iškritus herbui;
//Tris kartus iš eilės iškritus herbui;

        System.out.println("------------------------------");
        System.out.println("\nPenkta+ uzduotis:\n");

        String heads = "";
        String tails = "";
        int min = 0;
        int max = 1;
        int coin = min + (int) Math.round(Math.random() * (max - min));

        while (coin != 0) {
            tails += "S ";
            coin = min + (int) Math.round(Math.random() * (max - min));
        }
        heads += "H ";

        System.out.println(tails.trim());
        System.out.println(heads.trim());

        System.out.println("-------------------------");
        System.out.println("5.2\n");

        int tailsCount = 0;
        String heads2 = "";
        String tails2 = "";

        while (tailsCount < 3) {
            int toss = (int) (Math.random() * 2);
            if (toss == 1) {
                tails2 += "H ";
                tailsCount++;
            } else {
                heads2 += "S ";
            }
        }

        System.out.println(heads2.trim());
        System.out.println(tails2.trim());

        System.out.println("-------------------------");
        System.out.println("5.3\n");

        int tailsInARow = 0;
        String heads3 = "";
        String tails3 = "";

        while (tailsInARow < 3) {
            int toss = (int) (Math.random() * 2);
            if (toss == 1) {
                tails3 += "H ";
                tailsInARow++;
            } else {
                heads3 += "S ";
                tailsInARow = 0;
            }
        }

        System.out.println(heads3.trim());
        System.out.println(tails3.trim());


//Kazys ir Petras žaidžia šaškėm. Petras surenka taškų kiekį nuo 10 iki 20, Kazys surenka taškų kiekį nuo 5 iki 25.
// Vienoje eilutėje išvesti žaidėjų vardus su taškų kiekiu ir “Partiją laimėjo: laimėtojo vardas”.
// Taškų kiekį generuokite funkcija Math.random(). Žaidimą laimi tas, kas greičiau surenka 222 taškus.
// Partijas kartoti tol, kol kažkuris žaidėjas pirmas surenka 222 arba daugiau taškų.


        System.out.println("------------------------------");
        System.out.println("\nSesta+ uzduotis:\n");

        int minP = 10;
        int maxP = 20;
        int totalP = 0;

        int minK = 5;
        int maxK = 25;
        int totalK = 0;

        while (totalP <= 222 || totalK <= 222) {
            int pointsP = minP + (int) Math.round(Math.random() * (maxP - minP));
            int pointsK = minK + (int) Math.round(Math.random() * (maxK - minK));

            if (totalP < 222 && totalK < 222) {
                totalP += pointsP;
                totalK += pointsK;

                if (pointsP > pointsK) {
                    System.out.println("Petras surinko " + pointsP + " tasku, is viso: " + totalP + ". Kazys surinko " + pointsK + " tasku, is viso: " + totalK + ". Partija laimejo Petras.");
                } else if (pointsK > pointsP) {
                    System.out.println("Petras surinko " + pointsP + " tasku, is viso: " + totalP + ". Kazys surinko " + pointsK + " tasku, is viso: " + totalK + ". Partija laimejo Kazys.");
                } else {
                    System.out.println("Petras surinko " + pointsP + " tasku, is viso: " + totalP + ". Kazys surinko " + pointsK + " tasku, is viso: " + totalK + ". Lygiosios.");
                }

            } else {
                break;
            }
        }
        if (totalP > totalK) {
            System.out.println("Zaidima laimejo: Petras su " + totalP + " tasku.");
        } else if (totalK > totalP) {
            System.out.println("Zaidima laimejo: Kazys su " + totalK + " tasku.");
        } else {
            System.out.println("Zaidimas baigesi lygiosiomis.");
        }

//Reikia nupaišyti pilnavidurį rombą, taip pat, kaip ir pilnavidurį kvadratą, kurio aukštis 21 eilutė.

        System.out.println("------------------------------");
        System.out.println("\nSeptinta+ uzduotis:\n");

        int size3 = 21;

        for (int y = 0; y < size3; y++) {
            int spaces = Math.abs(size3 / 2 - y);
            int rhombus = size3 - 2 * spaces;

            for (int x = 0; x < spaces; x++) {
                System.out.print(" ");
            }

            for (int a = 0; a < rhombus; a++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("\n");

    int size4 = 21;

        for(int y = 0; y<size4; y++)

    {
        for (int x = 0; x < size4; x++) {
            System.out.print("* ");

        }
        System.out.println();
    }

//Sumodeliuokite vinies kalimą. Įkalimo gylį sumodeliuokite pasinaudodami Math.random() funkcija.
//Vinies ilgis 8.5cm (pilnai sulenda į lentą).
//a)“Įkalkite” 5 vinis mažais smūgiais. Vienas smūgis vinį įkala 5-20 mm. Suskaičiuokite kiek reikia smūgių.
//b)“Įkalkite” 5 vinis dideliais smūgiais. Vienas smūgis vinį įkala 20-30 mm, bet yra 50% tikimybė
//(pasinaudokite Math.random() funkcija tikimybei sumodeliuoti), kad smūgis nepataikys į vinį.
//Suskaičiuokite kiek reikia smūgių.

    System.out.println("------------------------------");
    System.out.println("\nAstunta+ uzduotis:\n");

    int fullLength = 85;
    int smallMin = 5;
    int smallMax= 20;
    int smallTotalCount = 0;

        for (int i = 1; i < 6; i++) {
            int smallTotal = 0;
            int smallCount = 0;
            while (smallTotal < fullLength) {
                int small = smallMin + (int) Math.round((Math.random() * (smallMax - smallMin)));
                smallTotal += small;
                smallCount++;
                System.out.print(small + " ");
            }
            smallTotalCount += smallCount;
            System.out.println("\n" + i + "aja lenta ikaleme is: " + smallCount + " smugiu.");

        }

        System.out.println("\nPenkias lentas mazais smugiais ikaleme per: " + smallTotalCount + " smugiu." );
        System.out.println("------------------------------");

        int longMin = 20;
        int longMax = 30;
        long longTotalCount = 0;

        for (int i = 1; i < 6; i++) {
            int longTotal = 0;
            int longCount = 0;
            while (longTotal < fullLength) {
                int min5 = 0;
                int max5 = 1;
                int chance = min5 + (int) Math.round(Math.random() * (max5 - min5));
                if (chance == 1) {
                    int longN = longMin + (int) Math.round((Math.random() * (longMax - longMin)));
                    longTotal += longN;
                    longCount++;
                    System.out.print(longN + " ");
                } else {
                    System.out.print("0 ");
                    longCount++;
                }
            }
            longTotalCount += longCount;
            System.out.println("\n" + i + "aja lenta ikaleme is: " + longCount + " smugiu.");

        }

        System.out.println("\nPenkias lentas dideliais smugiais ikaleme per: " + longTotalCount + " smugiu." );

//Sugeneruokite stringą, kurį sudarytų 50 atsitiktinių skaičių nuo 1 iki 200, atskirtų tarpais. Skaičiai turi būti
//unikalūs (t.y. nesikartoti). Sugeneruokite antrą stringą, pasinaudodami pirmu, palikdami jame tik pirminius skaičius
//(t.y tokius, kurie dalinasi be liekanos tik iš 1 ir patys savęs). Skaičius stringe sudėliokite didėjimo tvarka,
//nuo mažiausio iki didžiausio. (reikės split() funkcijos ir masyvų.)

    System.out.println("------------------------------");
    System.out.println("\nDevinta+ uzduotis:\n");


        int[] uniques = new int[50];                     //sukuriam masyva skaiciam
        int min6 = 1;
        int max6 = 200;
        int count = 0;                                       //unikalus skaiciai

        while (count < 50) {
            int num = min6 + (int) Math.round(Math.random() * (max6 - min6));

            boolean isUnique = true;                        //galvojam kad skaicius yra unikalus
            for (int i = 0; i < count; i++) {                //loopinam per visus pries tai sugeneruotus skaicius
                if (uniques[i] == num) {                     //tikrinam ar skaicius jau yra masyve
                    isUnique = false;                         //pazymim kad ne unikalus
                    break;                                     //iseinam is ciklo nes radom skaicius kuris pasikartoja
                }
            }

            if (isUnique) {                               //jeigu unikalus idedam i masyva
                uniques[count] = num;                     //idedam skaiciu i dabartini indeksa
                count++;
            }
        }

        Arrays.sort(uniques);                                     //sutvarkom masyva didejimo tvarka

        String result = "";                                       //sukuriam nauja string kuriame bus skaiciai su tarpais
        for (int i = 0; i < uniques.length; i++) {                //cikluojam per kiekviena elementa sutvarkytam masyve
            result += uniques[i] + " ";                      //pridedam kiekviena skaiciu atskirtu su tarpu i stringa
        }

        String[] splitNumbers = result.split("\\s+");              //atskiriam vienu ar dviem tarpais
        System.out.println("Pirmo masyvo skaiciai didejimo tvarka: ");
        System.out.println(String.join(" ", splitNumbers));          //spausdinam surusiuotus skaicius vienoje eiluteje

        int[] numbers = new int[splitNumbers.length];              //sukuriam masyva is sveiku skaiciu tokio pacio ilgio kaip string
        for (int i = 0; i < splitNumbers.length; i++) {             //cikluojam per string masyva
            numbers[i] = Integer.parseInt(splitNumbers[i]);       //konvertuojam kiekviena string i sveika skaiciu ir idedam i skaiciu masyva
        }

        StringBuilder primes = new StringBuilder();               //sukuriam StringBuilder kad laikytu pirminius skaicius
        for (int num : numbers) {                             //cikluojam per kiekviena skaiciu is skaiciu masyvo
            if (num <= 1) continue;                              //praleidziam skaicius maziau arba lygu 1, jie ne priminiai
            if (num == 2 || num == 3) {                          //"special case" 2 ir 3 yra pirminiai skaiciai
                primes.append(num).append(" ");                   //pridedam pirmini skaiciu i primes StringBuilder gala
                continue;                                                     //pereinam prie kito skaiciaus
            }
            if (num % 2 == 0 || num % 3 == 0) continue;                   //praleidziam skaicius kurie dalinasi is 2 ar 3

            //skaiciams didesniems nei 3, patikrinam dalyba pagal 6k+1 ar 6k-1 forma (tikrinti pirminiams skaiciams)

            boolean isPrime = true;                                     //galvojam kad skaicius pirminis
            for (int i = 5; i * i <= num ; i += 6) {                    //cikluojam nuo 5 iki skaiciaus saknies tikrinant 6k+-1
                if (num % i == 0 || num % (i + 2) == 0) {               //jeigu skaicius dalinasi is i arba i+2 nera pirminis
                    isPrime = false;                                    //pazymim kad ne pirminis
                    break;                                              //iseinam is ciklo nes radom kazkokia dalyba
                }
            }
            if (isPrime) {                              //jeigu skaicius pirminis
                primes.append(num).append(" ");             //pridedam i primes StringBuilder gala
            }
        }
        System.out.println("Pirminiai skaiciai:\n" + primes.toString().trim());





    }
}
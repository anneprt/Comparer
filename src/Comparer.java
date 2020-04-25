public class Comparer {
    public static void main(String[] args) {
        String proverbe1 = "Le mieux est l'ennemi du bien";
        String proverbe2 ="Le Mieux Est l'Ennemi du bien";
        System.out.println("1 : " + proverbe1);
        System.out.println("2 : " + proverbe2);

        System.out.println("Comparons les 10 premiers caractères : ");
        System.out.print("En tenant compte des majuscules : ");
        if (proverbe1.regionMatches(false, 0,proverbe2,0,10))
            System.out.println("Les 10 premiers caractères sont identiques");
        else
            System.out.println("Il y a des différences sur les 10 premiers caractères");
        System.out.print("Sans tenir compte des majuscules : ");
        if (proverbe1.regionMatches(18,proverbe2,18,6))
            System.out.println("Les caractères de 18 a 24 sont identiques");
        else
            System.out.println("Il y a des différences");
        if (proverbe1.compareTo(proverbe2) == 0)
            System.out.println("Les deux chaines sont identiques");
        else   {
            if (proverbe1.compareTo(proverbe2) < 0)
                System.out.print(proverbe1 + " est avant " + proverbe2);
            else
                System.out.print(proverbe1 + " est après " + proverbe2);
            System.out.println(" dans le dictionnaire");
        }
        System.out.print("Sans tenir compte des majuscules : ");
        if (proverbe1.equalsIgnoreCase(proverbe2))
            System.out.println("Les deux chaines sont identiques");
        else
            System.out.println("Les deux chaines sont différentes");

    }
}

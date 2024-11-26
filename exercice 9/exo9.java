public class Analyseur {
    public void analyserDonnees(int[] donnees) {
        CalculerMax(donnees);
        CalculerMini(donnees);
        CalculerMoyenne(donnees);

        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        System.out.println("Moyenne : " + moyenne);
    }

    private void CalculerMini(int[] donnees) {
        int min = Integer.MAX_VALUE;
        for (int valeur : donnees) {
            if (valeur < min) {
                min = valeur;
            }
        }
        return min;
    }

    private void CalculerMax(int[] donnees) {
        int max = Integer.MIN_VALUE;
        for (int valeur : donnees) {
            if (valeur > max) {
                max = valeur;
            }
        }
        return max;
    }

    private void CalculerMoyenne(int[] donnees) {
        int somme = 0;
        for (int valeur : donnees) {
            somme += valeur;
        }
        double moyenne = (double) somme / donnees.length;
        return moyenne;
    }

}

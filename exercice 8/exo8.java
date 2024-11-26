public class UserManager {
    public void gererUtilisateur(String action, String nom) {
        if (nom == null || nom.isEmpty()) {
            System.out.println("Erreur : nom invalide.");
            return;
        }
        
        switch (action) {
            case "ajouter":
                ajouterUtilisateur(nom);
                break;
            case "supprimer":
                supprimerUtilisateur(nom);
                break;
            case "rechercher":
                rechercherUtilisateur(nom);
                break;
            default:
                System.out.println("Action inconnue.");
                break;
        }
    }

    private void ajouterUtilisateur(String nom) {
        System.out.println("Utilisateur " + nom + " ajouté.");
    }

    private void supprimerUtilisateur(String nom) {
        System.out.println("Utilisateur " + nom + " supprimé.");
    }

    private void rechercherUtilisateur(String nom) {
        System.out.println("Recherche de l'utilisateur " + nom + ".");
    }
}

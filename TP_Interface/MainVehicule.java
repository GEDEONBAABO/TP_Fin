
public class MainVehicule {
    public static void main(String[] args) {
        // Création des véhicules
        Vehicule[] vehicules = {new Velo(), new Voiture(), new Moto()};

        for (Vehicule v : vehicules) {
            v.demarrer();
            v.arreter();
            System.out.println("Vitesse maximale: " + v.getVitesseMax() + " km/h\n");
        }
    }
}

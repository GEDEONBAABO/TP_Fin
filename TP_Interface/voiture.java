class voiture implements Vehicule {
    @Override
    public void demarrer() {
        System.out.println("La voiture démarre");
    }

    @Override
    public void arreter() {
        System.out.println("La voiture s'arrête");
    }

    @Override
    public int getVitesseMax() {
        return 200;
    }
}
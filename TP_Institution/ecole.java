class ecole extends Institution {
    private int nbrClasse;
    private String typeEcole;
    private String nomPromoteur;

    public ecole(String nomInstitution, String typeInstituion, String paysInstitution, int anneeCreation, int nbrClasse,
            String typeEcole, String nomPromoteur) {
        super(nomInstitution, typeInstitution, paysInstitution, anneeCreation);
        this.nbrClasse = nbrClasse;
        this.typeEcole = typeEcole;
        this.nomPromoteur = nomPromoteur;
    }

    // Accesseurs et mutateurs
    public int getNbrClasse() {
        return nbrClasse;
    }

    public void setNbrClasse(int nbrClasse) {
        this.nbrClasse = nbrClasse;
    }

    public String getTypeEcole() {
        return typeEcole;
    }

    public void setTypeEcole(String typeEcole) {
        this.typeEcole = typeEcole;
    }

    public String getNomPromoteur() {
        return nomPromoteur;
    }

    public void setNomPromoteur(String nomPromoteur) {
        this.nomPromoteur = nomPromoteur;
    }

    public String decrireEcole() {
        return super.decrireInstitution() + "\nType: " + typeEcole + "\nClasses: " + nbrClasse + "\npromoteur: "
                + nomPromoteur;
    }

    public static String listerPromoteurs(ecole ecole1, ecole ecole2, ecole ecole3) {
        return "Promoteurs: " + ecole1.getNomPromoteur() + ", " + ecole2.getNomPromoteur() + ", "
                + ecole3.getNomPromoteur();
    }
}
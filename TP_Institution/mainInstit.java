public class mainInstit{
    public static void main(String[] args) {
        // Création objets de nos class 
        Institution ins = new Institution("ISP", "Public","R.D.C" ,1999 );
        Universite univ1 = new Universite("ULPGL", "Privée", "R.D.C",1995,"LMD",8,"prof WASO" );
        Universite univ2 = new Universite("UCS", "Public", "R.D.C", 2000, "LMD", 7, "Recteur_UCS");
        
        ecole ecole1 = new ecole("C.S Amani", "Privée", "R.D.C", 2002, 41, "Primaire et Secondaire", "Msr MAHESHE");
        ecole ecole2 = new ecole("I.T.I.G", "Public", "R.D.C", 1984, 26, "Secondaire", "Mrs Jean-Bosco");
        ecole ecole3 = new ecole("I.I.Bakanja", "Public", "R.D.C", 1985, 24, "Secondaire", "Mrs Isidor");

        // Affichage des informations
        System.out.println("---- Description Institution ----\n");
        System.out.println(ins.decrireInstitution());
        
        System.out.println("\n\n---- Description Université ----\n");
        System.out.println(univ1.decrireUniversite());
        System.out.println("\n-----------------------------------\n");
        System.out.println(univ2.decrireUniversite());
        System.out.println("\n\n---- Recteurs ----\n");
        System.out.println(Universite.listerRecteurs(univ1, univ2));
        
        System.out.println("\n----- Description École ----\n");
        System.out.println("\n-----------------------------------\n");
        System.out.println(ecole1.decrireEcole());
        System.out.println("\n-----------------------------------\n");
        System.out.println(ecole2.decrireEcole());
        System.out.println("\n-----------------------------------\n");
        System.out.println(ecole3.decrireEcole());
        System.out.println("\n\n----- Promoteurs -----\n");
        System.out.println(ecole.listerPromoteurs(ecole1, ecole2, ecole3));
    }
}

class MainClass {
    public static void main(String[] args) {
        Chat chat1= new Chat(5, "marron");
        System.out.println("création d'un chat : ");
        System.out.println("le chat pèse "+ chat1.getPoids()+" et est de couleur "+chat1.getCouleur());

        chat1.setCouleur("grise");
        System.out.println("le chat pèse "+ chat1.getPoids()+" et est de couleur "+chat1.getCouleur());

        chat1.manger();
        chat1.boire();
        chat1.deplacement();
        chat1.crier();
    }
}
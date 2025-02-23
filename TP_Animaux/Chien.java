public class Chien extends Animal{
    public Chien(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("Le chien aime jouer !");
    }

    public void crier(){
        System.out.println("Le chien aboie: waouff waouff");
    }
}

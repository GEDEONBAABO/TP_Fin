public class Chat extends Animal {
    public Chat (int poids, String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("Le chat marche sans bruit !");
    }

    public void crier(){
        System.out.println("Le chat miaule: miaouuuu");
    }
}

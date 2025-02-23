public class Loup  extends Animal{
    public Loup(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("Les loups se deplacent en meute");
    }

    public void crier(){
        System.out.println("Le loup  hurle: aouuuuuuuuh");
    }
}
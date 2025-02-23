public class Tigre extends Animal{
    public Tigre(int poids , String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("Le tigre se déplace");
    }

    public void crier(){
        System.out.println("Le tigre feule : grrrrrr");
    }
}

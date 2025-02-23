public class Lion extends Animal {
    public Lion(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("Le lion impose !");
    }

    public void crier(){
        System.out.println("Le lion rugi: grrrrrr ");
    }
}
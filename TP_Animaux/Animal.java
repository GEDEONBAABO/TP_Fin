abstract class Animal {
    protected int poids;
    protected String couleur;

    public int getPoids(){
        return poids;
    }
    public void setPoids(int poids){
        this.poids= poids;
    }

    public String getCouleur(){
        return couleur;
    }
    public void setCouleur( String couleur){
        this.couleur = couleur;
    }

    public void manger(){
        System.out.println("On mange de la viande ");
    }

    public void boire(){
        System.out.println("On bois de l'eau ");
    }

    public abstract void deplacement();
    public abstract void crier();
}
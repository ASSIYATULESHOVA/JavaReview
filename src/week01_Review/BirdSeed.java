package week01_Review;

public class BirdSeed {
    private int numberOfBags;
    boolean call;

    public BirdSeed(){
        call = false;
    }

    public BirdSeed(int numberOfBags){
        this.numberOfBags = numberOfBags;
    }

    public static void main(String[] args) {
        BirdSeed seed = new BirdSeed();
        System.out.println(seed.numberOfBags);
    }
}

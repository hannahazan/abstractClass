public class Boat extends Vehicle{

    public Boat(String marque,int compteur){
        super(marque, compteur);
    }

    @Override
    public String doStuff(){
        return "Je suis "+getBrand()+" et je fais glou glou";
    }
}
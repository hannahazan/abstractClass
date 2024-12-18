public class Car extends Vehicle{

    public Car(String marque, int compteur){
        super(marque, compteur);
    }

    @Override
    public String doStuff (){
        return "je suis "+this.brand+" et je fais vroum vroum";
    }
}
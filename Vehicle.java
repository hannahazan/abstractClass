public abstract class Vehicle{

    String brand;
    int kilometers;

    public Vehicle(String marque, int compteur){
        this.brand = marque;
        this.kilometers = compteur;
    }

    public String getBrand(){

        return this.brand;
    }

    public void setBrand(String marque){

        this.brand = marque;
    }

    public int getKilometers(){

        return this.kilometers;
    }

    public void setKilometers(int compteur){

        this.kilometers = compteur;
    }

    public abstract String doStuff( );
}
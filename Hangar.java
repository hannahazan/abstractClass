public class Hangar{

    public static void main(String[] args) {
        
        Car peugeot = new Car("peugeot", 10);
        Boat titanic = new Boat("Titanic",2000);

        System.out.println(peugeot.doStuff());
        System.out.println(titanic.doStuff());
    }
}
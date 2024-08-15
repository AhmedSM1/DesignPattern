package structural.facade;


import creational.singleton.SingletonObj;

public class Main {

    /*
    The Facade pattern is particularly useful when you want to hide the complexity of a system and provide a simpler, more understandable interface for the client code.
     */
    public static void main(String[] args) {
        House client = new House();
        System.out.println("House setup "+ client);
        client.turnOnHouse(); //ugly details hidden
        System.out.println("House is now on"+ client);

        client.turnOffHouse(); //ugly details hidden
        System.out.println("House is now off "+ client);
    }


}

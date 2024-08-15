package creational.builder;

public class Main {

    public static void main(String[] args) {
        //The Builder pattern commonly uses method chaining, which allows you to create complex objects in a readable and organized manner.

        House house = new House.HouseBuilder("Concrete", "Wood", "Tiles")
                .setGarage(true)
                .setSwimmingPool(true)
                .build();

        System.out.println(house);

        House houseWithoutPool = new House.HouseBuilder("Concrete", "Brick", "Shingles")
                .setGarage(true)
                .setGarden(true)
                .build();

        System.out.println(houseWithoutPool);
    }



}
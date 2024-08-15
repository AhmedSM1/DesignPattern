package creational.singleton;

public class Main {

    public static void main(String[] args) {

            //Doesnt work
        //SingletonObj singleton = new SingletonObj();
        SingletonObj instance = SingletonObj.getInstance();
        instance.showMessage();


    }



}
package me.samuel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car toyotaCorolla = new Car("silver","Toyota Corolla");
        System.out.println(toyotaCorolla.start());
        Car hondaCivic = new Car("blue", "Honda Civic");
        System.out.println(hondaCivic.start());
//        Car porsche = new Car ("red", "Porsche");
//        System.out.println(porsche.start());
        System.out.println(toyotaCorolla.accelerate());
        System.out.println(hondaCivic.accelerate());
        System.out.println(hondaCivic.stopEmissions());
        System.out.println(hondaCivic.passEmissions());
        toyotaCorolla.setSpeed(50);
        System.out.println(toyotaCorolla.go());
        System.out.println(toyotaCorolla.stop());
        System.out.println(hondaCivic.pass(toyotaCorolla));
    }
}

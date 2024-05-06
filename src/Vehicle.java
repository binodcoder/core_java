public class Vehicle {
    String name;
    int price;
    String modelOfVehicle;
    String noOfSeats;

    Vehicle(String name, int price, String modelOfVehicle, String noOfSeats){
        this.name=name;
        this.price=price;
        this.modelOfVehicle=modelOfVehicle;
        this.noOfSeats=noOfSeats;
    }
    Vehicle(String name){
        this.name=name;
    }
    Vehicle(String modelOfVehicle, int price){
        this.modelOfVehicle=modelOfVehicle;
        this.price=price;
    }
    Vehicle(String modelOfVehicle, String noOfSeats){
        this.modelOfVehicle=modelOfVehicle;
        this.noOfSeats=noOfSeats;
    }
    Vehicle(String noOfSeats, int price, String name){
        this.noOfSeats=noOfSeats;
        this.price=price;
        this.name=name;
    }



}

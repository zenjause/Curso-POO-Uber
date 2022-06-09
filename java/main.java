class Main {
    public static void main(String[] args) {
     
        UberX uberX = new UberX("CC552", new Account("Andres Herrera ", "DNI34594844"),"Chevrolet", "Sonic");
        uberX.setPassenger(4);

        uberX.printDataCar();


        UberVan uberVan = new UberVan("CC552" ,new Account("Andres Herrera ", "DNI34594844" ));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
           
    
        
      /*  Car car2 = new Car("ALI632", new Account("Andrea Herrera","3464433234"));
        car2.passsenger = 3;

        car2.printDataCar(); */

    }

}
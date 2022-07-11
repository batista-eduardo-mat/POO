class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMDFX", new Account("Eduardo Batista", "BAT951601"),"Chevrolet","Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();
        
        Account Luis = new Account("Luis Mendoza", "MEN120998");
        UberVan uberVan = new UberVan("INTPM", Luis);
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}


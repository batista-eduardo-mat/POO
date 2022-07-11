public class Car {
    Integer id;
    String license;
    Account driver;
    protected Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if( passenger == 4 ){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas Agregar 4 pasajeros");
        }
        
    }

    void printDataCar(){
        System.out.println("License: " + license + " Driver: " + driver.name + "Passenger: " + passenger);
    }


}

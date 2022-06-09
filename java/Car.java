 class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passsenger;  

    public Car(String license,Account driver ){
        this.license = license;
        this.driver = driver;
    }
    
    void printDataCar(){
        if(passsenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + "Passengers " + passsenger);
        }
       
    }

    public Integer getPassenger(){
        return passsenger;
    }
    public void setPassenger(Integer passenger){
        if (passenger == 4){
            this.passsenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }

        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public Integer getPasssenger() {
        return passsenger;
    }

    public void setPasssenger(Integer passsenger) {
        this.passsenger = passsenger;
    }

    
}

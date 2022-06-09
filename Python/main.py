from car import Car

if __name__== "__main__":
    print ("hola mundo")

    car = Car()
    car.license = "AMS234"
    car.driver = "Andres Herrera"
    print(vars(car))


    car2 = Car()
    car2.license = "FDC256"
    car2.driver = "Jose Ernesto"
    print(vars(car2))
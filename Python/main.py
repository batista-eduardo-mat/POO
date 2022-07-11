from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMDFX", Account("Eduardo Batista","BAT950116"))
    car.passenge = "4"
    print(vars(car.driver))
    
    car2 = Car("INTPM", Account("Luis Mendoza", "MEN971209"))
    car2.passenge = "3"
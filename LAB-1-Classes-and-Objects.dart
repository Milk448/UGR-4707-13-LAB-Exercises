//Lab-1-Exercise-1
class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);
}

void main() {
  Car car = Car('Toyota', 'Camry', 2022);
  print('Brand: ${car.brand}');
  print('Model: ${car.model}');
  print('Year: ${car.year}');
}


//Lab-1-Exercise-2
class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);

  void makeSound() {
    print('Vroom Vroom');
  }
}

void main() {
  Car car = Car('Toyota', 'Camry', 2022);
  car.makeSound();
}
//Lab-1-Exercise-3
class Car {
  String brand;
  String model;
  int year;

  Car(this.brand, this.model, this.year);
  
  void makeSound() {
    print('Vroom Vroom');
  }
}

class ElectricCar extends Car {
  double batteryLife;

  ElectricCar(String brand, String model, int year, this.batteryLife) : super(brand, model, year);
}

void main() {
  ElectricCar electricCar = ElectricCar('Tesla', 'Model S', 2023, 300);
  print('Brand: ${electricCar.brand}');
  print('Model: ${electricCar.model}');
  print('Year: ${electricCar.year}');
  print('Battery Life: ${electricCar.batteryLife} miles');
  electricCar.makeSound();
}

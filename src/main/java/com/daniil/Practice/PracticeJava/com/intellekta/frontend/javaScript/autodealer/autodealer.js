class Car{
    constructor(model, power, price) {
        this.model = model;
        this.power = power;
        this.price = price;
    }
}

var car1 = new Car("BMW", 100, 100);
console.log(car1);

console.log(true + false); // true
console.log(10 / "2");  // 5
console.log("number" + 1 + 1); // number11
console.log(1 + 1 + "number"); //2number
console.log(null + 1); //1
console.log(undefined + 1) //1
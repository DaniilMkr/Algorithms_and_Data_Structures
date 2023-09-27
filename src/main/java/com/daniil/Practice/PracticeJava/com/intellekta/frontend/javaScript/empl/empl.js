function Employee(name, money) {
    this.name = name;
    this.money = money;
}

function summary() {
    var oleg = new Employee("Олег", 30000);
    var evgeniy = new Employee("Евгений", 25000);
    var kseniya = new Employee("Ксения", 40000);
    var aleksander = new Employee("Александр", 40000);
    console.log(oleg.money + evgeniy.money + kseniya.money + aleksander.money);
}

summary();




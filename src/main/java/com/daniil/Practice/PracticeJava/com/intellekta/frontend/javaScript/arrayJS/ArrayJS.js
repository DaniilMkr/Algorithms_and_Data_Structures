function yearSales() {
    let monthSales = [25,30,25,50,50,40,15,20,20];
    monthSales.unshift(20);
    monthSales.unshift(10);
    monthSales.push(30);
    let sum = 0;
    for(let i = 0; i < monthSales.length; i++) {
        sum = sum + monthSales[i];
    }
    console.log(monthSales.join("+") + " = " + "<"+ sum + ">");
}

yearSales();
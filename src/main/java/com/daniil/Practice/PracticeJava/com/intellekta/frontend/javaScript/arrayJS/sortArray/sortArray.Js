    
    const shopNumbers = [2,4,3,6,7,5,8];
    const shopSales = [10,23,2,7,19,21,26];

    function sortSales(number, sale) {
        let lenNumber = shopNumbers.length;
        if (number.lenght != shopSales.lenght) {
            console.log ("Corrupted Data");
        }
        else if (number.lenght == 0 || shopSales.lenght == 0) {
            console.log ("Empty Data");
        }
        else {
            let tempNumber = 0;
            let tempSale = 0;
            for (let i = 1; i < lenNumber; i++) {
                for (let j = 0; j < lenNumber - i; j++) {
                    if (number[j] < number [j + 1]) {
                        tempNumber = number[j];
                        tempSale = sale[j];
                        number[j] = number[j + 1];
                        sale[j] = sale[j + 1];
                        number[j + 1] = tempNumber;
                        sale[j + 1] = tempSale;
                     }
                }
            }
            
        }
    }

    console.log(shopNumbers);
    console.log(shopSales);
    sortSales(shopNumbers, shopSales);
    console.log(shopNumbers);
    console.log(shopSales);

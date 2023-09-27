    //Первое задание
    var firstArray;
    function arraySwap() {
        firstArray = ["First", "Second", "Third"];
        firstArray[2] = 3;
        alert(firstArray);
    }
    arraySwap();

    let secondArray = [1,2,3];

    secondArray.push(...firstArray);
    console.log(secondArray);

    // Второе задание
    function salaryArray() {
    let array = {'Николай': 10000,
    'Иван': 15000,
    'Фёдор': 20000
    };

    alert(array.Иван);
    }
    
    salaryArray();



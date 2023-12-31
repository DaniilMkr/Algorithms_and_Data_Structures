<!doctype html> 
<html> 
<head> 
  <meta charset="utf-8">
  <style>
    .header { background: #D5BAE4; text-align: center; }
    .layout DIV { position: absolute; }
    .col1 { left: 5%; width: 25%; }
    .col2 { left: 38%; width: 25%; margin-right:2px; }
    .col3 { right: 5%; width: 25%; }
    div {font-size: 18px;}
    table {
    font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
    font-size: 14px;
    border-radius: 10px;
    border-spacing: 0;
    text-align: center;
    }
    th {
    background: #6699FF;
    color: white;
    text-shadow: 2px 1px 1px #000;
    padding: 10px 20px;
    }
    th, td {
    border-style: solid;
    border-width: 0 1px 1px 0;
    border-color: white;
    }
    th:first-child, td:first-child {
    text-align: center;
    }
    th:first-child {
    border-top-left-radius: 10px;
    }
    th:last-child {
    border-top-right-radius: 10px;
    border-right: none;
    }
    td {
    padding: 10px 20px;
    background: #6699CC;
    }
    tr:last-child td:first-child {
    border-radius: 0 0 0 10px;
    }
    tr:last-child td:last-child {
    border-radius: 0 0 10px 0;
    }
    tr td:last-child {
    border-right: none;
    }
    .btn-group button {
      background-color: #6699CC; /* Green background */
      border: 1px solid #6699CC; /* Green border */
      color: white; /* White text */
      padding: 10px 24px; /* Some padding */
      cursor: pointer; /* Pointer/hand icon */
      float: left; /* Float the buttons side by side */
      margin-bottom: 25px;
      font-size: 18px;
      text-shadow: 2px 1px 1px #000;
    }
    .btn-group button:not(:last-child) {
      border-right: none; /* Prevent double borders */
    }
    /* Clear floats (clearfix hack) */
    .btn-group:after {
      content: "";
      clear: both;
      display: table;
    }
    /* Add a background color on hover */
    .btn-group button:hover {
      background-color: #4F4FFF;
    }
  </style>
</head> 
<body> 
<div class="header"><h1>Стоимость акций компаний</h1></div> 
<div class="btn-group" style="width:100%"> 
  <button style="width: 25%; margin-right:10%; margin-left:20%;" onclick = "start()">Получить данные</button>
  <button style="width: 25%;" onclick = "stop()">Остановить</button>
</div> 
<div class="layout"> 
  <div class="col1">
    <table border="1px" id="sber-table">
      <tr>
        <th>Дата</th>
        <th>Стоимость акции</th>
        <th>Публичное акционерное общество</th>
      </tr>
    </table>
  </div>
  <div class="col2">
    <table border="1px" id="gaz-table">
      <tr>
        <th>Дата</th>
        <th>Стоимость акции</th>
        <th>Публичное акционерное общество</th>
      </tr>
    </table>
  </div>
  <div class="col3">
    <table border="1px" id="luk-table">
      <tr>
        <th>Дата</th>
        <th>Стоимость акции</th>
        <th>Публичное акционерное общество</th>
      </tr>
    </table>
  </div>
</div> 
</div> 
  <script>
    //Переменная для setInterval
    var interval = 3000;
    //Ваш код здесь:
    function start(){
    setInterval(addRow(), interval)
} 
    function stop(){
    clearInterval(start())
} 
  </script>
  <script>
    async function addRow() {
    //Получаем json-файл с Мосбиржи
      const sber_json = await fetch('https://iss.moex.com/iss/engines/stock/markets/shares/securities/'
      + 'SBER' + '.json').then(function(res) { return res.json()});
      const gaz_json = await fetch('https://iss.moex.com/iss/engines/stock/markets/shares/securities/'
      + 'GAZP' + '.json').then(function(res) { return res.json()});
      const luk_json = await fetch('https://iss.moex.com/iss/engines/stock/markets/shares/securities/'
      + 'LKOH' + '.json').then(function(res) { return res.json()});
    //Получаем стоимость конкретной акции из json-файла
      var sber = sber_json.marketdata.data.filter(function(d) { return ['TQBR', 'TQTF'].indexOf(d[1]) !== -1; })[0][12];
      var lukoil = luk_json.marketdata.data.filter(function(d) { return ['TQBR', 'TQTF'].indexOf(d[1]) !== -1; })[0][12];
      var gazprom = gaz_json.marketdata.data.filter(function(d) { return ['TQBR', 'TQTF'].indexOf(d[1]) !== -1; })[0][12];
    //Заполняем соответствующие поля в таблицах
      fillData("sber-table", sber);
      fillData("luk-table", lukoil);
      fillData("gaz-table", gazprom);
  }
  //Добавление строк в таблицу
  //table_id - идентификатор таблицы, price - стоимость акции
  function fillData(table_id, price)
  {
  //Получаем текущую дату и время, приводим к нужному формату
    var date = new Date().toLocaleString('ru-RU', {
        weekday: 'short', // long, short, narrow
        day: 'numeric', // numeric, 2-digit
        year: 'numeric', // numeric, 2-digit
        month: 'long', // numeric, 2-digit, long, short, narrow
        hour: 'numeric', // numeric, 2-digit
        minute: 'numeric', // numeric, 2-digit
        second: 'numeric', // numeric, 2-digit
      });
  //Находим нужную нам таблицу
    var tbody = document.getElementById(table_id)
  //Создаем элементы таблицы и заполняем их данными
    var row = document.createElement("TR")
    var td1 = document.createElement("TD")
    td1.appendChild(document.createTextNode(date));
    var td2 = document.createElement("TD")
    td2.appendChild(document.createTextNode(price));
    var td3 = document.createElement("TD")
    var name
    switch(table_id){
      case 'sber-table':
        name = "Сбербанк";
        break;
      case 'gaz-table':
        name = "Газпром";
        break;
      case 'luk-table':
        name = "Лукойл";
        break;
    }
    td3.appendChild(document.createTextNode(name));
    //Добавляем строки в таблицу
    row.appendChild(td1);
    row.appendChild(td2);
    row.appendChild(td3);
    tbody.appendChild(row);
  }
  </script>
</body> 
</html>



const rusWeek = ["Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"];
const engWeek = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];

function localWeek(language) {
    var eng = (language == rusWeek) ? rusWeek : engWeek;
    console.log(eng);
}

localWeek(engWeek);
localWeek(rusWeek);

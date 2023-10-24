function UserAgeException(message) {
    this.message = message;
}

function checkAge(age) {
    try {
        if (age < 16 || age > 120) {
            throw new UserAgeException("Неподходящий возраст");
        }
        else if (age == isNaN) {
            throw new error;

        }
        else if (age != null && age.length == 0) {
            throw new UserAgeException("Пустое поле ввода, введите данные");
        } 

        
    } catch (error) {
       UserAgeException("Некорректные данные");       
    }


}
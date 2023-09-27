let nicknames = ["John1", "Tyler", "UserName", "Bot123", "Siri1", "Alexa", "Alex", "admin", "admin2"];


function checkNickName(nickname) {
    return !/^[a-zA-Z]+$/.test(nickname);
}


function clearNickNames(nicknames) {
    for (let i = 0; i < nicknames.length; i++) {
        if (checkNickName(nicknames[i])) {
           delete nicknames[i];
           
        }
    }
}

console.log(nicknames);
clearNickNames(nicknames);
console.log(nicknames);


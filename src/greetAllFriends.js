const fs = require('fs');

const readFriendsList = require('../src/readFriendsList')

const greetAllFriends = (filePath) => {
    
    const friendsList = readFriendsList.readAllFriends(filePath);
    var birthdayList = [];

    for (var i = 0; i < friendsList.length; i++) {
        var oneFriend = friendsList[i];
        let date_ob = new Date();
        
        const friendsBirthDate = oneFriend.dateOfBirth.slice(5,10);
        currentDateString = date_ob.toISOString().slice(5,10); 
        
        if(friendsBirthDate === currentDateString){
            birthdayList.push(oneFriend.email)
        }

    }

    return birthdayList;

}

module.exports = { greetAllFriends }
const  greetAllFriends = require("./greetAllFriends");

function mailAllFriends(filePath){

    const friendsToMail = greetAllFriends.greetAllFriends(filePath);
    for (i = 0; i<friendsToMail.length ; ++i){
        mailTo(friendsToMail[i]);
    }

}

function mailTo( email ){
    
    // Any Mail API connection

    console.log('\tMail sent to : ' + email);

}

module.exports =  {mailAllFriends} ;
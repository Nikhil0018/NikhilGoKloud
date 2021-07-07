const mailFriends = require('../src/mailFriends')
const readFriendsList = require('../src/readFriendsList')
const greetAllFriends = require('../src/greetAllFriends')
const {assert} = require('chai')
const sinon = require("sinon")
const fs = require('fs')
const { fake } = require('sinon')
const friends = [
            
    {
    firstName: "John",
    lastName: "Doe",
    dateOfBirth: "1995-03-09",
    email: "john.doe@gmail.com",
    },

    {
    firstName: "Mary",
    lastName: "Ann",
    dateOfBirth: "2021-07-06",
    email: "mary.ann@foobar.com",
    },
    
];

describe('Friends Store', ()=>{

    it('Should throw an exception if no file path is passed', ()=>{

        assert.throws( ()=> readFriendsList.readAllFriends() ,"No File Path Specified");

    })

    it('Should throw an exception if file path is invalid', ()=>{
        assert.throws(()=> readFriendsList.readAllFriends("friendsList.json"), 'Not a valid path')
    })

    it('Should return list of all friends', ()=>{

        const fake_ReadFileSync = sinon.fake.returns(friends);
        sinon.replace(fs, "readFileSync", fake_ReadFileSync);
        const result = readFriendsList.readAllFriends("./files/friendsList.json");
        assert.isArray(result);
        assert.equal(result.length, friends.length);
        assert.isTrue(fake_ReadFileSync.calledOnce);

    })

})


describe('Greet Friends', ()=>{

    it('Should call readAllFriends function once',()=>{

        const fake_readAllFriends = sinon.fake.returns([])
        sinon.replace( readFriendsList , 'readAllFriends', fake_readAllFriends)

        const result = greetAllFriends.greetAllFriends();
        sinon.restore();

        assert.isTrue(fake_readAllFriends.calledOnce);

    })

    it('Should greet friends if friend\'s birth date matches with current date',()=>{

        const fake_readAllFriends = sinon.fake.returns(friends);
        sinon.replace( readFriendsList, 'readAllFriends', fake_readAllFriends );
        const result = greetAllFriends.greetAllFriends();
        sinon.restore();
        assert.isNotNull(result);

    })

})

describe('Mail Service',()=>{

    it('Call the greetAllFriends',()=>{

        const fake_greetAllFriends = sinon.fake.returns( [] )
        sinon.replace( greetAllFriends , 'greetAllFriends', fake_greetAllFriends)
        const result = mailFriends.mailAllFriends();
        sinon.restore();
        assert.isTrue(fake_greetAllFriends.calledOnce);

    })

    it('Should mail to all the friends using the list returned by greetAllFriends',()=>{

        const mails = ['itsvaasbaby@gmail.com'];
        const fake_greetAllFriends = sinon.fake.returns(mails);
        sinon.replace(greetAllFriends, 'greetAllFriends', fake_greetAllFriends);
        const result = mailFriends.mailAllFriends();
        sinon.restore();
        assert.isNotNull(result);

    })


})

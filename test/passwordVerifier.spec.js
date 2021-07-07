// 1. password should be larger than 8 chars
// 2. password should not be null
// 3. password should have one uppercase letter at least
// 4. password should have one lowercase letter at least
// 5. password should have one number at least

const { verifyPassword } = require('../src/passwordVerifier')
const { assert } = require('chai')

describe('Password Verify', ()=>{

    it('Password Should not be null',()=>{

        assert.throws(()=>{verifyPassword(null)}, 'Null Error');

    })

    it('Password Should not be less than 9 characters long',()=>{

        assert.throws(()=>{verifyPassword("12sdad3")}, 'Length Error');

    })

    it('Password Should have atleast one UpperCase character',()=>{

        assert.throws(()=>{verifyPassword("aaaaaaaaaa")}, 'No UpperCase Char Error');

    })

    it('Password Should have atleast one LowerCase character',()=>{

        assert.throws(()=>{verifyPassword("AAAAAAAAAA")}, 'No LowerCase Char Error');

    })

    it('Password Should have atleast one Number',()=>{

        assert.throws(()=>{verifyPassword("AAAAAaaaaa")}, 'No digit Error');

    })



})

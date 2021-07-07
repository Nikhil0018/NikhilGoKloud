const verifyPassword = (password) =>{

    if(password === null){
        
        throw new Error('Null Error')
    
    }
    else{

        if(password.length <= 8){
            
            throw new Error('Length Error')

        }else{

            if(  password === password.toLowerCase() ){

                throw new Error('No UpperCase Char Error')
   
            }
            if(  password === password.toUpperCase() ){

                throw new Error('No LowerCase Char Error')
   
            }
            if( !(/\d/.test(password)) ){

                throw new Error('No digit Error')

            }

    
        }
        
       
    }

}

module.exports = {verifyPassword};
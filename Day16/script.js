const user = {
    detail: { name: 'ABC', age: 12, id: 1},
    address: { city: 'Nagpur', zipcode:441501, state: 'Maharashta', country: 'India'},
    contact: { email: "abc@gmail.com", phone: 7212345678}
}


for(let key in user){
    console.log(key , '------>')
    for(let subkey in user[key]){
        console.log(subkey ,"-->", user[key][subkey])
    }
}


// Object.values(user).map(element=> Object.values(element).map(e=> console.log(e)))

import fun1 from "./functionJs.js";

fun1()

import {fun2, fun3} from "./functionJs.js"
fun2()
fun3()
const data = {
    user1:{
        name: "A",
        age: 21,
        id: 1
    },
    user2:{
        name: "B",
        age: 31,
        id: 2
    },
    user3:{
        name: "C",
        age: 16,
        id: 3
    },
    user4:{
        name: "D",
        age: 19,
        id: 5
    }
}

// console.log(data.user1.name)
// console.log(data.user3.age)
// console.log(data.user1.id)
// console.log(data.user1)


// console.log(Object.keys(data).length)
// Object.keys(data).map((key)=>console.log(key))
// Object.values(data).map((val)=> console.log(val))


// var dataInArray = Object.values(data);
// console.log("Names: ")
// for(var i = 0; i < dataInArray.length; i++){
//     console.log(dataInArray[i].name)
// }


// console.log("Ages")
// for(var i = 0; i < dataInArray.length; i++){
//     console.log(dataInArray[i].age)
// }

// console.log("Name and Age")
// for(var i = 0; i < dataInArray.length; i++){
//     console.log(dataInArray[i].name, dataInArray[i].age)
// }

// for(let i in data){
//     console.log(data[i]);
// }

// for(let value of Object.values(data)){
//     console.log(value);
// }

// Object.values(data).forEach(element => {
//     console.log(element);
    
// });


// use a loop to print all user name
// for(var i in data){
//     console.log(data[i].name)
// }

// var arr = Object.values(data).map(element => element.name);
// console.log(arr)


// 1. Convert the user object into an aray of user objects
var arr = Object.values(data);
console.log(arr)

// 2. Using map return an array of user name
console.log(Object.values(data).map(element =>element.name))

// 3. Using map return an array of user ages
console.log(Object.values(data).map(element =>element.age))

// 4. Using map return an array of user id and name only
console.log(Object.values(data).map(element => {
    return {id: element.id, name: element.name}
}));


// 5. Convert user names to uppercase using map()
console.log(Object.keys(data).map(element => data[element].name = data[element].name.toLowerCase()))

// 6. Add 5 year to each user's age and return a new array
console.log(Object.keys(data).map(element => data[element].age = data[element].age + 5))

// 7. Create an array of users with an extra property isadult
var dataWithIsAdult = Object.values(data).map(element => {
    return {
        id: element.id,
        name: element.name,
        age: element.age,
        isAdult: element.age > 18 ? true : false
    }
})
console.log(dataWithIsAdult)

// 8. Return array like ['A(1)', 'B(2)', 'C(3)', 'D(5)']

var newFormat = Object.values(data).map(element => {
    var str = element.name + "(" + element.id + ")"
    return str
})
console.log(newFormat)

// 9. Add a property canVote(true if age >= 18)
var dataWithCanVote = Object.values(data).map(element => {
    return {
        id: element.id,
        name: element.name,
        age: element.age,
        canVote: element.age >= 18 ? true:false
    }
})
console.log(dataWithCanVote)

// 10. Create an array of city names 
var cities = ["Nagpur","Pune", "Mumbai","Pune"]

console.log(Object.values(data).map((element,index) => {
    return {
        id: element.id,
        name: element.name,
        age: element.age,
        city: cities[index]
    }
}));


// 11. Rename key name to fullname using Map()
var data2 = Object.values(data).map(element => {
    return {
        id: element.id,
        FullName: element.name,
        age: element.age,
    }
});
// console.log(data2);


// 12. Remove city 
console.log(Object.values(data2).map((element,index) => {
    return {
        id: element.id,
        name: element.FullName,
        age: element.age,
    }
}));


// 13. Return an array of object like {userID: 1, userName: "ABC"}

console.log(Object.values(data2).map((element,index) => {
    return {
        userId: element.id,
        userName: element.FullName,
    }
}));

// Return the first object who statify the condition
var findExample = Object.values(data).find(element => element.age >= 18)
console.log(findExample)

// Return all the object who statify the condition
var filterExample = Object.values(data).filter(element => element.age >= 18)
console.log(filterExample)

var someExample = Object.values(data).some(element => element.age >= 18)
console.log(someExample)

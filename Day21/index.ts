// enum Status {
//     PENDING = 'Pending',
//     DOING = 'Doing',
//     COMPLETED = 'Completed'
// }

// interface ToDo {
//     title: string
//     status: Status
// }

// function isStatus(status: string): boolean {
//     return Object.values(Status).includes(status as Status)
// }

// console.log(isStatus('Pending'));
// console.log(isStatus('Random'));


// Primitive datatypes 
let username: string = 'Rahul';
let age: number = 23;
let isAdmin: Boolean = true;

// Arrays and tuples
let number: Number[] = [1, 2, 3]
let user: [string, number] = ["Amit", 22]
let useState: [number, Function] = [0, () => console.log("Use state returns a tuple")]

// any, unknown, void, never
// let data: any;
let value: unknown = null;
// function log(): void { };
// console.log("Length: ", (String)(value).length)


// Converting String to number
let c: string = "A";
// console.log("c:", Number(c) - 9)
// console.log("c:", parseInt(c) - 9)



// let values: unknown[] = [0, 1, "", "hello", null, undefined, [], {}]

// values.forEach((value) => {
//     console.log((Boolean)(value))
// })

function getLength(input: unknown): number {
    return (String)(input).length;
}

console.log("getLength(123) Length", getLength(123))
console.log("getLength(Hello) Length", getLength("Hello"))
console.log("getLength(null) Length", getLength(null))

var products: { pname: string, pid: number }[] = [{ pname: "P1", pid: 10 }
    , { pname: "P2", pid: 20 },
{ pname: "P1", pid: 10 }
]



class animal {
    speak(): void {
        console.log("Speak")
    }
}
class Human extends animal {
    speak(): void {
        console.log("Hiii")
    }
}
const h1 = new Human()
h1.speak();

// class dog extends animal {
//     bark(): void {
//         console.log("Bark")
//     }
// }

// var dogesh = new dog();
// dogesh.bark()
// dogesh.speak()var __extends = (this && this.__extends) || (function () {
var extendStatics = function (d, b) {
    extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
    return extendStatics(d, b);
};
return function (d, b) {
    if (typeof b !== "function" && b !== null)
        throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
    extendStatics(d, b);
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
}) ();
var Status;
(function (Status) {
    Status["PENDING"] = "Pending";
    Status["DOING"] = "Doing";
    Status["COMPLETED"] = "Completed";
})(Status || (Status = {}));
var task1 = {
    title: 't1',
    status: Status.PENDING,
};
var add = function (x, y) { return (x + y); };
// function isStatus(status: string): boolean {
//     return Object.values(Status).includes(status as Status)
// // }
// console.log(isStatus('Pending'));
// console.log(isStatus(Status.PENDING));
//Primitive datatypes:
var username = 'Rahul';
var age = 23;
var isAdmin = true;
// Arrays and tuples
var numbers = [1, 2, 3];
var user = ["Amit", 22];
var useState = [0, function () { return console.log('Use state returns a tuple'); }];
// Any,Unknown,void,never
var data;
var value;
function log() { }
{
    console.log('void function');
}
;
data = 10;
data = 'name';
data = true;
console.log("🦥 ~ :37 ~ data:", data);
value = 10;
value = 'name';
console.log(" ~ :40 ~ value:", value);
function count(value) {
    return 'abchd';
}
function crash() {
    throw new Error("Boom");
}
// crash();
/// type inference
var city = 'delhi';
// let country;//type any
var country;
var id;
id = 123456;
// we are telling to our compiler that id type will be string
var strLength = id.length;
// we are converting number value to string
console.log(" ~ :61 ~ strLength:", String(id).length);
// mkjhbgv
//boolean to string conversion
var isActive = true;
console.log(" ~ isActive:", String(isActive).length);
// Null & Undefined
// Input
var a = null;
console.log(" ~ :77 ~ a:", String(a).length);
var b = undefined;
console.log(" ~ :79 ~ b:", String(b).length);
// Task
// Convert both to string
// Print length
// convert a string to number
var constant = '1234567.987';
console.log(" ~ :90 ~ constant:", Number(constant));
console.log(" ~ :90 ~ constant:", parseInt(constant));
console.log(" ~ :90 ~ constant:", parseFloat(constant));
//  :90 ~ constant: 1234567.987
//  ~ :90 ~ constant: 1234567
//  ~ :90 ~ constant: 1234567.987
//Task 3
// Truthy / Falsy
// Input
// let values: unknown[] = [0, 1, "", "hello", null, undefined, [], {}];
// Task
// Convert each to boolean
// Print result
// Expected Output (Concept)
// false, true, false, true, false, false, true, true
var values = [0, 1, "", "hello", null, undefined, [], {}];
values.forEach(function (value) {
    console.log((Boolean)(value));
});
var result = [];
var ans = result.length ? true : false;
// User Input Length Checker
// Task
// Write a function that accepts unknown
// Convert input to string
// Return its length
function getLength(value) {
    // your co
    function getLength(input) {
        return (String)(input).length;
    }
    var ans = getLength(value);
    console.log(" ~ :138 ~ getLength ~ ans:", ans);
    return ans;
}
// Closure happens as soon as an inner function accesses outer scope
// Test with:
getLength(123);
getLength("hello");
getLength(null);
// closure vs scope
// scope:->
// global scope
// block scope
if (true) {
    var x = 0;
}
// function scope
function outer(x) {
    console.log(x);
    return function inner(y) {
        return y;
    };
}
function createCounter() {
    var count = 0;
    return function () {
        console.log(count);
        return ++count;
    };
}
var counter = createCounter();
counter();
counter();
counter();
var arrowFunction = function (x) {
    return 1000000;
};
console.log(arrowFunction(0));
// objects, interfaces, type alias
var users = {
    name: 'name',
    age: 23
};
users.name = 'nagpur';
// products array which contains product using ts
var products = [
    { pname: "P1", pid: 10 },
    { pname: "P2", pid: 20 },
    { pname: "P1", pid: 10 }
];
console.log(" ~ :208 ~ products:", products);
// classes and oops
//constructor
//object
//access modifier public private protected
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    person.prototype.greet = function () {
        console.log('Hello my name is ' + this.name);
    };
    return person;
}());
var p1 = new person('Nikhil', 25);
// p1.greet();
//shorthand method to write class and || shorthand constructor
var Employee = /** @class */ (function () {
    function Employee(name, salary) {
        this.name = name;
        this.salary = salary;
    }
    return Employee;
}());
// animal-> speak | dog extends animal -> bark
// create inheritence for it using ts class
var animal = /** @class */ (function () {
    function animal() {
    }
    animal.prototype.speak = function () {
        console.log("Speak");
    };
    return animal;
}());
var dog = /** @class */ (function (_super) {
    __extends(dog, _super);
    function dog() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    dog.prototype.bark = function () {
        console.log("Bark");
    };
    return dog;
}(animal));
var dogesh = new dog();
dogesh.bark();
dogesh.speak();
// dog is a animal
// create a class human extending ANIMAL  overide speak function
var Human = /** @class */ (function (_super) {
    __extends(Human, _super);
    function Human() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Human.prototype.speak = function () {
        console.log("Hiii");
    };
    return Human;
}(animal));
var h1 = new Human();
h1.speak();
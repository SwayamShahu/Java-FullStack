

enum Status {
    PENDING = 'Pending',
    DOING = 'Doing',
    COMPLETED = 'Completed'
}
// interface
interface Todo {
    readonly title: string
    status: Status
}

const task1: Todo = {
    title: 't1',
    status: Status.PENDING,
}

// function interface
interface Add {
    (a: number, b: number): number;
}
const add: Add = (x, y) => (x + y)


// function isStatus(status: string): boolean {
//     return Object.values(Status).includes(status as Status)
// // }

// console.log(isStatus('Pending'));
// console.log(isStatus(Status.PENDING));

//Primitive datatypes:
let username: string = 'Rahul';
let age: number = 23;
let isAdmin: Boolean = true;

// Arrays and tuples
let numbers: number[] = [1, 2, 3];
let user: [string, number] = ["Amit", 22]
let useState: [number, Function] = [0, () => console.log('Use state returns a tuple')]

// Any,Unknown,void,never
let data: any;
let value: unknown;
function log(): void { } {
    console.log('void function')
};

data = 10;
data = 'name';
data = true;
console.log("🦥 ~ :37 ~ data:", data)

value = 10
value = 'name';
console.log(" ~ :40 ~ value:", value)

function count(value: number): string {
    return 'abchd';
}

function crash(): never {
    throw new Error("Boom");
}
// crash();

/// type inference
let city = 'delhi'
// let country;//type any
let country: string;
let id: unknown;
id = 123456;

// we are telling to our compiler that id type will be string
let strLength: number = (<string>id).length;

    // we are converting number value to string
    console.log(" ~ :61 ~ strLength:", String(id).length)
    // mkjhbgv

    //boolean to string conversion
    let isActive: boolean | string = true;
    console.log(" ~ isActive:", String(isActive).length)

    // Null & Undefined

    // Input

    let a: unknown = null;
    console.log(" ~ :77 ~ a:", String(a).length)
    let b: unknown = undefined;
    console.log(" ~ :79 ~ b:", String(b).length)


    // Task

    // Convert both to string

    // Print length

    // convert a string to number
    let constant = '1234567.987'
    console.log(" ~ :90 ~ constant:", Number(constant))
    console.log(" ~ :90 ~ constant:", parseInt(constant))
    console.log(" ~ :90 ~ constant:", parseFloat(constant))
//  :90 ~ constant: 1234567.987
//  ~ :90 ~ constant: 1234567
//  ~ :90 ~ constant: 1234567.987

//Task 3
// Truthy / Falsy

// Input

// let values: unknown[] = [0, 1, "", "hello", null, undefined, [], { }];


    // Task

    // Convert each to boolean

    // Print result

    // Expected Output (Concept)

    // false, true, false, true, false, false, true, true

    let values: unknown[] = [0, 1, "", "hello", null, undefined, [], { }]

values.forEach((value) => {

        console.log((Boolean)(value))

    })
    let result = []
    let ans = result.length ? true : false;

    // User Input Length Checker

    // Task

    // Write a function that accepts unknown

    // Convert input to string

    // Return its length

    function getLength(value: unknown): number {
        // your co
        function getLength(input: unknown) {

            return (String)(input).length;

        }

    let ans = getLength(value);
    console.log(" ~ :138 ~ getLength ~ ans:", ans)
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
        let x = 0;
}
    // function scope

    function outer(x: number) {
        console.log(x);
    return function inner(y: string) {
        return y;
    }
}

    function createCounter(): Function {
        let count = 0;
    return function () {
        console.log(count);
    return ++count;
    }
}

    const counter = createCounter();

    counter();
    counter();
    counter();

const arrowFunction = (x: number): number => {
    return 1000000;
}

    console.log(arrowFunction(0));

    // objects, interfaces, type alias
    const users: {name: string, age: number } = {
        name: 'name',
    age: 23
}

    users.name = 'nagpur'

    // products array which contains product using ts
    let products: {pname: string, pid: number }[] = [
    {pname: "P1", pid: 10 }

    , {pname: "P2", pid: 20 },

    {pname: "P1", pid: 10 }

    ]
    console.log(" ~ :208 ~ products:", products)

    // classes and oops

    //constructor
    //object
    //access modifier public private protected

    class person {
        name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
    this.age = age;
    }

    greet(): void {
        console.log('Hello my name is ' + this.name);
    }
}

    const p1 = new person('Nikhil', 25);
    // p1.greet();

    //shorthand method to write class and || shorthand constructor
    class Employee {
        constructor(public name: string, private salary: number) { }
}

    // animal-> speak | dog extends animal -> bark
    // create inheritence for it using ts class

    class animal {
        speak(): void {
        console.log("Speak")
    }

    //method overloading
    walk(legs:number,hands:number):void;
    walk(legs:number):void;

    walk(legs:number,hands?:number){
        if(hands!== undefined){
        console.log(`walking with ${legs} legs and ${hands} hands`);
        }
    else{
        console.log(`walking with ${legs} legs`);
        }
    }
}

    class dog extends animal {
        bark(): void {
        console.log("Bark")
    }
}

    const dogesh = new dog();

    dogesh.bark()

    dogesh.speak()

    // dog is a animal

    // create a class human extending ANIMAL  overide speak function
    class Human extends animal {
        speak(): void {
        console.log("Hiii")
    }
   
}

    const h1 = new Human()

    h1.speak();

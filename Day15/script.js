// Write a function checkEvenOdd(num) -> Print "Even" if number is even, otherwise "odd"
function checkEvenOdd(num){
    if(num % 2 == 0){
        console.log(num , " is a even number")
    }else[
        console.log(num , " is a odd number")
    ]
}


// Create a function checkAge(age) -> if age>= 18 print "Eligible to vote", else "Not eligible"
function checkAge(age){
    if(age >= 18){
        console.log("Eligible to vote")
    }else{
        console.log("Not eligible")
    }
}
// checkAge(17)


// Write a function findGreater(a, b) -> Print which number is greater or if both are equal
function findGreater(a,b){
    if(a==b){
        console.log('Both are equal')
    }else if(a > b){
        console.log("Number greater is ", a)
    }else{
        console.log("Number greater is ", b)
    }
}
// findGreater(8,9)


// Create a function checkPassFail(marks) -> if marks>= 40 -> pass, else fail
function checkPassFail(marks){
    if(marks >= 40){
        console.log("Pass")
    }else{
        console.log("Fail")
    }
}
// checkPassFail(30)


// Create a function checkTemperature(temp)
//  1. temp > 30 -> hot
//  2. temp between 20-30 -> Normal
//  3. temp < 20 -> cold
function checkTemperature(temp){
    if(temp > 30){
        console.log("Hot")
    }else if(temp > 20 && temp < 30){
        console.log("Normal")
    }else{
        console.log("Cold")
    }
}
// checkTemperature(34)


function printNumbers(n){
    for(var i = 1; i <= n; i++){
        console.log(i);
    }
}
// printNumbers(5)


function printTable(num){
    for(var i = 1; i <= 10; i++){
        console.log(i * num);
    }
}
// printTable(2)


function sumOfNumbers(n){
    let sum = 0;

    // for(var i = 1; i <= n;i++){
    //     sum = sum + i
    // }
    // console.log(sum)


    console.log(n * (n+1) /2)
}
// sumOfNumbers(5016496169496)


function countDown(n){
    for(var i = n; i > 0;i--){
        console.log(i)
    }
}
// countDown(5);

function printEvenNumber(n){
    var i = 1;
    while(i <= n){
        if(i % 2 == 0){
            console.log(i)
        }
        i++
    }
}
// printEvenNumber(10)


function countEvenOdd(n){
    let even = 0;
    let odd = 0;
    var i = 1;
    while(i <= n){
        if(i % 2 == 0){
            even = even + 1;
        }else{
            odd = odd + 1;
        }
        i++
    }
    console.log("Even: " , even)
    console.log("Odd: " , odd)
}


// countEvenOdd(10)

var findLargest = (arr) =>{
    var largest = arr[0]
    for(var i = 1; i < arr.length;i++){
        if(arr[i] > largest){
            largest = arr[i]
        }
    }
    console.log("Largest: " , largest)
}

// var arr = [1,2,3,4,5];
// findLargest(arr)

var printPositiveNumber = (arr) =>{
    console.log("Positive Number: ")
    for(var i = 0; i < arr.length;i++){
        if(arr[i] > 0){
            console.log(arr[i])
        }
    }
}
// var arr = [1,-2,3,-4,5];
// printPositiveNumber(arr)

var checkNumber = (num) =>{
    if(num == 0){
        console.log("0")
    }else if(num > 0){
        console.log("Positive")
    }else{
        console.log("Negative")
    }
}
// checkNumber(-2)


var reverseNumber = (num) => {
    let newNumber = 0;
    while (num > 0) {
        newNumber = newNumber * 10 + (num % 10);
        num = Math.floor(num / 10); 
    }
    console.log(newNumber);
}

// reverseNumber(512); 


var factorial = (num) =>{
    let fact = 1;
    while(num > 0){
        fact = fact * num;
        num = num - 1;
    }
    console.log(fact)
}
// factorial(5)


var isPrime = (num) =>{
    let i = 2;
    while(i <= num / 2){
        if(num % i == 0){
            console.log("Not a prime number")
            return
        }
        i = i + 1;
    }
    console.log("Is a prime number ")
}
// isPrime(10)


var countDigit = (num) => {
    let count = 0;
    while(num > 0){
        count++;
        num = Math.floor(num / 10);
    }
    console.log(count);
}
// countDigit(1234);


var sumOfEvenDigits = (num) =>{
    let sum = 0;
    while(num > 0){
        var digit = num % 10;
        if(digit % 2 == 0){
            sum = sum + digit;
        }
        num = Math.floor(num / 10)
    }
    console.log(sum)
}
// sumOfEvenDigits(1234)


function printPattern(n){
    for(var i = 1; i <= n; i++){
        var str = ""
        for(var j = 1; j <= i; j++){
            str = str + "*"
        }
        console.log(str)
    }
}
// printPattern(3)

function factorialWithRecurrsion(num){
    if(num == 0 || num == 1){
        return 1
    }
    return (num * factorialWithRecurrsion(num - 1))
}
// console.log(factorialWithRecurrsion(5))





// Programación FUNCIONAL

// función primer orden
function sum(a,b){
    return a+b;
}

let res = sum(1,2);
console.log(res);

const fSum = sum;
res = fSum(5,6);
console.log(res);

// función orden superior
function operation(fn, a, b){
    console.log("se hace algo");
    console.log(fn(a,b));
}

operation(sum, 10,20);

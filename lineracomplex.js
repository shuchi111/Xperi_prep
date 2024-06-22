const calcFactorial = (n) => {
    let factorial = 1;
    for (let i = 2; i <= n; i++) {
    factorial = factorial * i;
    }
    return factorial;
   };
   console.log(calcFactorial(5)); // 120
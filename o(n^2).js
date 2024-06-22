const matchElements = (array) => {
    for (let i = 0; i < array.length; i++) {
    for (let j = 0; j < array.length; j++) {
    if (i !== j && array[i] === array[j]) {
    return `Match found at ${i} and ${j}`;
    }
    }
    }
    return "No matches found "; 
   };
   const fruit = [" ", " ", " ", " ", " ", " ", " ", " ", " ", " "]; 
   console.log(matchElements(fruit));
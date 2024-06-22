const binarySearch = (array, target) => {
    let firstIndex = 0;
    let lastIndex = array.length - 1;
    while (firstIndex <= lastIndex) {
    let middleIndex = Math.floor((firstIndex + lastIndex) / 2);
    if (array[middleIndex] === target) {
    return middleIndex;
    }
    if (array[middleIndex] > target) {
    lastIndex = middleIndex - 1;
    } else {
    firstIndex = middleIndex + 1;
    }
    }
    return -1;
   };
   let score = [12, 22, 45, 67, 96];
   console.log(binarySearch(score, 96)); 
   // output is 4
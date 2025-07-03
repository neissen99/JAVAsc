// String Manipulation Functions

// 1. Reverse a String
function reverseString(str) {
  return str.split('').reverse().join('');
}
console.log(reverseString("hello"));


// 2. Count Characters
function countCharacters(str) {
  return str.length;
}
console.log(countCharacters("hello"));


// 3. Capitalize Words
function capitalizeWords(sentence) {
  return sentence
    .split(' ')
    .map(word => word.charAt(0).toUpperCase() + word.slice(1))
    .join(' ');
}
console.log(capitalizeWords("hello world")); 

// Array Functions

// 4. Find Maximum in Array
function findMax(arr) {
  return Math.max(...arr);
}
console.log(findMax([1, 3, 5, 7, 9])); 

// 5. Find Minimum in Array
function findMin(arr) {
  return Math.min(...arr);
}
console.log(findMin([1, 3, 5, 7, 9])); 

// 6. Sum of Array
function sumArray(arr) {
  return arr.reduce((acc, val) => acc + val, 0);
}
console.log(sumArray([1, 2, 3, 4])); 

// 7. Filter Array (e.g., filter out numbers less than a threshold)
function filterArray(arr, conditionFn) {
  return arr.filter(conditionFn);
}
console.log(filterArray([1, 2, 3, 4, 5], num => num > 3));
// Mathematical Functions

// 8. Factorial
function factorial(n) {
  if (n < 0) return undefined; // factorial not defined for negative numbers
  if (n === 0 || n === 1) return 1;
  let result = 1;
  for (let i = 2; i <= n; i++) {
    result *= i;
  }
  return result;
}
console.log(factorial(5));

// 9. Prime Number Check
function isPrime(n) {
  if (n <= 1) return false;
  if (n <= 3) return true;
  if (n % 2 === 0 || n % 3 === 0) return false;
  for (let i = 5; i * i <= n; i += 6) {
    if (n % i === 0 || n % (i + 2) === 0) return false;
  }
  return true;
}
console.log(isPrime(17)); 
console.log(isPrime(18));
// 10. Fibonacci Sequence up to n terms
function generateFibonacci(n) {
  const sequence = [];
  if (n <= 0) return sequence;
  let a = 0, b = 1;
  for (let i = 0; i < n; i++) {
    sequence.push(a);
    [a, b] = [b, a + b];
  }
  return sequence;
}



console.log(generateFibonacci(10));
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
// Divide the input into lines
var lines = input.split('\n');

let a = parseInt(lines[0]);
let b = parseInt(lines[1]);

let rest = a % b;

console.log(rest);
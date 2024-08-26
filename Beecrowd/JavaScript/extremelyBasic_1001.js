var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


const [A, B] = lines.map(Number);
const X = A + B;

console.log('X =', X);
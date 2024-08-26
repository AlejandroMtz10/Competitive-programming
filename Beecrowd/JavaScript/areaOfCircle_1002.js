var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

const radius = parseFloat(input);

const pi = 3.14159;
const area = pi * Math.pow(radius, 2);

console.log(`A=${area.toFixed(4)}`);
const queryString = window.location.search;
//alert(queryString);

const urlParams = new URLSearchParams(queryString);
const product = urlParams.get('product')
console.log(product);
// shirt

const color = urlParams.get('color')
console.log(color);
// blue

const newUser = urlParams.get('newuser')
console.log(newUser);

f =()=> queryString;
f();
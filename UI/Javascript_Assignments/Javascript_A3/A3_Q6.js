var obj= "var p1={ firstName: 'Bhargavi', lastName: 'Kavalanekar' };";

eval(obj);

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="K";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "S";

console.log(p1.middleName);
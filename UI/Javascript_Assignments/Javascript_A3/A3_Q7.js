var obj= { "firstName": "Bhargavi", "lastName": "Kavalanekar" };

var p1= JSON.parse(JSON.stringify(obj));

console.log(p1.firstName+" "+p1.lastName);

p1.lastName="Kavalanekar";

console.log(p1.firstName+" "+p1.lastName);

console.log(p1.middleName);

p1.middleName= "Sameep";

console.log(p1.middleName);
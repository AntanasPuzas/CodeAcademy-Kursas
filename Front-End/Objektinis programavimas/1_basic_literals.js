// let str1 = "Hello World!";
// console.log(typeof(str1));

// let str2 = new String("Hello World!");
// console.log(typeof(str2));
// console.log(str2);

let book = {
    title: "Book one",
    author: "John Smith",
    year: "2001",
    getSummary: () => {
        console.log(book.title + " " + book.author + " " + book.year);
    }
}

console.log(book.getSummary());
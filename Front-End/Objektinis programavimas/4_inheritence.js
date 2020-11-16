function Book(title, author, year) {
    this.title = title;
    this.author = author;
    this.year = year;
}

Book.prototype.getSummary = function() {
    let date = new Date().getFullYear();
    let bookAge = date - this.year;
    return `${this.title} was written by ${this.author}, ${bookAge} years ago.`;
}

let book = new Book("Book one", "John Smith", 2012);
console.log(book);

function Magazine(title, author, year, month) {
    Book.call(this, title, author, year);
    this.month = month;
}

Magazine.prototype = Object.create(Book.prototype);

let magazine = new Magazine("Magazine one", "Jenny Smith", 2019, "October");
console.log(magazine.getSummary());
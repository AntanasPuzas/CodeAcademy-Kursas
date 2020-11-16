class Book {
    constructor(title, author, year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    getSummary() {
        let date = new Date().getFullYear();
        let bookAge = date - this.year;
        return `${this.title} was written by ${this.author}, ${bookAge} years ago.`;
    }
}

let book = new Book("Book one", "John Smith", 2020);
console.log(book);

class Magazine extends Book {
    constructor(title, author, year, month) {
        super(title, author, year);
        this.month = month;
    }
}

let magazine = new Magazine("Magazine one", "Jane Smith", 1209);
console.log(magazine.getSummary());
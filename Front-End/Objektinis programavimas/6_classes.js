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
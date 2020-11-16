let Book = {
    getSummary: function() {
        let date = new Date().getFullYear();
        let bookAge = date - this.year;
        return `${this.title} was written by ${this.author}, ${bookAge} years ago.`;
    }
}

let book1 = Object.create(Book);
book1.title = "Book one";
book1.author = "John Smith";
book1.year = 2021;

console.log(book1);
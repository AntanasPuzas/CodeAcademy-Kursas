function Book(title, author, year) {
    this.title = title;
    this.author = author;
    this.year = year;
    this.getSummary = () => {
        let date = new Date().getFullYear();
        let bookAge = date - this.year;
        return `${this.title} was written by ${this.author}, ${bookAge} years ago.`;
    }
}

let book = new Book("Book one", "John Smith", 2012);

console.log(book.name);
console.log(book.getSummary());
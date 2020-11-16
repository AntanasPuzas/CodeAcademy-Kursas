class Movie {
    constructor(title, year, director) {
        this.title = title;
        this.year = year;
        this.director = director;
    }

    getIntroduction() {
        return `${this.title}, ${this.year}, ${this.director}.`
    }
}

class TV_Show extends Movie {
    constructor(title, year, director, numberOfSeasons) {
        super(title, year, director);
        this.numberOfSeasons = numberOfSeasons;
    }
    get() {
        return this.numberOfSeasons > 10 ? `serialas turėjo 10 ir daugiau sezonų` : "serialas turėjo mažiau nei 10 sezonų"
    }
}

let movie = new Movie("Movie1", 1990, "John Smith");
let tv_show_1 = new TV_Show("TVShow1", 1999, "Jane Doe", 6);
let tv_show_2 = new TV_Show("TVShow2", 1798, "Jane Austen", 15);

console.log(movie.getIntroduction());
console.log(tv_show_1.get());
console.log(tv_show_2.get());
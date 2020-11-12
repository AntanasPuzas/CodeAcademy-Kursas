laugh = (input) => {
    let laughString = "";
    for (i = 0; i < input; i++) {
        laughString += "ha";
    }
    laughString += "!";
    return laughString;
}

getHighestNumber = (...args) => Math.max(...args)

getLowestNumber = (...args) => Math.min(...args)

golfGame = (par, strokes) => {
    if (strokes === 1) {
        return "Hole-in-one!";
    } else if (strokes <= par - 2) {
        return "Eagle";
    } else if (strokes === par - 1) {
        return "Birdie";
    } else if (strokes === par) {
        return "Par";
    } else if (strokes === par + 1) {
        return "Bogey";
    } else if (strokes === par + 2) {
        return "Double Bogey"
    } else if (strokes >= par + 3) {
        return "Go Home!";
    }
}

checkNumber = (number) => {
    if (number % 3 === 0 && number % 5 === 0) {
        return "Skaičius dalijasi ir iš 3 ir iš 5";
    }
    if (number % 3 > 0 && number % 5 > 0) {
        return "Skaičius nesidalija nei iš 3 nei iš 5";
    }
    if (number % 3 === 0) {
        return "Skaičius dalijasi iš 3";
    }
    if (number % 5 === 0) {
        return "Skaičius dalijasi iš 5";
    }
}

whileToFor = () => {
    for (i = 9; i >= 1; i--) {
        console.log("hello " + i);
    }
}

forFixed = () => {
    for (x = 0; x < 10; x++) {
        console.log(x);
    }
}

forFixed2 = () => {
    for (var k = 0; k < 20; k++) {
        console.log(k);
    }
}
task_A = (numbers) => Math.max(...numbers)

task_B = (numbers) => alert(numbers.sort())

task_C = (numbers, even) => {
    const filteredNumbers = [];
    for (i = 0; i < numbers.length; i++) {
        if (even === true && numbers[i] % 2 === 0) {
            filteredNumbers.push(numbers[i]);
        } else if (even === false && numbers[i] % 2 > 0) {
            filteredNumbers.push(numbers[i]);
        }
    }
    return filteredNumbers;
}

task_D = () => {
    for (i = 0; i <= 5; i++) {
        console.log("* ".repeat(i));
    }
}

task_E = () => {
    for (i = 0; i <= 5; i++) {
        console.log("* ".repeat(i));
        if (i === 5) {
            for (j = i - 1; j >= 1; j--) {
                console.log("* ".repeat(j));
            }
        }
    }
}

task_F = (date) => date && Object.prototype.toString.call(date) === "[object Date]";

task_G = (date) => date.toLocaleString('default', {month: 'long'});

// Parašyti funkciją, kuri paskaičiuos kiek dienų praėjo nuo metų pradžios
task_H = (date) => {
    const yearStartDate = new Date(date.getFullYear(), 0, 1);
    const day = 1000 * 60 * 60 * 24;

    return ((date.getTime() - yearStartDate.getTime()) / day) + 1;
}

// Parašyti funkciją, kuri paskaičiuos kiek žmogui metų įvedus jo gimimo metus
task_I = (date) => {
    const ageDifferenceMiliseconds = Date.now() - date.getTime();
    const ageDate = new Date(ageDifferenceMiliseconds);

    return Math.abs(ageDate.getFullYear() - 1970);
}

// Parašyti funkciją, kuri paskaičiuos metų skirtumą tarp dviejų datų
task_J = (date1, date2) => Math.abs(date1.getFullYear() - date2.getFullYear());

// Parašyti funkciją kuri atvaizduos objekto atributus.
task_K = (input) => {
    let inputAttributeNameString = "";
    const inputAttributNameArray = Object.keys(input);
    for (i = 0; i < inputAttributNameArray.length; i++) {
        inputAttributeNameString += inputAttributNameArray[i] + ",";
    }
    return inputAttributeNameString.substring(0, inputAttributeNameString.length - 1);
}

// Parašyti funkciją, kuri panaikins duplikatus iš duodamo array
task_L = (input) => {
    let output = input;
    for (i = 0; i < output.length; i++) {
        value = output[i];
        for (j = i + 1; j < output.length; j++) {
            if (value === output[j]) {
                output.splice(output[j], 1);
                i--;
            }
        }
    }
    return output;
}

task_M = () => {
    const json = `{
        "items": {
            "item": [{
                    "id": "0001",
                    "type": "donut",
                    "name": "Donut",
                    "ppu": 0.55,
                    "batters": {
                        "batter": [{
                                "id": "1001",
                                "type": "Regular"
                            },
                            {
                                "id": "1002",
                                "type": "Chocolate"
                            },
                            {
                                "id": "1003",
                                "type": "Blueberry"
                            },
                            {
                                "id": "1004",
                                "type": "Devil's Food"
                            }
                        ]
                    },
                    "topping": [{
                            "id": "5001",
                            "type": "None"
                        },
                        {
                            "id": "5002",
                            "type": "Glazed"
                        },
                        {
                            "id": "5005",
                            "type": "Sugar"
                        },
                        {
                            "id": "5007",
                            "type": "Powdered Sugar"
                        }
                    ]
                },
                {
                    "id": "0002",
                    "type": "cake",
                    "name": "Cake",
                    "ppu": 0.45,
                    "batters": {
                        "batter": [{
                                "id": "1001",
                                "type": "Regular"
                            },
                            {
                                "id": "1002",
                                "type": "Cheese"
                            }
                        ]
                    },
                    "topping": [{
                            "id": "6001",
                            "type": "None"
                        },
                        {
                            "id": "6002",
                            "type": "Powdered"
                        },
                        {
                            "id": "6005",
                            "type": "Strawberry"
                        }
                    ]
                }
            ]
        }
    }`

    return JSON.parse(json);
}

task_E1 = (jsonInput) => {
    itemNameArray = [];
    for (i = 0; i < jsonInput.items.item.length; i++) {
        itemNameArray.push(jsonInput.items.item[i].name);
    }
    return itemNameArray;
}

task_E2 = (jsonInput) => {
    itemToppingArray = [];
    for (i = 0; i < jsonInput.items.item.length; i++) {
        for (j = 0; j < jsonInput.items.item[i].topping.length; j++) {
            itemToppingArray.push(jsonInput.items.item[i].topping[j].type);
        }
    }
    return [...new Set(itemToppingArray)];
}

task_E3 = (jsonInput) => {
    let items = new Map();
    let itemName = "";
    let batterMap = new Map();
    let batterName = "";
    let toppings = [];
    for (i = 0; i < jsonInput.items.item.length; i++) {
        itemName = jsonInput.items.item[i].name;
        for (j = 0; j < jsonInput.items.item[i].batters.batter.length; j++) {
            batterName = jsonInput.items.item[i].batters.batter[j].type;
            for (k = 0; k < jsonInput.items.item[i].topping.length; k++) {
                toppings.push(jsonInput.items.item[i].topping[k].type)
            }
        }
        batterMap.set(batterName, toppings);
        items.set(itemName, batterMap);
        toppings = [];
    }
    console.log(items);
}

topping_test = (jsonInput) => {
    let toppings = [];
    for (i = 0; i < jsonInput.items.item.length; i++) {
        for (k = 0; k < jsonInput.items.item[i].topping.length; k++) {
            toppings.push(jsonInput.items.item[i].topping[k].type)
        }
        console.log(toppings);
        toppings = [];
    }
}

batter_test = (jsonInput) => {
    batters = [];
    for (i = 0; i < jsonInput.items.item.length; i++) {
        itemName = jsonInput.items.item[i].name;
        for (j = 0; j < jsonInput.items.item[i].batters.batter.length; j++) {
                batters.push(jsonInput.items.item[i].batters.batter[j].type);
        }
        console.log(batters);
        batters = [];
    }
    console.log(jsonInput.items.item[0].batters);
    console.log(jsonInput.items.item[0].batters.batter[0].type);
    console.log(jsonInput.items.item[0].batters.batter.length);
}
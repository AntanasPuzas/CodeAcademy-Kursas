const background = document.querySelector("#wrapper");
const boxes = document.querySelectorAll("div.box");
const boxColors = [];
for (let i = 0; i < boxes.length; i++) {
    boxColors.push(getComputedStyle(boxes[i]).backgroundColor);
}

box1.addEventListener("click", () => {
    background.style.backgroundColor = boxColors[0];
})

box2.addEventListener("contextmenu", () => {
    background.style.backgroundColor = boxColors[1];
})

box3.addEventListener("mouseover", () => {
    background.style.backgroundColor = boxColors[2];
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyK") {
        background.style.backgroundColor = boxColors[3];
    }
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyA") {
        background.style.backgroundColor = boxColors[4];
    }
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyV") {
        background.style.backgroundColor = boxColors[5];
    }
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyT") {
        background.style.backgroundColor = boxColors[6];
    }
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyS") {
        background.style.backgroundColor = boxColors[7];
    }
})

document.addEventListener("keydown", (e) => {
    if (e.code === "KeyD") {
        background.style.backgroundColor = boxColors[8];
    }
})
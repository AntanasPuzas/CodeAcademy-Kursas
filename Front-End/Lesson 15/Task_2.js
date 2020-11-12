calculateResult = () => {
    let number1 = +document.getElementById("number1").value;
    let number2 = +document.getElementById("number2").value;

    document.getElementById("result").innerHTML = number1 + number2;
}

document.getElementById("plus").addEventListener("click", calculateResult)

document.getElementById("number1").addEventListener("keyup", calculateResult)

document.getElementById("number2").addEventListener("keyup", calculateResult)
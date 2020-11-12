document.getElementById("tableForm").addEventListener("submit", (e) => {
    e.preventDefault();
});

document.getElementById("submit").addEventListener("click", () => {
    handleSubmit();
});

const handleSubmit = () => {
    let formElements = document.getElementById("tableForm").elements;
    let status = document.getElementById("status")
    if (formElements.name.value === "") {
        status.className = "error-message";
        status.textContent = "Vardas yra privalomas!";
    } else if (formElements.surname.value === "") {
        status.className = "error-message";
        status.textContent = "Pavarde yra privaloma!";
    } else if (formElements.age.value === "") {
        status.className = "error-message";
        status.textContent = "Amzius yra privalomas!";
    } else {
        let table = document.getElementById("table");

        let row = table.insertRow(1);

        let nameCell = row.insertCell(0);
        let surnameCell = row.insertCell(1);
        let ageCell = row.insertCell(2);

        let name = document.getElementById("name").value;
        let surname = document.getElementById("surname").value;
        let age = document.getElementById("age").value

        nameCell.innerHTML = name;
        surnameCell.innerHTML = surname;
        ageCell.innerHTML = age;

        document.getElementById("status").className = "success-message";
        document.getElementById("status").textContent = "Irasas " + name + " " + surname + " su amziumi " + age +
            " pridetas sekmingai!";
    }
}
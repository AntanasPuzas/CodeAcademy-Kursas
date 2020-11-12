let tableForm;
let formElements;

if (document.body.contains(document.getElementById("tableForm"))) {
    tableForm = document.getElementById("tableForm")
    formElements = tableForm.elements;
}

if (tableForm) {
    tableForm.addEventListener("submit", (e) => {
        e.preventDefault();
    });
}

const submit = document.getElementById("submit");
if (submit) {
    submit.addEventListener("click", () => {
        handleSubmit();
    });
}

const update = document.getElementById("update");
if (update) {
    update.addEventListener("click", () => {
        handleUpdate();
    });
}

const status = document.getElementById("status")
const API_sumbission_status = document.getElementById("API-submission-status")
const likedEmployeeId = [];
sessionStorage.setItem("liked-employee-id", likedEmployeeId);

const toggleLoader = () => {
    const loader = document.getElementById("spinner");
    loader.className === "loader" ? loader.className = "hidden" : loader.className = "loader";
}

const fetchUsers = () => {
    toggleLoader();
    status.className = "hidden";
    axios.get('http://dummy.restapiexample.com/api/v1/employees')
        .then(response => {
            const employees = response.data;
            console.log(employees);

            for (employee in employees.data) {
                const fullName = employees.data[employee].employee_name.split(" ");
                const id = employees.data[employee].id;
                const age = employees.data[employee].employee_age;
                const salary = employees.data[employee].employee_salary;

                sessionStorage.setItem(id, salary);

                insertRow(fullName[0], fullName[1], age, id, -1);
            }
        })
        .catch((error) => {
            status.className = "error-message";
            status.textContent = error;
        })
        .then(() => {
            toggleLoader();
        });
}

const handleSubmit = () => {
    status.className = "error-message";
    if (!submitErrorChecking(formElements)) {
        return;
    } else {
        const name = formElements.name.value;
        const surname = formElements.surname.value;
        const age = formElements.age.value
        const id = document.getElementById("table").rows.length;

        const rowInsertPosition = 1;

        postUser(name, surname, age, id, rowInsertPosition);
    }
}

const submitErrorChecking = (formElements) => {
    let noErrors = false;
    if (formElements.name.value === "") {
        status.textContent = "Vardas yra privalomas!";
    } else if (formElements.surname.value === "") {
        status.textContent = "Pavarde yra privaloma!";
    } else if (formElements.age.value === "") {
        status.textContent = "Amzius yra privalomas!";
    } else {
        noErrors = true;
    }
    return noErrors;
}

const postUser = (name, surname, age, id, tablePlace) => {
    const user = {
        id: id,
        employee_name: name + " " + surname,
        employee_age: age
    };

    toggleLoader();
    status.className = "hidden";
    API_sumbission_status.className = "hidden";
    axios.post('http://dummy.restapiexample.com/api/v1/create', JSON.stringify(user))
        .then((response) => {
            if (response.status === 200) {
                API_sumbission_status.className = "success-message";
                API_sumbission_status.textContent = "Vartotojas sekmingai pridetas prie API!";
                insertRow(name, surname, age, id, tablePlace);

                status.className = "success-message";
                status.textContent = "Irasas " + name + " " + surname + " su amziumi " + age +
                    " pridetas sekmingai!";
            }
        })
        .catch((error) => {
            API_sumbission_status.className = "error-message";
            API_sumbission_status.textContent = error;

            status.className = "hidden";
        })
        .then(() => {
            toggleLoader();
        });
}

const insertRow = (name, surname, age, id, tablePlace) => {
    const table = document.getElementById("table");

    const row = table.insertRow(tablePlace);
    row.id = id;

    const likeCell = row.insertCell(0);
    const nameCell = row.insertCell(1);
    const surnameCell = row.insertCell(2);
    const ageCell = row.insertCell(3);
    const deleteCell = row.insertCell(4);
    const editCell = row.insertCell(5);
    const showMoreCell = row.insertCell(6);

    nameCell.innerHTML = name;
    surnameCell.innerHTML = surname;
    ageCell.innerHTML = age;

    const deleteButtonId = 'delete-btn-' + id;
    const editButtonId = 'edit-btn-' + id;
    const showMoreButtonId = 'show-more-btn-' + id;
    const likeCellId = 'like-cell-' + id;

    deleteCell.innerHTML = "<input type='button' id=" + deleteButtonId + " value='X'></input>";
    editCell.innerHTML = "<input type='button' id=" + editButtonId + " value='Koreguoti'></input>"
    showMoreCell.innerHTML ="<input type='button' id=" + showMoreButtonId + " value='Rodyti Daugiau'></input>"
    likeCell.id = likeCellId;

    attachDeleteHandlers(deleteButtonId, id);
    attachEditHandlers(editButtonId, id);
    attachShowMoreHandlers(showMoreButtonId, id);
    attachLikeHandlers(likeCellId, id);
}

const handleUpdate = () => {
    status.className = "error-message";
    if (!submitErrorChecking(formElements)) {
        return;
    } else {
        const name = formElements.name.value;
        const surname = formElements.surname.value;
        const age = formElements.age.value;
        const id = sessionStorage.getItem("editing_employee_id");

        putUser(name, surname, age, id);
    }
}

const attachEditHandlers = (editButtonId, rowId) => {
    document.getElementById(editButtonId).addEventListener("click", () => {
        const row = document.getElementById(rowId);
        formElements.name.value = row.cells[1].innerHTML;
        formElements.surname.value = row.cells[2].innerHTML;
        formElements.age.value = row.cells[3].innerHTML;
        sessionStorage.setItem("editing_employee_id", rowId);
    });
}

const putUser = (name, surname, age, id) => {
    const user = {
        employee_name: name + " " + surname,
        employe_age: age
    }
    toggleLoader();
    status.className = "hidden";
    axios.put(`http://dummy.restapiexample.com/api/v1/update/${id}`, JSON.stringify(user))
        .then((response) => {
            if (response.status === 200) {
                API_sumbission_status.className = "success-message";
                API_sumbission_status.textContent = "Vartotojas sekmingai atnaujintas API!";

                editRow(name, surname, age, id);

                status.className = "success-message";
                status.textContent = "Irasas " + name + " " + surname + " su amziumi " + age +
                    " atnaujintas sekmingai!";
            }
        })
        .catch((error) => {
            API_sumbission_status.className = "error-message";
            API_sumbission_status.textContent = error;

            status.className = "hidden";
        })
        .then(() => {
            toggleLoader();
        })
}

const editRow = (name, surname, age, id) => {
    const row = document.getElementById(id);
    row.cells[1].innerHTML = name;
    row.cells[2].innerHTML = surname;
    row.cells[3].innerHTML = age;
}

const attachDeleteHandlers = (deleteButtonId, rowId) => {
    document.getElementById(deleteButtonId).addEventListener("click", () => {
        deleteEmployee(rowId);
    });
}

const deleteEmployee = (id) => {
    toggleLoader();
    API_sumbission_status.className = "hidden";
    axios.delete(`http://dummy.restapiexample.com/public/api/v1/delete/${id}`)
        .then((response) => {
            if (response.status === 200) {
                API_sumbission_status.className = "success-message";
                API_sumbission_status.textContent = "Vartotojas sekmingai istrintas is API!";

                const row = document.getElementById(id);
                row.parentNode.removeChild(row);
            }
        })
        .catch((error) => {
            API_sumbission_status.className = "error-message";
            API_sumbission_status.textContent = error;
        })
        .then(() => {
            toggleLoader();
        })
}

const attachShowMoreHandlers = (showMoreButtonId, rowId) => {
    document.getElementById(showMoreButtonId).addEventListener("click", () => {
        showProfile(rowId);
    });
}

const showProfile = (rowId) => {
    window.location.href = "Profile_Page.html";
    const row = document.getElementById(rowId);
    sessionStorage.setItem("profile_name", row.cells[1].innerHTML);
    sessionStorage.setItem("profile_surname", row.cells[2].innerHTML);
    sessionStorage.setItem("profile_age", row.cells[3].innerHTML);
    sessionStorage.setItem("profile_salary", sessionStorage.getItem(rowId));
}

const populateProfilePage = () => {
    document.getElementById("name").textContent = "Vardas: " + sessionStorage.getItem("profile_name");
    document.getElementById("surname").textContent = "Pavarde: " + sessionStorage.getItem("profile_surname");
    document.getElementById("age").textContent = "Amzius: " + sessionStorage.getItem("profile_age");
    document.getElementById("salary").textContent = "Atlyginimas: " + sessionStorage.getItem("profile_salary");
}

attachLikeHandlers = (likeCellId, rowId) => {
    const likeCell = document.getElementById(likeCellId);
    likeCell.addEventListener("click", () => {
        if (likeCell.innerHTML === "♥") {
            likeCell.innerHTML = "";
            likedEmployeeId.splice(likedEmployeeId.indexOf("rowId"), 1);
            sessionStorage.setItem("liked-employee-id", likedEmployeeId)
        } else {
            likeCell.innerHTML = "♥";
            likedEmployeeId.push(rowId);
            sessionStorage.setItem("liked-employee-id", likedEmployeeId);
        }
    }) 
}

fetchUsers()
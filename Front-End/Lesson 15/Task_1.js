// 1_1
getPresidentNames = () => {
    axios.get('https://sampleapis.com/presidents/api/presidents')
        .then(response => {
            const presidents = response.data;
            console.log(presidents);

            let vicePresidents = [];
            for (president in presidents) {
                vicePresidents.push(presidents[president].vicePresidents)
            }
            console.log(vicePresidents);

            presidentsWithVicePresidents = new Map();
            for (president in presidents) {
                presidentsWithVicePresidents.set(presidents[president].name, presidents[president].vicePresidents);
            }
            console.log(presidentsWithVicePresidents);
        })
}

// 1_2
const user = {
    name: 'test',
    salary: '123',
    age: '23'
};

const userStringified = JSON.stringify(user);

axios.post('http://dummy.restapiexample.com/api/v1/create', userStringified)
    .then((response) => {
        if (response.status === 200) {
            //alert(response.data.id);
            console.log(response.data.id);
        }
        console.log(response);
    })
    .catch((error) => {
        console.log(error);
    });

// 1_3
const userUpdated = {
    name: 'test_2',
    salary: '321',
    age: '32'
};

const userUpdatedStringified = JSON.stringify(user);
axios.put('http://dummy.restapiexample.com/api/v1/update/id', userUpdatedStringified)
    .then((response) => {
        console.log(response)
    })
    .catch((error) => {
        console.log(error);
    });
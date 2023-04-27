const submit = document.querySelector('#submit')
const num = document.querySelector('#recipient-num');
const row = document.querySelector('#recipient-row');

const getQuety = async (num) => {

    let response = await fetch('http://localhost:8080/getformat/num/8');
    const data = await response.json();
    console.log(data);
}


submit.addEventListener('click',

    function (event) {
        //getQuety(num.value, row.value);
        getQuety();
        event.preventDefault();
    }

);
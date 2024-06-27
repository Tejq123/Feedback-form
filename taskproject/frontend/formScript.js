document.getElementById('feedback-form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting via the browser

    // Collect form data
    const formData = new FormData(this);

    // Convert FormData to JSON object
    console.log(formData);
    const jsonObject = {};
    formData.forEach((value, key) => {
        jsonObject[key] = value;
    });

    // Send POST request
    fetch('http://localhost:8080/api/feedback', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(jsonObject)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json(); // assuming server responds with JSON
    })
    .then(data => {
        console.log('Success:', data);
        // Handle success scenario (e.g., show a success message to the user)
    })
    .catch(error => {
        console.error('Error:', error);
        // Handle error scenario (e.g., show an error message to the user)
    });
});

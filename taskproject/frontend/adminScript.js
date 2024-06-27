function populateTable(data) {
    // Get a reference to the table
    var table = document.querySelector('table');

    // Iterate over each object in the data array
    data.forEach(function(obj) {
        // Create a new row
        var row = table.insertRow();

        // Create cells in the row for each property
        var nameCell = row.insertCell();
        var emailCell = row.insertCell();
        var ratingCell = row.insertCell();
        var commentsCell = row.insertCell();

        // Assign values to the cells
        nameCell.textContent = obj.name;
        emailCell.textContent = obj.email;
        ratingCell.textContent = obj.rating;
        commentsCell.textContent = obj.comments;
    });
}


window.onload = ()=>{
    fetch('http://localhost:8080/api/feedback')
    .then(response => response.json())
    .then(data => {
        // Process the data and create the table
        populateTable(data)
    })
    .catch(error => {
    console.error('Error fetching data:', error);
    });
}
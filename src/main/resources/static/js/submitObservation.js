const livingThing = document.getElementById("livingThingInput").value;
const description = document.getElementById("descriptionInput").value;


const submitObservation = () => {
    let place = document.getElementById("locationInput");

    let formData = {
        locationName: place.value
    };

    console.log(place.value);

    $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/add-location",
            data: JSON.stringify(formData),
            dataType: 'json'
        }
    )

    window.location = "/all-locations";
};








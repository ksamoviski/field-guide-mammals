



// season and habitat are already created in observationDropdowns.js


const submitObservation = () => {
    let livingThing = document.getElementById("livingThingInput");
    let description = document.getElementById("descriptionInput");
    let place = document.getElementById("locationInput");

    let formData = {
        livingThing: livingThing.value,
        locationName: place.value,
        season: chosenSeason.innerText,
        description: description.value,
        habitats: chosenHabitats
    };

    console.log(place.value);

    $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/add-observation",
            data: JSON.stringify(formData),
            dataType: 'json'
        }
    )


    window.location = "/all-locations";
};








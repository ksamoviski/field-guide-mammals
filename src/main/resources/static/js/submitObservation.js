// season and habitat variables are already created next door in observationDropdowns.js


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

const constraints = {audio: true, video: {width: 1280, height: 720}};

navigator.mediaDevices.getUserMedia(constraints)
    .then(function (mediaStream) {
        let video = document.querySelector('video');
        video.srcObject = mediaStream;
        video.onloadedmetadata = function (e) {
            video.play().then(r => console.log("thanks") );
        };
    })
    .catch(function (err) {
            console.log(err.name + " this didn't happen for you");
        }
    );










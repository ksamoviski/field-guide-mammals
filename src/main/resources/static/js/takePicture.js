let takePicture = document.getElementById("take-picture");

takePicture.onchange = function (event) {
    let files = event.target.files,
        file;
    if (files && files.length > 0) {
        file = files[0];
    }


    let showPicture = document.getElementById("show-picture");

    showPicture.src = window.URL.createObjectURL(file);
};

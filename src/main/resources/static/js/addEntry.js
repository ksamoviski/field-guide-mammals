const profilePetDropDownButton = document.getElementById('pet__dropdown');
const reasonChoice = document.getElementById('reasons__dropdown');
const hypoAllergenic = document.getElementById('Hypoallergenic');
const goodWithKids = document.getElementById('Good-with-kids');


profilePetDropDownButton.addEventListener("click", function () {
    if (profilePetDropDownButton.selectedIndex === 1){
        profilePetDropDownButton.value = "Dog";
    } else if (profilePetDropDownButton.selectedIndex === 2) {
        profilePetDropDownButton.value = "Cat";
    } else if (profilePetDropDownButton.selectedIndex === 3) {
        profilePetDropDownButton.value = "Rabbit";
    } else if (profilePetDropDownButton.selectedIndex === 4) {
        profilePetDropDownButton.value = "Mini Horse";
    } else if (profilePetDropDownButton.selectedIndex === 5) {
        profilePetDropDownButton.value = "Lizard";
    }
});

reasonChoice.addEventListener("click", function () {
    if (reasonChoice.selectedIndex === 1){
        reasonChoice.value = "For Play";
    } else if (reasonChoice.selectedIndex === 2) {
        reasonChoice.value = "For Companionship";
    } else if (reasonChoice.selectedIndex === 3) {
        reasonChoice.value = "For Therapy";
    }
});

hypoAllergenic.addEventListener("click", function (){
    hypoAllergenic.value = "true";
})

goodWithKids.addEventListener("click", function (){
    goodWithKids.value = "true";
})







$(function () {
    $("#firstName, #lastName").bind("change keyup",
        function () {
            if ($("#firstName").val() && $("#lastName").val()
                && $("#age").val() && $("#email").val() && $("#location").val()
                && $("#reasons__dropdown").val() !== "")

                $(this).closest("form").find(":submit").removeAttr("disabled");
            else
                $(this).closest("form").find(":submit").attr("disabled", "disabled");
        });
});

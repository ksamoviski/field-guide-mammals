const seasonButton = document.getElementById("seasonsButton");
const seasonsDropdown = document.getElementById("seasonsDropdown");

const habitatButton = document.getElementById("habitatButton");
const habitatDropdown = document.getElementById("habitatDropdown");


let seasonsClicked = false;
let habitatsClicked = false;

const seasons = ["Winter", "Spring", "Summer", "Autumn"];
const habitats = ["Wetlands", "Forest", "My Backyard", "My Driveway", "Archer's Backyard", "The Park"];

// const menus = [seasons, habitats];


const removeMenu = (menu) => {
    if (menu === "seasons") {
        for (let items = 0; items < seasons.length; items++) {
            seasonsDropdown.removeChild(seasonsDropdown.lastChild);
        }
        seasonsClicked = false;
    } else {
        for (let items = 0; items < habitats.length; items++) {
            habitatDropdown.removeChild(habitatDropdown.lastChild);
        }
        habitatsClicked = false;
    }
};

const addMenu = (menu) => {
    if (menu === "seasons") {
        seasons.forEach(season => {
            let item = document.createElement('p');
            item.className = "dropdownItem";
            item.innerText = season;
            seasonsDropdown.appendChild(item);
        });
        seasonsClicked = true;
    } else {
        habitats.forEach(habitat => {
            let item = document.createElement('p');
            item.className = "dropdownItem";
            item.innerText = habitat;
            habitatDropdown.appendChild(item);
        });
        habitatsClicked = true;
    }
};

seasonButton.addEventListener('click', () => {
    if (!seasonsClicked && !habitatsClicked){
        addMenu("seasons");
    } else if (!seasonsClicked && habitatsClicked) {
        addMenu("seasons");
        removeMenu("habitats");
    } else if (seasonsClicked === true) {
        removeMenu("seasons");
    }
});

habitatButton.addEventListener('click', () => {
    if (!habitatsClicked && !seasonsClicked) {
        addMenu("habitats");
    } else if (!habitatsClicked && seasonsClicked) {
        addMenu("habitats");
        removeMenu("seasons");
    } else if (habitatsClicked === true) {
        removeMenu("habitats");
    }
});






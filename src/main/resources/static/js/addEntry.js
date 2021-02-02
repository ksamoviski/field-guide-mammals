const seasonButton = document.getElementById("seasonsButton");
const seasonsDropdown = document.getElementById("seasonsDropdown");

const habitatButton = document.getElementById("habitatButton");
const habitatDropdown = document.getElementById("habitatDropdown");


let seasonClicked = false;
let habitatClicked = false;

const habitats = ["Wetlands", "Forest", "My Backyard", "My Driveway", "Archer's Backyard", "The Park"];
const seasons = ["Winter", "Spring", "Summer", "Autumn"];

seasonButton.addEventListener('click', () => {
        if (seasonClicked === false) {
            seasons.forEach(season => {
                let item = document.createElement('p');
                item.className = "dropdownItem";
                item.innerText = season;
                seasonsDropdown.appendChild(item);
            })
            seasonClicked = true;
        } else {
            for (let i = 0; i < seasons.length; i++) {
                seasonsDropdown.removeChild(seasonsDropdown.lastChild);
            }
            seasonClicked = false;
        }
    }
)

habitatButton.addEventListener('click', () => {
        if (habitatClicked === false) {
            habitats.forEach(habitat => {
                let itemClicked = false;

                let item = document.createElement('p');
                item.className = "dropdownItem";
                item.innerText = habitat;
                habitatDropdown.appendChild(item);

                item.addEventListener('mouseover', () => {
                    // item.classList.add("habitatItemHover");

                    item.style.color = "darkred";
                });

                item.addEventListener('mouseout', () => {
                    item.classList.remove("habitatItemHover");

                })
                item.addEventListener('click', () => {
                    if (itemClicked === false) {
                        // item.style.color = "chartreuse";
                        // item.style.fontSize = "140%";

                        setTimeout(finalItemShow, 300, item);
                        item.classList.add('shownItem');
                        itemClicked = true;

                    } else {
                        // item.style.color = "#ccc";
                        itemClicked = false;
                    }
                });
            });
            habitatClicked = true;
        } else {
            for (let i = 0; i < habitats.length; i++) {
                habitatDropdown.removeChild(habitatDropdown.lastChild);
            }
            habitatClicked = false;
        }
    }
);

function finalItemShow(item) {
    item.classList.remove('shownItem');
    // item.style.fontSize = "100%";
    item.style.color = "#808622";
};





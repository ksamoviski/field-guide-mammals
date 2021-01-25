const seasonDropdown = document.getElementById('seasonDropdown');
const habitatButton = document.getElementById('habitatButton');
const habitatDropdown = document.getElementById('habitatDropdown');
const dropDownHeader = document.querySelector('.dropDownHeader');

let clicked = false;
const habitats = ["Wetlands", "Forest", "My Backyard", "My Driveway", "Archer's Backyard", "The Park"];



habitatButton.addEventListener('click', () => {
        if (clicked === false) {
            habitats.forEach(habitat => {
                let itemClicked = false;
                let item = document.createElement('h4');
                item.className = "habitatItem";
                item.innerText = habitat;
                habitatDropdown.appendChild(item);

                item.addEventListener('mouseover', () => {
                    item.classList.add("habitatItemHover");
                });
                item.addEventListener('mouseout', () => {
                    item.classList.remove("habitatItemHover");

                })
                item.addEventListener('click', () => {
                    if (itemClicked === false) {
                        // item.style.color = "chartreuse";
                        // item.style.fontSize = "140%";
                        setTimeout(finalItemShow, 200, item);
                        item.classList.add('shownItem');
                        itemClicked = true;
                    } else {
                        // item.style.color = "#ccc";
                        itemClicked = false;
                    }
                });
            });
            clicked = true;
        } else {
            for (let i = 0; i < habitats.length; i++) {
                habitatDropdown.removeChild(habitatDropdown.lastChild);
            }
            clicked = false;
        }
    }
);

function finalItemShow(item) {
    item.classList.remove('shownItem');
    // item.style.fontSize = "100%";
    item.style.color = "#808622";
};





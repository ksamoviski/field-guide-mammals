const seasonDropdown = document.getElementById('seasonDropdown');
const habitatButton = document.getElementById('habitatButton');
const habitatDropdown = document.getElementById('habitatDropdown');
const dropDownHeader = document.querySelector('.dropDownHeader');

let clicked = false;
const habitats = ["Wetlands", "Forest", "My Backyard", "My Driveway", "Archer's Backyard", "The Park"];


habitatButton.addEventListener('click', () => {
        if (clicked === false) {
            habitats.forEach(habitat => {
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
                    item.style.color = "chartreuse";
                    item.style.fontSize = "140%";
                    setTimeout(finalItemShow, 200, item);
                    item.classList.add('shownItem');
                });
            });
            clicked = true;
        }
    }
);

function finalItemShow(item) {
    item.classList.remove('shownItem');
    item.style.fontSize = "100%";
    item.style.color = "darkblue";
};





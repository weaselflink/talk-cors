let current = 0;

const update = () => {
    document.querySelectorAll("section")
        .forEach((slide, index) => {
            if (index === current) {
                slide.style.display = "grid";
            } else {
                slide.style.display = "none";
            }
        });
};

const previous = () => {
    let count = document.querySelectorAll("section").length;
    current = Math.max(0, Math.min(current - 1, count - 1))
    update();
};

const next = () => {
    let count = document.querySelectorAll("section").length;
    current = Math.max(0, Math.min(current + 1, count - 1))
    update();
};

document.addEventListener("DOMContentLoaded", update);
document.addEventListener('keypress', (event) => {
    console.log(event.code)
    if (event.code === "Space") {
        next();
    }
    if (event.code === "Backspace") {
        previous();
    }
    if (event.code === "KeyA") {
        previous();
    }
    if (event.code === "KeyD") {
        next();
    }
});

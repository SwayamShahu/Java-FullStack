let display = document.querySelector(".result");
display.value = "0";

function appendValue(value) {
    if (display.value === "0" || display.value === "Invalid") {
        display.value = "";
    }
    display.value += value;
}

function clearValue() {
    display.value = "0";
}

function backspace() {
    display.value = display.value.slice(0, -1);
    if (display.value === "") {
        display.value = "0";
    }
}

function calculate() {
    try {
        display.value = eval(display.value);
    } catch (error) {
        display.value = "Invalid";
    }
}

// select all the buttons
const buttons = document.getElementsByTagName('button');

// select the display element 
const display = document.getElementsByClassName("display");

// add eventListener to each button
buttons.forEach(
    function(button){
        button.addEventListener('click',calculate);
    }
)

/*
    forEach loop will loop through each <button> element inside 
    buttons array and for each element, it activates the inner function.

    The inner function takes each button and attaches a 'click' 
    event listener. If it detects any 'click' event, then it calls 
    the calculate function.
*/

/* Calculate function */

function calculate(event){
    // current clicked buttons value
    const clickedButtonValue = event.target.value;

    if(clickedButtonValue == "="){
        // check if display is not empty then calculate and show answer
        if(display.value != "")
            display.value = eval(display.value);
    }
    else if(clickedButtonValue === "C")
        display.value ="";
    else{
        // concatenate it to display
        display.value += clickedButtonValue;
    }
}

/* 
    The calculate function automatically gets the event object as its 
    first argument. The event object is simple.
*/

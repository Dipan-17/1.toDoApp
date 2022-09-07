# proj1_toDoApp

Simple toDo application built with basic constraint layout, list view, and button

The function uses a horizontal linear layout as basic structure. A horizontal divider divides the top part containing the list of the tasks the user entered and the bottom part contains a edit text box(plain text) and two buttons, each for add and remove.

The top part of the app utilizes a list view inside a vertical linear layout to store the entered text. The app doesn't use local storage hence the data gets wiped after refresh.

The bottom part of the application contains a text box to take input the string to input or remove and two buttons add and remove to do so. The input from the text box is taken as string and if not empty is input into the string if the add button is pressed. If an input is given and remove button is pressed, a loop runs from i=0 to list.size() scanning if there exists any instance of the given string. If it does, it removes the first occurence of it.

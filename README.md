# Milestone-2-cst239
StoreFront Application – Milestone 2
Overview
This project implements a console‑based Store Front application for a game environment.
The application allows a user to browse items, purchase items, cancel purchases, and view their shopping cart.
All functionality is based on the UML class diagrams and flowchart created for Milestone 2.

Features Implemented
✔ Welcome Message
The program displays the Store Front name and a welcome message when it starts.

✔ Menu System
The user is shown a list of actions:

View Products

Purchase Product

Cancel Purchase

View Cart

Exit

The program accepts keyboard input and performs the selected action.

✔ Inventory Initialization
The inventory is hard‑coded with:

2 Weapons

2 Armor items

1 Health item

This satisfies the Milestone 2 requirement for initial inventory.

✔ Purchasing and Canceling
Users can:

Purchase a product by name

Cancel a purchase by name

Receive feedback if the product is not found or out of stock

✔ Shopping Cart
The cart supports:

Adding items

Removing items

Viewing cart contents

Displaying the total price

UML Class Designs Implemented
All UML classes from Milestone 2 were implemented:

Core Classes
SalableProduct (abstract)

Weapon

Armor

Health

Supporting Classes
InventoryManager

ShoppingCart

StoreFront

Each class matches the UML structure and supports the required properties and methods.

Flowchart
A flowchart was created to model the logic of a Game User interacting with the Store Front.
It includes:

Welcome message

Menu loop

Branches for each user action

Exit path

How to Run the Program
Open the project in Eclipse (or any Java IDE).

Ensure all .java files are inside the app package.

Run the StoreFront class.

Follow the on‑screen menu prompts.

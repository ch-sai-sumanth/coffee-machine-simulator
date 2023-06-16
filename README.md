<center>
<h1> COFFEE MACHINE SIMULATOR</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>

</center>
The Coffee Machine Simulator is a Java-based application that emulates the functionalities of a coffee machine. It provides a user interface for customers to purchase various types of coffee and an admin interface for managing the coffee machine's inventory and finances.

---
<br>


---


## Language Used
* Java

---
<br>

# Features

- **User Interface**: Customers can select from a menu of coffee options, enter the required amount, and make a purchase.
- **Coffee Types**: The machine offers three types of coffee: Espresso, Latte, and Cappuccino.
- **Admin Authentication**: The admin interface requires authentication using an admin ID.
- **Admin Actions**: The admin can fill the ingredients, check the remaining ingredients, and retrieve money from the machine.
- **User Experience**: The application provides a user-friendly interface with clear instructions and prompts.
- **Termination Control**: Only the admin has the authority to terminate or stop the machine.

## Data Flow

1.The application starts and prompts the user to select either "User" or "Admin" mode.

2.If the user chooses "User" mode, the application proceeds to the user flow:

    * The user selects a coffee type from the available options.
    * The application displays the price of the selected coffee.
    * The user is prompted to continue or not (Y/N).
    * If the user chooses to continue:
        # The user enters the amount of money.
        # The application validates the entered amount.
        # The application checks if the coffee machine has enough ingredients to make the selected coffee.
        # If there are sufficient ingredients:
            * The application deducts the required amounts of ingredients.
            * The application updates the money box with the payment received.
            * The coffee is dispensed to the user.
    * If there are insufficient ingredients, the application displays an error message.
    * If the user chooses not to continue, the flow returns to the initial prompt.
3.If the user chooses "Admin" mode, the application proceeds to the admin flow:

    * The application prompts the admin to enter their ID for authentication.
    * If the authentication is successful:
        # The admin is presented with options such as "FILL," "SHOW," and "TAKE."
        1.If the admin selects "FILL":
            * The application asks the admin what ingredient to fill and how much quantity to add.
            * The application updates the ingredient levels accordingly.
        2.If the admin selects "SHOW":
            * The application displays the current levels of ingredients in the coffee machine.
            * The application also displays the amount of money in the money box.
        3.If the admin selects "TAKE":
            * The application displays the amount of money in the money box.
            * The money box is emptied.
        4.After completing the chosen admin action, the application prompts the admin if they want to terminate the machine (Y/N).
            * If the admin chooses to terminate, the application ends.
            * If the admin chooses not to terminate, the flow returns to the admin mode prompt.
4.Throughout the flow, the application handles user inputs, validates inputs where necessary, and displays appropriate messages and prompts based on the user's choices.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/ch-sai-sumanth/coffee-machine-simulator.git
2. Change to the project directory:
    ```bash
   cd coffee-machine-simulator

3. Compile the Java source files:
    ```bash
   javac CoffeeMachineSimulator.java

4. Run the application:
    ```bash
   java CoffeeMachineSimulator

<br>

<br>

# Usage
1. Launch the application by running the CoffeeMachineSimulator class.

2. As a customer, follow the prompts to select a coffee type and enter the required amount. Insert the correct amount displayed on the screen.

3. As an admin, authenticate yourself by entering the admin ID when prompted. Perform administrative actions such as filling ingredients, checking the remaining ingredients, and retrieving money.

4. Follow the on-screen instructions and input the corresponding commands to navigate through the application.

5. To terminate the application, use the admin interface and choose the appropriate option to stop the machine.


<br>

## Project Summary

The Coffee Machine Simulator is a Java-based application that provides a realistic virtual coffee machine experience. It caters to both users and admins, offering distinct functionalities for each.

For users, the application allows them to select their desired coffee type from options such as Espresso, Latte, and Cappuccino. The price of the chosen coffee is displayed, and the user is prompted to continue or not. If they choose to proceed, they enter the required amount of money. The application validates the entered amount and checks if the coffee machine has enough ingredients to fulfill the order. If there are sufficient ingredients, the coffee is dispensed, the payment is processed, and the user receives their beverage. If there are insufficient ingredients, an error message is displayed.

Admins have additional privileges and need to authenticate themselves using an admin ID. Once authenticated, they can perform administrative actions. The "FILL" option allows admins to specify the ingredient and quantity to be added to the coffee machine. The "SHOW" option displays the remaining ingredient levels and the amount of money in the machine. The "TAKE" option allows admins to withdraw the money from the machine. Additionally, the admin has the option to terminate the machine if desired.

The project has a user-friendly interface that guides users through the coffee selection process and prompts admins for authentication and actions. It incorporates proper validation of user inputs and ensures the availability of ingredients before dispensing coffee. The system keeps track of the count of coffees sold, the amount earned, and the ingredients consumed, allowing for insightful analytics.

By creating this coffee machine simulator, you've developed a functional and interactive application that simulates the process of purchasing coffee, while also providing control and management features for admins.
## 📝 Licence
---
Copywrite © 2019 [sumanth]().


 
---
_This README was generated with ❤️  by [readme-md-generator]()_


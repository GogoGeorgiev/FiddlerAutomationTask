# README
## Project description:
This project was created in order to test basic functionalities in Fiddler everywhere desktop application: https://www.telerik.com/download/fiddler

## The project uses the following set of artifacts and their respective versions as defined in the Maven's pom.xml:
* TestNG version: 7.4.0. 
* sikulixapi version: 2.0.5. 
* selenium version: 3.141.59
* Java version: 1.8 or more

#### The project was created using Eclipse IDE Version: 2020-12 (4.18.0) and Maven as dependency management.
** Make sure to Clean and update the project before running:
1. Go to Project -> Clean
2. Right click on the project (FiddlerQA) -> Maven -> Update Project... 

## How to execute the project:
1. Download and install Fiddler everywhere (https://www.telerik.com/download/fiddler).
2. Download the project on your local machine.
3. Go to **config** folder -> **configuration.properties** file and change the **appPath** value to match your **installation path of Fiddler everywhere**!
4. Run the tests with Eclipse using **TestNG** plugin or Run them with **Maven Test** configuration.


## Test Cases that were automated:
1. Register user flow (Fill in the register form).
2. Authenticate flow (Login and Logout).
3. Capture Traffic flow (Open browser and load https://getfiddler.com/ url. Check if fiddler displays the traffic).

**Project Author**: _Georgi Georgiev_ (gogo.georgiev90@gmail.com)
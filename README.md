BLAZEDEMO ~ BOOKING A FLIGHT TICKET 

RUNNING INSTRUCTIONS
====================

Tests can be executed by running the testNG.xml file

(or)

Tests can be triggered from commandLine using mvn command:
mvn clean test -DsuiteXmlFiles=testng.xml


Test Scenarios
==============

There are number of test scenarios that can be automated with 
positive and negative validations for the each of the following pages:
a) Home Page
b) Reserve Page
c) Purchase Page
d) Confirmation Page

I have chosen to automate the end-to-end happy flow of user searching 
with 
source and destination and chooses to pick the lowest priced airline 
for his journey and enter all the details to book a ticket and gets 
to see the confirmation of his booking.


========================================
All the test scenarios for the execution:
=========================================
1- Verify the title of the homepage.
2- Verify the font and color of the texts used on homepage.
3- Verify the city names in the "Choose your departure city" dropdown.
4- Verify the city name in the "Choose your destination city" dropdown.
5- Verify the "Find Flights" functionality.
6- Verify that "Home" link is redicting to register and login page.
7- Verify After clicking on find flight user is getting redirected flight list page.
8- Verify All the table headers on flight list page.
9- Verify choose this flight functionality.
10- Verify user is able to select the flight upto their choice.
11- Verify the all the text fields and dropdowns for the reservation page.
12- Verify remember me functionality.
13- Verify "Purchase Flight" functionality.
14- Verify purchase details and booking Id on the final page.
15- Verify that user is able to use different card type for the purchasing.


Subset of the scenarios for Automation:
=======================================
1- Verify the functionality for choosing the departure city.
2- Verify the functionality for choosing the destination city.
3- Verify that Finding the flight for above selected cities is working.
4- Finding the cheapest flight.
5- Clicking on Choose this flight against the desired flight selected.
6- Filling the details for the reservation.
7- Purchasing the flight.
8- Verifying the ID for the booked flight.

Reason for include and exclude for the Automation:
==================================================
I have included 8 scenarios out of 15 major scenarios for automation because these scenarios are for happt path and it validated around 70% of functionality. I have excluded the UI automation such as font, text and color validations, alongwith validations of puchasing with different card type, as it will just repeat the whole process again. Although it can be covered using data driven approach. This test will give a good confidence on major and critical functionality.

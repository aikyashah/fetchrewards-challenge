# fetchrewards-challenge
New repository that contains code for the challenge

fetchrewards-challenge is a REST web service developed in Java using Spring Boot. It return true or false by checking whether the String supplied in the URL path follows the pyramid build or not.

# Specifications:
- Java version: 1.8
- Spring Boot version: 2.3.4
- Browser tested:  Chrome 85.0.4+, Firefox

# How to checkout:
1. Clone the repository in the IDE of your choice or click download zip. I have explained the steps for Eclipse IDE.
2. Extract the zip file to your working directory
3. Go to Eclipse: File -> Import -> Existing Maven Projects -> Select the extracted folder -> Select the pom.xml file -> Finish

# How to run the service on Eclipse:
1. Right Click on the Project
2. Run as Java Application
3. Select the file PyramidWordApplication.java
4. Run

When you see the message: Started PyramidwordApplication in "XYZ" seconds (JVM running for XYZ), it means the application has started

The service runs on port 8080

Now go to Chrome Browser or open Postman applicaion
In the URL section enter: http://localhost:8080/pyramid/banana
The serivce return a boolean value. Check the reply as 'true'. This is the simplest way to return a boolean response to the client
Change the words and check for other cases.

# Assumptions:
1. Case is ignored. banaNA is still considered the same as banana
2. Empty string or malformed URLS (like http://localhost:8080/pyramid/ or http://localhost:8080/ ) are returned a text error message.
3. The Request will always be a GET request
4. All white spaces are ignored after the /pyramid part of the URL
5. Unicode characters are allowed like *, ?, ! etc as a valid part of the string



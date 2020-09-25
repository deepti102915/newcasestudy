







DELIVERABLES FOR DSHOPPING.COM

Prerequisites : Step 1 - Make sure MySQl is installed on the machine.
                Step 2 - Update below details in application.properties file
                  spring.datasource.url=jdbc:mysql://127.0.0.1:3306/dshopping?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		          spring.datasource.username=root
		          spring.datasource.password =DakshaHello
                Step 3 - Create schema dShopping on mysql database using below create schema script.
		                 CREATE SCHEMA DSHOPPING;


1: TRELLO BOARD: Trello board is a web-based Kanban Style list-making application. 
                 Users can create their task boards with different columns and move the tasks between them.
                 I have included the following columns:
                 a: Ideation
                 b: Backlog
                 c: Upcoming
                 d: Current
                 e: Review
                 f: Completed

                 The URL for this board is as follows: https://trello.com/b/77nYDHS9/dshoppingcom


2: SCHEMA DIAGRAM: A Schema Diagram is the blueprints of your database. It represents the description of a Database structure, data types, and the constraints on the database.
                            

 


3: PROJECT URL:  https://github.com/deepti102915/newcasestudy

4: STEPS TO CLONE REPOSITORY WITHOUT FORKING:  Please follow the steps to clone the project in your repository in order to run it successfully

A: Copy URL of the project you want to clone
B: $git clone URL new folder name
C: cd new folder name
D: rm -rf .git
E: Add a repository in your git hub with same name as new folder name
F: $git init
G: $git add.
H: $git commit -m ""
I: $git  remote add origin (new repository url to push)
J: $git push

5: OPEN THE PROJECT IN INTELLIJ: Now I will display step by step the complete functionality of this application:
 
STEP1: Run Main Application by doing right click and then click on Run


Step 2: Spring MVC should be up and running without any errors. Tomcat should start at Port 8080


   ![Step 2](https://user-images.githubusercontent.com/64552538/94212692-db8f9a80-fea2-11ea-886c-1625adc36ce0.png)

 
Step 3(a) Open MYSQL workbench, Connect To Database (MySQL). We will see that now all tables are created in database but there is no data inside them.
 
Step 3(b): Enter username, password & click OK:
 
Step 3(c) : We can see our Database DShopping.com has been dynamically created
 
Step 3(d): Expand the Database to see all Tables created dynamically:
 
Step 3(e) : Run the Query as follows to check that there should not be any data in the deal table
 
Step 3(f): Run query for Item table: 
 
Step 3(g): Run Query for product table:

 
Step 3(h): Run query for User table:
 


Step 4: Launched application using localhost URL which includes default port 8080


 


Step 5: By Default the application starts with Home Screen

 

Step 6(a): Now, go back to DB and check if there is data present in the tables now. Run Query for deal table. Data is available now.

 
Step 6(b): Run query for item table:
 
Step 6(c) : Run query for Product table:

 
Step 6(d): Run Query for user table, this should still be empty as no user has been registered:
 
Step 7: Go back to browser, Click on the tab About, the application moves container to About section

 
Step 8(a): Click on the tab Products, the container shows all the available products for Shopping with their details provided on the screen.

 
Step8(b): Go back to IntelliJ, the products can be seen here on the screen:
 
Step 9(a): Click on the tab Portfolio, all the product Categories will be displayed:
 
Step 9(b): Click on the first one, Furniture:

 
Step 9(c) : Click on the second one, Mobile: 

 
Step 9 (d): Click on Books: 

 
Step 9 (e) : Click on Computers

 
Step 9(f): Click on Men

 
Step 9(g): Click on Women:

 
Step 10 (a): Click on the tab Today’s Deal:

 
Step 10(b): Click on the IntelliJ, the Deals can be seen here on the screen.

 

Step 11(a): Click on the tab Contact:
 
Step 11(b): Click on the email address, The page should be displayed as follows to send the email:

 
Step 12 (a): Click on the tab SignIn/Register:

  
Step 12(b): Enter any random username and password which is not registered, it displays the error message “User not found. Kindly register”

 

Step 12 (c) : Click on the tab Clear to clear the input.
 
Step 12(d): Click on Register tab to register the user:
 
Step 12(e): Go back to My SQL to check to see that user is registered:

 
Step 12(f): Go back to Main page, the user name is highlighted in the Sign In/Register tab as follows: 

Step 13(a): Click on Cart, when user has not signed in. You will see the display message as follows:

 
Step 13(b): Sign In, if anything is present in the cart for that user it will be displayed. Click on Cart now. All Products in the cart will be displayed as follows: 
In DB we have only price and quantity, subtotal is calculated in loginconf.JSP files.  This ensures that HomeController works fine.

 

Step 14(a): Go back to Constructor and click on the test case by doing right click on Test Constructor class. It checks all Constructors works fine.
 
Step 14(b): All Test cases should pass as follows:
 
Step 14(c) : Run Test Case for User Service Test to check if User is created successfully 
Step 14 (c) : The Test case should pass as follows: 
  

 ## project in one line ## 
 - this project will help user interact with dbms easily.

## project desc in details ##
- users will be given some options like select or read , delete, insert data  and update data. users have to press a number to choose the operation they want it to perform.

## SELECT ##
 user have to press to see the entire table. (later in the project i will add some more features like selecting specific thing)

## DELETE ##
 if the user the chooses delete "are u sure" will print on terminal if the ans is yes we delete the table else no.

 ## INSERT DATA ##

 it will ask the user to give data for followig things - id , name , email, salary. and insert it into the table;

 ## update data ##

 it will ask user what does he wants to update , id , name , email or salary. then user have to write the updated value. after user gives input it will ask for condition. then the table will be updated.

## files ##

it will contain five files in total.

## main file ##

it will basically interact with user in the terminal. i will use scanner class to scan user choice and will use switch case based on their choice.

for inserting and updating data i will use arraylist. after all the scanning and printing i will call the Employee class and the DB class here.
i will keep the switch case inside a loop. 

## connection file ##

basically connection file. here i will connect java with mysql. user , password , url will be given here and we will return the connection;

## Table file ##

i will make employee class here. it will store the data from the user and i will take that data from here and use it in DB file to update and insert data.

## query ## 

i will store all the query here. 

## DB FILE ##
in insert and update functions i will take Employees as input. then i will call the connection , select the update and insert query. i will use prepareStatement for both insert and update. and i am gonna use executeQuery for insert and executeUpdate for update.

in select function it will be simillar to insert and update but i will use ResearchSet here to print the entire table.

(what will be the return type here?)


 
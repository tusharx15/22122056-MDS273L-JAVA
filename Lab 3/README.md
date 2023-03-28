# QUESTION:
Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
You can use a two-dimensional array to store the details.
You need to have functions to:
Collect the details of the student
Display the details of the student
Search the details of the student
With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.
Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.
You will have a function to perform this search operation, which can be used to implement two functionality in the code
To check if the name is already entered
While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
In the end, you will have four functions inside your lab program class including your main class, 
One static String array storing the names (note the program can store up to 1024 students),
One two-dimensional string array storing the details of up to 1024 students,
A menu-driven main method implementing the functions and functionality.
Plan your program with a flow chart before starting with coding. Since you are using functions, plan what should be the returning values and how to implement them.

# OUTPUT:

--------Welcome--------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

---------------------------------------
1

---------------------------------------------------------------------
Please enter the details of the student as follows:

----------------------------

Please enter the Name of the student:

------------------------------------
Jim

----------------------------------------

Please enter the Registration Number of the student:

----------------------------------------
12345

----------------------------------------
Please enter the Email of the student:

----------------------------------------
jim123@gmail.com

----------------------------------------
Please enter the student's Programme:

----------------------------------------
MSC

----------------------------------------
Please enter the student's Course:

----------------------------------------
Data Science

--------Welcome------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

---------------------------------
1

---------------------------------------------------------------------
Please enter the details of the student as follows:

----------------------------
Please enter the Name of the student:

------------------------------------
Jack 

----------------------------------------
Please enter the Registration Number of the student:

----------------------------------------
67890

----------------------------------------
Please enter the Email of the student:

----------------------------------------
jack_123@gmail.com

----------------------------------------
Please enter the student's Programme: 

----------------------------------------
BSC

----------------------------------------
Please enter the student's Course:

----------------------------------------
Economics Analysis

--------Welcome------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

--------------------------------------------------
2

-------------------------------------------------------

Enter the name of the student whose details you want:
Jack

--------Welcome------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

-----------------------------------
3

Which student's details do you want? 
Jim
Name is found at position 1
The details of the student are:
Jim
12345
jim123@gmail.com
MSC
Data Science


--------Welcome------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

-----------------------------------
5

--------------Invalid Choice! Please Make A Valid Choice-------------

--------Welcome------

--------This is the Student Portal------------

1- Enter student details

2- Display the details

3- Search the student's details

4- Exit the Student Portal

4

Successfully exit the Student Portal!






![flow_lab-3_fnl](https://user-images.githubusercontent.com/118044440/228126798-f77d734b-31be-417e-8f0e-0c461f907d3a.png)


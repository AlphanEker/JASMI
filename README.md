#Java Simple Medical Interface (JASMI)

## About
JASMI is a patient management system for medical institutions and patients, in which patients are able to  keep track of their medical procedures such as accessing their medical records, detailed hospital informations or available medicines at a selected pharmacy or drug store. Therefore thy system will be available to patients, pharmacists and doctors, with different functions for every user type.

## To Be Added
* JASMI currently works and displays some of the main functions of its application. However, since there were no public database that stores the required medical information, sample medical data is added to source.
* JASMI is not currently connected to a database but a simple SQL database will solve the problem

## Functionalities
To start JASMI, first run LogInPage.java under the package Pages.
Then, Log in page will be displayed to user.

* To Log in as a PATIENT account and use patient main page:
	USERNAME = patient
	PASSWORD = 12345

* To Log in as a HOSPITAL account and use patient main page:
	USERNAME = hospital
	PASSWORD = 12345

* To Log in as a Pharmacy account and use patient main page:
	USERNAME = pharmacy
	PASSWORD = 12345
	*NOTE: These are preadded users for test purposes
** You can exit the frame with default close operation. Then, you can run LogIn.java again to log in with a different account.

All three different account types have their unique menus and functions.

## About (Technical)
	JASMI contains classes that implement different account types and their relevant functions. Also, JASMI's related GUI pages are contained under the package pages. Also JRE Java System Library is used. For the development of classes, JASMI mostly uses VS Code (version 1.55). For GUI design JASMI Eclipse IDE 2021-23 and its Window Builder add-on is heavily used with custom changes on the auto generated code.
	
	JASMI is purely written on Java.


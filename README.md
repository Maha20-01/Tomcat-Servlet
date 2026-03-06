# Java Servlet Login Validation

## Overview

This project demonstrates a **Java Servlet-based login validation system** using **Apache Tomcat** and **Maven**.
The application validates **username and password** using regular expressions.

## Technologies Used

* Java
* Servlets
* Apache Tomcat 9
* Maven
* HTML

## Features

### UC1 – Setup Servlet Project

Created a **Maven Web Application** and deployed it to **Apache Tomcat**.

### UC2 – Login Form

A simple HTML form collects:

* Username
* Password

### UC3 – Name Validation

Rules:

* Must start with **uppercase**
* Minimum **3 characters**

Regex used:

```
^[A-Z][a-zA-Z]{2,}$
```

### UC4 – Password Validation

Rules:

* Minimum **8 characters**
* At least **1 uppercase letter**
* At least **1 number**
* At least **1 special character**

Regex used:

```
^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$
```
```
http://localhost:8080/Servlet/login.html
```

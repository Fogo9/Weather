# **WEATHER**

# Information

* **When you enter the temperature, it gives you advice on what to do.**

# Technologies Used

* **JAVA**

# Contents

* This project, it is written using only heat int variable.

* Scanner class is used to get temperature information from the user.

* If the temperature value is within a certain range, it makes suggestions accordingly.

<br />

# Codes

```Java

        import java.util.Scanner;

            public class Weather{

                public static void main(String[] args) {

                    int heat;

                    Scanner input = new Scanner(System.in);

```

```Java

                    System.out.print("Enter The Temperature : ");

                    heat = input.nextInt();


                    if(heat < 5){

                        System.out.println("You can Ski.");

                    } else if (heat > 5 && heat < 15){

                        System.out.println("You can go to The Cinema.");

                    } else if (heat == 15){

                        System.out.println("You can go to The Cinema or on a Picnic.");

                    } else if (heat > 15 && heat < 25){

                        System.out.println("You can go on a Picnic.");

                    } else {

                        System.out.println("You can go Swimming.");

                    }
                }
            }

```

```bash

        Enter The Temperature : 4
        You can Ski.

```
```bash

        Enter The Temperature : 6
        You can go to The Cinema.

```
```bash

        Enter The Temperature : 15
        You can go to The Cinema.
        You can go on a Picnic.

```
```bash

        Enter The Temperature : 20
        You can go on a Picnic.

```
```bash

        Enter The Temperature : 26
        You can go Swimming.

```
<br />

# LINK

* Click here https://github.com/Fogo9/Weather.git to access the Github page for this project.

<br />

# LICENSE

* This software is licensed By Tuncay Demir under the MIT license.

<br />

>[Patika.dev](https://app.patika.dev/fogomurphy)

<br/>

| Name |  Email |
| ---- |  ----- |
| Tuncay | tuncaydemir682@gmail.com |

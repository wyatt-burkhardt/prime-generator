# prime-generator

This project is a prime number generation program that is using an altered implementation of the Sieve of Eratosthenes.

## Getting Started

These instructions will assist with getting a copy of the project running on your local machine for development and testing purposes.

### Prerequisites
I built this project using [IntelliJ IDEA](https://www.jetbrains.com/idea/download/). The following instructions will be created with the assumption that you're using the same or a similar, more familiar IDE.

This project requires [Java SE Development Kit 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html), as well as [JUnit 5](https://junit.org/junit5/docs/current/user-guide/).
The aforementioned links contain downloads and setup information.

### Installing

Start by opening a new Terminal window and cloning this repo.  Alternatively, you can download a ZIP file using the "Clone or download" button in the upper-right quadrant of the repo.

```
git clone https://github.com/wyatt-burkhardt/prime-generator.git
```
Launch IntelliJ IDEA and select "Open", then navigate to the directory where you cloned the repo and select the project.


Once the project has loaded, select "Application" from the configurations drop-down in the upper-right quadrant:

![Select Application](/img/select-Application.png)

Then click on the Green triangle (Run) button located immediately to it's right.

The Run window should open at the bottom of the IntelliJ IDEA window displaying the following text:

```
Please enter a range of numbers (ex: 5...10) (enter "n" to quit)
```

At this point you should be able to generate the prime values within a range of numbers!

![Working Prime Generator](/img/generator-in-action.png)

### Valid Inputs
The program accepts a minimum and maximum number to the range you want to generate prime numbers for, and should be denoted by a series of 3 periods.

ex: 
```
5...25
100...250
50...25
```

Alternatively, you can also capture a range of prime number values beginning at 0 and ending at the number specified with either of the following syntax's.

```
100 
...50
```
The above examples will display the prime numbers from 0 to 100, and 0 to 50 respectively.

To quit the program, and stop specifying number ranges to generate, simply enter an "n"
## Running the tests

Explain how to run the automated tests for this system


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used


## Authors

* [Wyatt Burkhardt](https://github.com/wyatt-burkhardt)



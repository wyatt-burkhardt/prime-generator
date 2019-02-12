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

After cloning the repository you can actually run the included jar directly with the following command: 
```
    java -jar prime-generator/out/artifacts/primeGen_jar/primeGen.jar
```
[Jump to valid inputs](#Valid-Inputs)

Alternatively, Launch IntelliJ IDEA and select "Open", then navigate to the directory where you cloned the repo and select the project.


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

If the above instructions on opening the application in IntelliJ IDEA were successful, you can now run the unit tests as well.

Click on the same "configurations" drop-down you used to select "Application" to run the project, but instead select "Edit Configurations".

![configurations](/img/edit-configurations.png)

Click the "+" symbol located in the upper-left corner of the configurations window and select JUnit.

![add new configuration](/img/add-new-configuration.png)

Change the name from null to "All Tests"

Select "All in package" from the "Test kind:" drop-down.

Paste the following into the "Package" field

```
    resources.com.wyattburkhardt.primegen
```


Select "In whole project" from the "Search for tests" radio selections

![configuration settings](/img/configuration-settings.png)

Click the "Code Coverage" tab
In the "Packages and classes to record coverage data" section there is a button in the lower left corner to add a class for coverage.  (+c)

![code coverage settings](/img/code-coverage-settings.png)

Select each non-interface class that doesn't end with the word "Test" and add them to the code coverage.

Apply the changes and click Ok


With "All Tests" selected in the configuration drop-down, click the third button to the right of it that looks like a small green arrow in front of a shield. This will run all the tests with coverage.

![successful tests](/img/successful-test-run.png)





## Authors

* [Wyatt Burkhardt](https://github.com/wyatt-burkhardt)



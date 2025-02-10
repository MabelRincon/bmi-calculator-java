# BODY MASS INDEX CALCULATOR

## Table of Contents

- Description
  - What is BMI?
  - BMI Categories
  - How to calculate BMI?
- How to use this BMI Calculator
- Classes
- Getting Started
  - Prerequisites
  - Installation
- Tests
- Build
- Usage
- Feedback and Contributions
- Contact

## Description

Body Mass Index (BMI) is a widely used tool to assess whether someone is underweight, normal weight, overweight, or obese based on height and weight. It is a simple and inexpensive method to evaluate body composition and estimate the risk of developing weight-related health problems.

### What is BMI?

BMI is a measure of body fat based on height and weight that applies to both adult men and women. It is calculated by dividing a person’s weight in kilograms by their height in meters squared (kg/m2).

The resulting number is then compared to a standard BMI chart to determine whether the person is **underweight, normal, overweight, or obese.**

### BMI Categories:

A BMI of less than 18.5 is considered underweight. A BMI between 18.5 and 24.9 is considered normal weight, while a BMI between 25 and 29.9 is considered overweight. A BMI of 30 or above is considered obese.


Based on the calculated BMI, you can determine current situation. The results will fall within the ranges specified in the range below:

![bmi](src/main/java/dev/mabel/template_java/resources/static/images/BMI.png)

### How to Calculate BMI?

The formula for calculating BMI is simple:

**BMI = weight (kg) / height (m)²**

For example, if a person weighs 75 kg and is 1.8 m tall, their BMI would be calculated as follows:

**BMI = 75 / (1.8 x 1.8) = 23.15**

The resulting number, 23.15, would indicate that the person has a normal weight.

## How to use this BMI Calculator

Calculating BMI can be done by hand, but using BMI calculator is much easier. All you need to do is **input your height and weight**, and the calculator will provide you with your BMI and tell you which category you fall under.

It’s important to note that while BMI is a useful tool for assessing weight-related health risks, it does have limitations. For example, it doesn’t consider muscle mass or body composition, which can affect BMI readings.

Additionally, it’s not a reliable indicator of health for people who are very tall or short, pregnant women, or people with certain medical conditions.

## Classes

1. **BMIService** → Contains logic to calculate BMI and classify weight.
2. **BMICalculator (Main Class)** → Calls BMIService and prints the result.

![class-diagram](src/main/java/dev/mabel/template_java/resources/static/images/bmi_class_diagram.png)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 21
- Maven (for build management)
- JUnit (for testing)
- Git (for version control)

### Installation

1. Clone the repository:

```Bash
git clone https://github.com/MabelRincon/bmi-calculator-java
```

2. Change to your project directory:

```bash
cd bmi-calculator-java
```

4. Run a clean Maven installation:

```Bash
mvn clean install
```

## Tests

Describe how to run the project's tests.  Specify the testing framework used (e.g., JUnit, TestNG) and provide commands for running the tests.

**Example (using Maven and JUnit):**

```Bash
mvn test
```

## Build

Explain how to build the project.  Specify the build tool used (e.g., Maven, Gradle) and provide the necessary commands.

**Example (using Maven):**

```Bash
mvn clean package
```

## Usage

Provide examples of how to use your project.  Include code snippets, screenshots, or GIFs if helpful.  Explain the different options and parameters available.

**Example (Java code snippet):**

```Java
// Example usage of the main function
MyClass myObject = new MyClass();
myObject.doSomething("important argument");
int result = myObject.calculateValue(10, 20);
System.out.println("Result: " + result);
```

## Feedback and Contributions:

Feedback is welcome! Feel free to open issues or submit pull requests to suggest improvements or report any bugs.

## Contact:

I'm **Mabel Rincon** you can contact me via  [![Linkedin](https://i.sstatic.net/gVE0j.png) LinkedIn](https://www.linkedin.com/in/mabel-rincon/)
&nbsp;
Check out other repositories at
&nbsp;
[![GitHub](https://i.sstatic.net/tskMh.png) GitHub](https://github.com/MabelRincon)
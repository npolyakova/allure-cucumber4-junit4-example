
## Allure Cucumber4 + JUnit4 Example

### Getting Started

To generate Allure Test Results you should perform following steps:

```bash
$ git clone https://github.com/allure-examples/allure-cucumber4-example.git
$ ./gradlew test
```

Test results will be generated to `build/allure-results` folder. To generate the report you can use the following command of allure commandline:

```bash
$ ./gradlew allureServe
```

There is another way of generating the report. The generated report can be opened here "allure-report/index.html". The command to generate the report is the following:

```bash
$ ./gradlew allureReport
```
### Labels
To use labels you should add  property "cucumber.plugin" to junit-platform.properties. Also you should define patterns in allure.properties for simple links, issues and tms links to see them as links at the report.

### More

* [Documentation](https://docs.qameta.io/allure/2.0/)
* [Issue Tracking](https://github.com/allure-framework/allure2/issues?labels=&milestone=&page=1&state=open)
* Gitter chat room: [https://gitter.im/allure-framework/allure-core](https://gitter.im/allure-framework/allure-core)
* StackOverflow tag: [Allure](http://stackoverflow.com/questions/tagged/allure)

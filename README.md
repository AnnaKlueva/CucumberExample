<h3>Example of Cucumber </h3>
<h4>Technologies:</h4>

- Cucumber
- CucumberReport
- Junit
- Maven
- Java8

<h4>Main cases:</h4>

- example of CucumberOptions + Cucumber runner

<h4> Additional info (CucumberOptions):</h4>

- features – path to the folder with .feature files.<br>
 Framework will looking for the files in this folder and all subfolders. <br> 
 As an option several folders can be mentioned.<br>
  For example:  features = {«src/test/features», «src/test/feat»};
  <br><br>
  Note: please pay attention on the format of the path to the .feature folder.
- glue – the package where the hooks and steps definitions are lockated.<br>
    Several packages can be mentioned.<br>
    For example:  glue = {«org.example.test», «or.example.anna.hooks»};
     <br><br>
   
    Note: please pay attention on the format of the path to the package with steps definitions <br>
    Note: hooks (file with @Before and @After methods) HAVE to be store in the same folder as steps definition
- tags – if you want to run specific group of tests , you can create specific group by using tag.<br>
List of tags can be written by comma.<br>
If you want run all tests except specific group of tests, you have to use ~ symbol:
~@fail

<h4>Cucumber report</h4>
1. To run tests and generate Cucumber report:

```
mvn clean test
```
2. To see a report open the Cucumber link from console <br>
Example:
```$xslt
https://reports.cucumber.io/reports/a372f6dd-005a-4594-b149-db620e84fbf2
```
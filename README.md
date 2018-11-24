Information about application

You should have file ChildParent.txt in you C:\ drive, or you can change the path of the file in the code.
Input:
Adam Ivan
Marko Stjepan
Stjepan Adam
Robert Stjepan
Fran Ivan
Leopold Luka

Desired output:


How to run maven project from terminal:
Once you pull the project, position yourself where pom.xml file is (in my case C:\Users\Kralj\IdeaProjects\TestAltima) and type:
mvn exec:java

this will start the application and if everything is configured how it should ne, it should output correctly.

How to run tests from terminal:
Same with maven project, position yourself to where pom.xml file is and type:
mvn test

this will start all test files in \test directory.

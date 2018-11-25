# Information about application

You should have file ChildParent.txt in you C:\ drive, or you can change the path of the file in the code.

The format of the file is
```
<child name> <parent name>
```


## Input:
```
Adam Ivan
Marko Stjepan
Stjepan Adam
Robert Stjepan
Fran Ivan
Leopold Luka
```

## Desired output:
```
Ivan
   Adam
      Stjepan
         Marko 
         Robert
      Fran
Luka
   Leopold
 ```  

## How to run maven project from terminal:
Once you pull the project, position yourself where pom.xml file is (in my case C:\Users\Kralj\IdeaProjects\TestAltima) and type:
```
mvn exec:java
```

this will start the application and if everything is configured how it should be, it should output correctly.

## How to run tests from terminal:
Same with maven project, position yourself to where pom.xml file is and type:
```
mvn test
```

this will start all test files in \test directory.

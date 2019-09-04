# freemarker_example
Following is the requirment.
    a. Read data from database<br>
    b. format the data as per freemarker template<br>
    
I wanted to test the basic working of freemarker template as one of my project uses this for generating output in JSON format. After some googling
,Came accross a very good example which is tried out in Netbeans IDE.

Following versions of software used.<br>
    a. freemarker-2.3.28.jar<br>
    b. JDK 1.8<br>
    c. Netbeans IDE 9.0<br>
 
 Folowing is the project structure in Netbeans.
 
 - Freemarker
    - Source Packages
        - freemarker<br>
              -FirstExample.java<br>
              -ValueExampleObject.java<br>
              -employee.ftl<br>
              -employeeXML.ftl<br>
 We have to change the following in case we want to see , how the output will look as JSON or XML
 
 Template template=cfg.getTemplate("employee.ftl")- for JSON<br>
 Template template=cfg.getTemplate("employeeXML.ftl")- for JSON<br>
 
 
              

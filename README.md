# WindMill
Windmill Energy management.



## Tech Stack

SpringBoot - 2.1.9, Java -1.8, Hibernate -5.2.3, Database -H2 (1.4.197), Cron Scheduler, Apache Logger,Build tool-Maven Junit- Mockito, Code coverage -Jacoco

## Procedure to run Application

-->Clone and import the project into IDE

--> Right Click on the project -->RunAs-->MavenBuild-->mvn clean install

-->Open WindmillfarmApplication.java-->RunAs-->JavaApplication

## Test the REST API

1)Windmill Registration
  
      URL : http://{IP:PORT}/windmill/registeration/
      
      RequestHeader : Content-type : application/json
      
      Request Body : { "uniqueId": "1234568831234564","name": "aa","address": "chennai","latitude": "23.1", "longtitude": "23.56"}
      
      
  2) Windmill Chart Creation API
  
    URL : http://{IP:PORT}/windmill/chartData/?uniqueId=1234568831234564
    
    RequestHeader : Content-type : application/json
    
    
    
  Note:  All Needed configuration and the dependencies are included and done for sample one.
  
  
        
          

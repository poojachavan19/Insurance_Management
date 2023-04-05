# Insurance_Management

**Introduction**
  Insurance Management Platform is developed to manage Insurance policy-related activity by a web application, where an admin is a user, can check the list of the insurance client, can add a client, add a policy, and claims etc. The user will be a customer who can view the client details, policy and can apply for a policy listed. 
	This is a Spring Boot project using the Spring Initializr and it includes necessary dependencies like Spring Boot DevTools, Spring web, Spring DataJPA(to use hibernate), MySQL(to connect SQL).  Here, used postman for send data from front end and using spring boot performs operations on the table.
                 
**How to run the application**
Step 1: Import the project in eclipse framework
Step 2: Add Database details and user details in application.properties file
Step 3: Open Postman and create new request
        Select GET fetch all details of client and write url- http://localhost:6133/getAllClient
        It will return all data of client.
Step 4: Select GET fetch details of client by id and 
        write url- http://localhost:6133/getClient?id=1
        It will return client detail of id 1.
Step 5: Select POST to save details of client and
        write url- http://localhost:6133/saveClient.
        It will save client details.
Step 6: Select PUT to update details of client and
        write url- http://localhost:6133/updateClient
        It will be update the client details and display the messa 
Step 7: Select DELETE to delete details of client and
        write url- http://localhost:6133/delClient?id=3 
Step 8: Similar follow steps 4 to 7 to perform crud operation on InsuarancePolicy and claims.

**Structure**
**Client:** Represents a client with properties such as name, date of birth, address, and contact information. 
**InsurancePolicy:** Represents an insurance policy with properties like policy number, type, coverage amount, premium, start date, and end date. Each policy should                         be associated with a client.
**Claim:** Represents an insurance claim with properties like claim number, description, claim date, and claim status. Each claim should be associated with an                     insurance policy. 

**Features:**
     Today, as we are living in uncertainty, what may happen tomorrow no one knows, whether it is related to our health or the objects around us that we use in our daily life. So, why not take Insurance. Insurance is all about providing financial safety to the individual. It helps us to enjoy financial security. If we have a proper application to access all the Insurance related activity then it will be cheery on top. 

**Tools and Technologies**
Front-End: Postman API
Server-side: Spring Boot.
Back-end: MYSQL, Hibernate.

 

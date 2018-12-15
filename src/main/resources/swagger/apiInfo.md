#Databus 

## **Overview**
----
Databus is a product of the [Build, TestTools, Release Team (BTR)](https://climate.jira.com/wiki/spaces/Eng/pages/212999943/BTR). It is an API Orchestration Framework enables the creation of front end composite services that can be composed of one or more upstream Climate API Service. 

Talus Services are the first set of APIs deployed to Databus. These services provide testers with the ability to create test data sets from one or more Climate Services. 

These services give tester a tool for creating large sets of test data that can be pre-loaded with data from templates relevant for their testing context in an automated, intuitive fashion. This will likely be a boon to both automated and manual/exploratory testing efforts, as the current process for creating test data
is manual, time intensive, and error prone.   
  
Teams using Talus Services:
Salesforce
 
Databus is available for use in the Qa1 and Production environments.

## **Support**
----

Databus is developed and maintained by the [Build, TestTools, Release Team (BTR)](https://climate.jira.com/wiki/spaces/Eng/pages/212999943/BTR).  

- Office Hours: Fridays at 3:00
- Slack: #btr
- Source Code:  [Bitbucket](https://git.tcc.li/projects/BTR/repos/talus/browse)

## **Talus Constraints**
----  
The following constraints applies to all Talus Service REST APIs:
- The Dealer and Dealership REST Services are not available in the PRODUCTION Environment.
- Only Authenticated Users with the `Employee` role will be able to use Talus tool. This constraint is for security and Auditing reasons. 
- Talus authenticates a user based on `x-http-user-email` and `x-http-user-password` http header values. 
- Talus uses Auth Service to authenticate the users and does not log or persists user passwords 
- Talus only allows creation or modification of user accounts whose email account ends with `@climate.com`. This constraint guarantees no customer account data is changed by mistake.
- Talus has Rate Limiting enabled, a caller would be rate limited if the API call rate is > `10 API calls/sec`. there's A System wide rate limit of `50 API calls/sec`. Once rate limited a caller need to wait for about `1 sec` to try again.

## **Upstream Services**
---
The Talus Services are composed of calls to the following Climate upstream services.

  - Baelish: [http://baelish.qa1.tcc.services](http://baelish.qa1.tcc.services)
  - Eula: [http://eula.qa1.tcc.services](http://eula.qa1.tcc.services) 
  - Eva: [http://eva.qa1.tcc.services](http://eva.qa1.tcc.services)
  - Groot: [http://groot.qa1.tcc.services](http://groot.qa1.tcc.services)
  - Homestead:[http://homestead.qa1.tcc.services](http://homestead.qa1.tcc.services)
  - Planting: [http://planting.qa1.tcc.services](http://planting.qa1.tcc.services)
  - Product Asset: [http://product-assets-java.qa1.tcc.services](http://product-assets-java.qa1.tcc.services/swagger-ui.html)
  - Salesforce: No Swagger API Docs. **Not available in Production**.
  - Scouting: [http://tenderfoot.qa1.tcc.services](http://tenderfoot.qa1.tcc.services)
  - Season: [http://season.qa1.tcc.services](http://season.qa1.tcc.services)
  - Seed Advisor: [http://seed-advisor.qa1.tcc.services](http://seed-advisor.qa1.tcc.services)
  - User: [http://user.qa1.tcc.services](http://user.qa1.tcc.services)
  - Walter: [http://walter.qa1.tcc.services](http://walter.qa1.tcc.services)

## **REST APIs**
----

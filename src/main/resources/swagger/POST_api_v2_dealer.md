**This API is NOT Supported in the PRODUCTION Environment.**

####Overview

The Talus Create Dealer API calls the User Service and the Salesforce sObjects API to create a new Dealer in Salesforce.  A Dealer corresponds to a Salesforce Contact Object 
with account record type set to "Dealer Contact" that is related to a User record by userId.

This API can also create 0-5 Growers with each Grower having 0-5 fields.  The Eva Service is used to create relationships between the Dealer and Grower, Farm, or Fields.

The relationship can be created at the operation, farm, or field levels.  The permission for the relationship can be set to EDIT or VIEW. 

The request body supports the following fields:
 
<table>
  <tr><td><b>Field</b></td><td><b>Values</b></td><td><b>Required</b></td></tr>
  <tr><td>climateEmail</td><td>Email address ending in @climate.com.  If not include API will generated random email address.  </td><td>No</td></tr>
  <tr><td>countryCode</td><td>US, CA, BR, FR, DE, UA, ES, IT, RO</td><td>Yes</td></tr>
  <tr><td>dealerFirstName</td><td>If included the value will override the first name value from the user dealer template. </td><td>No</td></tr>
  <tr><td>dealerLastName</td><td>If included the value will override the last name value from the user dealer template. </td><td>No</td></tr>
  <tr><td>numberOfFields</td><td>Number of fields to create per grower.  The range is 0 to 5.</td><td>No</td></tr>
  <tr><td>numberOfGrowers</td><td>Number of Growers to create.  The range is 0 to 5.</td><td>No</td></tr>
  <tr><td>permission</td><td>The permission of the relationship created between the Growers and Dealer.</td><td>No</td></tr>
  <tr><td>resourceType</td><td>The level of the relationship: OPERATION, FARM, or FIELD.</td><td>No</td></tr>
  <tr><td>salesforceDealershipId</td><td>Id from a Dealership record.  If not included the API will create a Dealership and assign the id to the Dealer.</td><td>No</td></tr>
  <tr><td>salesforceFieldMap</td><td>Additional fields can be added by adding name value pairs to the salesforceFieldMap. 
  See example below.</td><td>No</td></tr>
  </table>

####Example Request

    {
       "climateEmail": "name@climate.com",
       "countryCode": "US",
       "dealerFirstName": "First Name",
       "dealerLastName": "Last Name",
       "numberOfFields": 2,
       "numberOfGrowers": 1,
       "permission": "EDIT", 
       "resourceType": "OPERATION",
       "salesforceDealershipId": "001J0000022hFnWIAU",
       "salesforceFieldMap": {
          "Attribute__c": "SPA Enabled",
          "Portal_Order_Reporting_Admin__c": "true"
       }
    }
    
Please refer to the Salesforce documentation for the internal field names and valid values to include in the salesforceFieldMap.

####Upstream Services

This API is composed of the following upstream services. 

 - **User** 
   - POST GET /v2/details?userId={userId}
   - POST /v2/details
   - GET /v2/details?userId={userId}
 - **Salesforce** 
   - POST /services/oauth2/token
   - POST /services/data/v20.0/sobjects/Account/
   - POST /services/data/v20.0/sobjects/contact/
 - **Eva** 
   - GET /api/v5/operations/owned
   - POST /api/v1/relationship/grantByEmail
 - **Homestead** 
   - GET /v4/fields
   - POST /v4/fields/batch 
   - GET /v5/farms/owned
   - POST /farms
 
 
 
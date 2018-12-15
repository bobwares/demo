<b><font size="3" color="red">This API is NOT Supported in the PRODUCTION Environment.</font></b><br> 

####Overview

The Talus Dealership Service calls the Salesforce sObjects API to create a new Dealership in Salesforce. A Dealership corresponds to a Salesforce Account Object 
with  account record type set to "Dealer Account". 

The request body supports the following fields: 

<table>
  <tr><td><b>Field</b></td><td><b>Values</b></td><td><b>Required</b></td></tr>
  <tr><td>countryCode</td><td>US, CA, BR, FR, DE, UA, ES, IT, RO</td><td>Yes</td></tr>
  <tr><td>name</td><td>The Dealership Name. If not included the API will generate a random name.</td><td>No</td></tr>
  <tr><td>salesforceFieldMap</td><td>Additional fields can be added by adding name value pairs to the salesforceFieldMap. 
  See example below.</td><td>No</td></tr>
</table>

 
####Example Request

    {
       "countryCode": "US",
       "name": "Ergo",
       "salesforceFieldMap": {
          "Monsanto_Dealer_Account_ID__c": "CHANNEL",
          "Monsanto_Dealer_Group__c": "DEALER",
          "Monsanto_Seed_Brand_Affiliation__c": "GOLD COUNTRY"
       }
    }
    
Please refer to the Salesforce documentation for the internal field names and valid values to include in the salesforceFieldMap.

####Upstream Services
 
This API is composed of the following upstream services. 

 - **Salesforce** 
   - POST /services/oauth2/token
   - POST /services/data/v20.0/sobjects/Account/

 

####Overview

The Talus Create Fields Service will create N number fields (max = 5) for a specific User's account.

The request body contains the following fields:
 
<table>
  <tr><td><b>Field</b></td><td><b>Values</b></td><td><b>Required</b></td></tr>
  <tr><td>numFields</td><td>An integer that specifies the number of fields to create.  The value must be between 1 and 5.</td><td>Yes</td></tr>
  <tr><td>randomized</td><td>If true random fields from the fields template will be used to create 1-5 fields.  If false the first 1-5 fields will be used.</td><td>Yes</td></tr>
  <tr><td>userId</td><td>The id of a user created in the User Service.</td><td>Yes</td></tr>
</table>

####Example Request

    {
      "numFields": 1,
      "randomized": false,
      "userId": "1"
    }
 
####Upstream Services
 
This API is composed of the following upstream services. 

 - **User** 
   - GET /v2/details?userId={userId}
 - **Homestead**  
   - GET /v4/fields
   - POST /v4/fields/batch 
 
 
## Coding Task
You are supposed to program a catalog for leisure activities, on which offers from leisure providers are displayed.
A first version is planned that will enable leisure providers to feed in their various activities via a CMS without having to deal with the complexity of pricing.

You have been hired to write the backend for this first version.

This version will only be about adding leisure activities via a Restful API and making them available for the planned catalog website.

In technical discussions with some leisure providers, they extract the following requirements for the catalog:

* Leisure activities always belong to a leisure provider.
* It is important to them that customers can get to the website of the provider via activities displayed on the website of the catalog.
* Leisure activities themselves always contain a headline, description and various hints.
* Hints are additional information for customers. 
  * E.g. "Entry only with a negative corona test."
  * E.g. "The ticket is only valid for the thermal bath. You can add the sauna supplement on site for €6."
* The activities listed in the catalog are planned according to a weekly pattern. They can start at different times on weekdays.
* Customers can request activities on a specific day via the catalog.

### Requirements:
* Restful API
* Spring Boot backend server
* Docker optional
* DB not required
* Tests not required
* Delivery as Git repository

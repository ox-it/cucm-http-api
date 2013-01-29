cucm-http-api
=============

Objectives
----------

The aim of this project is to provide a simple HTTP API (with a JSON output) to expose some services from CUCM / AXL APIs.

Phone information, updating speeddials are the first steps of this project which will have full documentation.

Requirements
------------

This is a Java project, you do need Maven.

AXL SOAP web services
---------------------

The schema (WSDL) from the "AXL SQL toolkit" downloaded from the CUCM administration console has been put into this repository for convenience (in the folder `cucm_schema`), the consumer classes have been generated using the command `wsimport -keep -b cucm_schema/current/AXLSOAP.xsd -Xnocompile  -s src/main/java -d bin -verbose cucm_schema/current/AXLAPI.wsdl`.

Installation
------------

Run `mvn clean install` at the root of the project.

Running
-------

You can run the application via the "fat" jar provided using supervisor or circus with the following command line:
`java -jar target/cucm-http-api-1.0-SNAPSHOT.jar server src/main/resources/configuration.yml`

Configuration
--------------

You do need to configure the domain of CUCM, its user and password.

cucm-http-api
=============

[Online documentation](https://cucm-http-api.readthedocs.org)

Objectives
----------

The aim of this project is to provide a simple, technical HTTP API (with a JSON output) to expose some services from CUCM / AXL APIs.

Features
--------

* List all phones associated to a directory number, get details on every phone (including speeddials configuration)
* Update speeddials for a phone or for all phones associated with a directory number

Requirements
------------

This Java project requires Maven.

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

You do need to configure the domain of CUCM, its user and password, see the sample configuration at `src/main/resources/configuration.yml.example`.

Examples
--------

`curl -u user:password "http://127.0.0.1:8080/phone?dirn=14015"` (GET) gives information on the phone associated with this directory number (only one phone atm).

`curl -u user:password -H "Accept: application/json" -H "Content-Type: application/json" -X POST --data @data.json "http://127.0.0.1:8080/phone/speeddials?dirn=14015"` (POST) updates the speeddials information (e.g. data.json: `[{"index": "2", "dirn": "13710"},{"index": "9", "dirn": "13710"}]`)

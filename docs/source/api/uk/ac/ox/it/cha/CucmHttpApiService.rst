.. java:import:: com.cisco.axlapiservice AXLAPIService

.. java:import:: com.cisco.axlapiservice AXLPort

.. java:import:: com.yammer.dropwizard Service

.. java:import:: com.yammer.dropwizard.config Environment

.. java:import:: com.yammer.dropwizard.auth.basic BasicAuthProvider

.. java:import:: com.yammer.dropwizard.config Bootstrap

.. java:import:: javax.xml.ws BindingProvider

.. java:import:: uk.ac.ox.it.cha.auth AppAuthenticator

.. java:import:: uk.ac.ox.it.cha.auth User

.. java:import:: uk.ac.ox.it.cha.configuration AppConfiguration

.. java:import:: uk.ac.ox.it.cha.configuration CucmConfiguration

.. java:import:: uk.ac.ox.it.cha.health CucmAxlServiceHealthCheck

.. java:import:: uk.ac.ox.it.cha.resources PhoneResource

.. java:import:: uk.ac.ox.it.cha.resources SpeeddialsResource

.. java:import:: uk.ac.ox.it.cha.services CucmAxlService

CucmHttpApiService
==================

.. java:package:: uk.ac.ox.it.cha
   :noindex:

.. java:type::  class CucmHttpApiService extends Service<AppConfiguration>

   Main entry point of the application

   :author: martinfilliau

Methods
-------
initialize
^^^^^^^^^^

.. java:method:: @Override public void initialize(Bootstrap<AppConfiguration> bootstrap)
   :outertype: CucmHttpApiService

main
^^^^

.. java:method:: public static void main(String args) throws Exception
   :outertype: CucmHttpApiService

run
^^^

.. java:method:: @Override public void run(AppConfiguration configuration, Environment environment) throws Exception
   :outertype: CucmHttpApiService


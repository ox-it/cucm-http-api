.. java:import:: com.fasterxml.jackson.annotation JsonProperty

.. java:import:: com.yammer.dropwizard.config Configuration

.. java:import:: javax.validation Valid

.. java:import:: javax.validation.constraints NotNull

AppConfiguration
================

.. java:package:: uk.ac.ox.it.cha.configuration
   :noindex:

.. java:type:: public class AppConfiguration extends Configuration

   Application configuration

   :author: martinfilliau

Fields
------
apiauth
^^^^^^^

.. java:field:: @Valid @JsonProperty @NotNull  ApiAuth apiauth
   :outertype: AppConfiguration

cucm
^^^^

.. java:field:: @Valid @JsonProperty @NotNull  CucmConfiguration cucm
   :outertype: AppConfiguration

Methods
-------
getApiauth
^^^^^^^^^^

.. java:method:: public ApiAuth getApiauth()
   :outertype: AppConfiguration

getCucm
^^^^^^^

.. java:method:: public CucmConfiguration getCucm()
   :outertype: AppConfiguration


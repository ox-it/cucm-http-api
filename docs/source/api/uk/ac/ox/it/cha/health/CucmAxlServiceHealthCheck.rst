.. java:import:: com.cisco.axl.api._8 GetOSVersionReq

.. java:import:: com.cisco.axl.api._8 GetOSVersionRes

.. java:import:: com.cisco.axlapiservice AXLPort

.. java:import:: com.yammer.metrics.core HealthCheck

CucmAxlServiceHealthCheck
=========================

.. java:package:: uk.ac.ox.it.cha.health
   :noindex:

.. java:type:: public class CucmAxlServiceHealthCheck extends HealthCheck

   :author: martinfilliau

Constructors
------------
CucmAxlServiceHealthCheck
^^^^^^^^^^^^^^^^^^^^^^^^^

.. java:constructor:: public CucmAxlServiceHealthCheck(AXLPort service)
   :outertype: CucmAxlServiceHealthCheck

Methods
-------
check
^^^^^

.. java:method:: @Override protected Result check() throws Exception
   :outertype: CucmAxlServiceHealthCheck


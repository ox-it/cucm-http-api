.. java:import:: com.cisco.axl.api._8 ExecuteSQLQueryReq

.. java:import:: com.cisco.axl.api._8 ExecuteSQLQueryRes

.. java:import:: com.cisco.axl.api._8 GetPhoneReq

.. java:import:: com.cisco.axl.api._8 GetPhoneRes

.. java:import:: com.cisco.axlapiservice AXLPort

.. java:import:: com.yammer.dropwizard.jersey.params IntParam

.. java:import:: com.yammer.dropwizard.auth Auth

.. java:import:: java.util ArrayList

.. java:import:: java.util List

.. java:import:: javax.ws.rs Consumes

.. java:import:: javax.ws.rs GET

.. java:import:: javax.ws.rs Path

.. java:import:: javax.ws.rs Produces

.. java:import:: javax.ws.rs QueryParam

.. java:import:: javax.ws.rs WebApplicationException

.. java:import:: javax.ws.rs.core MediaType

.. java:import:: javax.ws.rs.core Response

.. java:import:: javax.xml.ws.soap SOAPFaultException

.. java:import:: org.w3c.dom Node

.. java:import:: uk.ac.ox.it.cha.auth User

.. java:import:: uk.ac.ox.it.cha.representations Phone

PhoneResource
=============

.. java:package:: uk.ac.ox.it.cha.resources
   :noindex:

.. java:type:: @Path @Produces @Consumes public class PhoneResource

   Phone resource Expose information about phones

   :author: martinfilliau

Constructors
------------
PhoneResource
^^^^^^^^^^^^^

.. java:constructor:: public PhoneResource(AXLPort axlService)
   :outertype: PhoneResource

Methods
-------
get
^^^

.. java:method:: @GET public List<Phone> get(IntParam dirn, User user)
   :outertype: PhoneResource

   Get phone information from a directory number

   :param dirn: directory number
   :param user: authenticated user
   :return: list of phones corresponding to this directory number


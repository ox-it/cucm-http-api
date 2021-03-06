.. java:import:: com.cisco.axl.api._8 StandardResponse

.. java:import:: com.cisco.axl.api._8 UpdatePhoneReq

.. java:import:: com.cisco.axlapiservice AXLPort

.. java:import:: com.yammer.dropwizard.auth Auth

.. java:import:: java.util List

.. java:import:: javax.validation Valid

.. java:import:: javax.ws.rs Consumes

.. java:import:: javax.ws.rs POST

.. java:import:: javax.ws.rs Path

.. java:import:: javax.ws.rs Produces

.. java:import:: javax.ws.rs QueryParam

.. java:import:: javax.ws.rs.core MediaType

.. java:import:: javax.ws.rs.core Response

.. java:import:: uk.ac.ox.it.cha.auth User

.. java:import:: uk.ac.ox.it.cha.representations Speeddial

SpeeddialsResource
==================

.. java:package:: uk.ac.ox.it.cha.resources
   :noindex:

.. java:type:: @Path @Produces @Consumes public class SpeeddialsResource

   Speed dials resource Allow operations on speed dials

   :author: martinfilliau

Constructors
------------
SpeeddialsResource
^^^^^^^^^^^^^^^^^^

.. java:constructor:: public SpeeddialsResource(AXLPort axlService)
   :outertype: SpeeddialsResource

Methods
-------
updateSpeeddials
^^^^^^^^^^^^^^^^

.. java:method:: @POST public Response updateSpeeddials(String phone, List<Speeddial> speeddials, User user)
   :outertype: SpeeddialsResource

   Update the speed dials for the given phone name

   :param phone: name of the phone to update
   :param speeddials: list of Speeddial
   :param user: authenticated user
   :return: response code from the SOAP web service


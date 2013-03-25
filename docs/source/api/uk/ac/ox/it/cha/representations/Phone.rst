.. java:import:: com.cisco.axl.api._8 GetPhoneRes

.. java:import:: com.cisco.axl.api._8 RPhone

.. java:import:: com.cisco.axl.api._8 RPhoneLine

.. java:import:: com.cisco.axl.api._8 RSpeeddial

.. java:import:: com.fasterxml.jackson.annotation JsonProperty

.. java:import:: java.util ArrayList

.. java:import:: java.util List

Phone
=====

.. java:package:: uk.ac.ox.it.cha.representations
   :noindex:

.. java:type:: public class Phone

   :author: martinfilliau

Constructors
------------
Phone
^^^^^

.. java:constructor:: public Phone()
   :outertype: Phone

Phone
^^^^^

.. java:constructor:: public Phone(GetPhoneRes gpr)
   :outertype: Phone

   Build a Phone object from a GetPhoneRes object

   :param gpr: GetPhoneRes object

Methods
-------
equals
^^^^^^

.. java:method:: @Override public boolean equals(Object o)
   :outertype: Phone

getDescription
^^^^^^^^^^^^^^

.. java:method:: public String getDescription()
   :outertype: Phone

getDirns
^^^^^^^^

.. java:method:: public List<String> getDirns()
   :outertype: Phone

getModel
^^^^^^^^

.. java:method:: public String getModel()
   :outertype: Phone

getName
^^^^^^^

.. java:method:: public String getName()
   :outertype: Phone

getProduct
^^^^^^^^^^

.. java:method:: public String getProduct()
   :outertype: Phone

getSpeeddials
^^^^^^^^^^^^^

.. java:method:: public List<Speeddial> getSpeeddials()
   :outertype: Phone

getUuid
^^^^^^^

.. java:method:: public String getUuid()
   :outertype: Phone

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: Phone

setDescription
^^^^^^^^^^^^^^

.. java:method:: public void setDescription(String description)
   :outertype: Phone

setDirns
^^^^^^^^

.. java:method:: public void setDirns(List<String> dirns)
   :outertype: Phone

setModel
^^^^^^^^

.. java:method:: public void setModel(String model)
   :outertype: Phone

setName
^^^^^^^

.. java:method:: public void setName(String name)
   :outertype: Phone

setProduct
^^^^^^^^^^

.. java:method:: public void setProduct(String product)
   :outertype: Phone

setSpeeddials
^^^^^^^^^^^^^

.. java:method:: public void setSpeeddials(List<Speeddial> speeddials)
   :outertype: Phone

setUuid
^^^^^^^

.. java:method:: public void setUuid(String uuid)
   :outertype: Phone

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Phone


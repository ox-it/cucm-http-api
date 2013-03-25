.. java:import:: com.cisco.axl.api._8 RSpeeddial

.. java:import:: com.cisco.axl.api._8 XSpeeddial

.. java:import:: com.fasterxml.jackson.annotation JsonIgnore

.. java:import:: com.fasterxml.jackson.annotation JsonProperty

Speeddial
=========

.. java:package:: uk.ac.ox.it.cha.representations
   :noindex:

.. java:type:: public class Speeddial

   Represents a Speed dial

   :author: martinfilliau

Constructors
------------
Speeddial
^^^^^^^^^

.. java:constructor:: public Speeddial()
   :outertype: Speeddial

Speeddial
^^^^^^^^^

.. java:constructor:: public Speeddial(RSpeeddial sd)
   :outertype: Speeddial

   Construct a Speeddial object from CUCM

   :param sd: RSpeeddial object from CUCM

Methods
-------
equals
^^^^^^

.. java:method:: @Override public boolean equals(Object o)
   :outertype: Speeddial

getDirn
^^^^^^^

.. java:method:: public String getDirn()
   :outertype: Speeddial

getIndex
^^^^^^^^

.. java:method:: public String getIndex()
   :outertype: Speeddial

getLabel
^^^^^^^^

.. java:method:: public String getLabel()
   :outertype: Speeddial

getXSpeeddial
^^^^^^^^^^^^^

.. java:method:: @JsonIgnore public XSpeeddial getXSpeeddial()
   :outertype: Speeddial

   Get an XSpeeddial object (used in queries made to CUCM)

   :return: XSpeeddial object

hashCode
^^^^^^^^

.. java:method:: @Override public int hashCode()
   :outertype: Speeddial

setDirn
^^^^^^^

.. java:method:: public void setDirn(String dirn)
   :outertype: Speeddial

setIndex
^^^^^^^^

.. java:method:: public void setIndex(String index)
   :outertype: Speeddial

setLabel
^^^^^^^^

.. java:method:: public void setLabel(String label)
   :outertype: Speeddial

toString
^^^^^^^^

.. java:method:: @Override public String toString()
   :outertype: Speeddial


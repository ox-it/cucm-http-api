.. java:import:: com.google.common.base Optional

.. java:import:: com.yammer.dropwizard.auth AuthenticationException

.. java:import:: com.yammer.dropwizard.auth Authenticator

.. java:import:: com.yammer.dropwizard.auth.basic BasicCredentials

.. java:import:: java.security MessageDigest

.. java:import:: uk.ac.ox.it.cha.configuration ApiAuth

AppAuthenticator
================

.. java:package:: uk.ac.ox.it.cha.auth
   :noindex:

.. java:type:: public class AppAuthenticator implements Authenticator<BasicCredentials, User>

   :author: martinfilliau

Fields
------
apiAuth
^^^^^^^

.. java:field::  ApiAuth apiAuth
   :outertype: AppAuthenticator

Constructors
------------
AppAuthenticator
^^^^^^^^^^^^^^^^

.. java:constructor:: public AppAuthenticator(ApiAuth apiAuth)
   :outertype: AppAuthenticator

Methods
-------
authenticate
^^^^^^^^^^^^

.. java:method:: @Override public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException
   :outertype: AppAuthenticator


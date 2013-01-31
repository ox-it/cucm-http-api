Configuration
=============

Configuration is done through a YAML file containing various sections.

An example is available at ``src/main/resources/configuration.yml.example``.

Section "cucm"
--------------

This section is about credentials to connect to a CUCM server.

 * ``host`` is the host name
 * ``user`` is the user to log in as
 * ``password`` is the password for the ``user``

Section "apiauth"
-----------------

This section is about credentials to connect to this application using HTTP basic auth.

 * ``user`` is the name of the user that will have to be use when attempting to do a basic auth
 * ``password`` is a SHA-256 hash of the password

The hash of the password can be generated with ``echo -n "password" | shasum -a 256``.

Section "logging" (optional)
----------------------------

Configure the logging of the application (by overriding the default configuration), see `Dropwizard's documentation <http://dropwizard.codahale.com/manual/core/>`_.

Section "http" (optional)
-------------------------

Configure the web server (by overriding the default configuration), see `Dropwizard's documentation <http://dropwizard.codahale.com/manual/core/>`_.

See :doc:`security` for more recommendations on this section.

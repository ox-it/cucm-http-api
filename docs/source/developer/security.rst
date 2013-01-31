Security considerations
=======================

This software has been designed to be used as a technical API (used as a middleware) exposed to a limited audience.

The HTTP API exposes a limited set of values from CUCM, some of them are sensitive, in particular the "phone name" (which is the unique identifier of a device on a network).

All methods should be protected by authentication.

Design
------

This software does not store any data and is completly stateless.

Recommendations
---------------

Although the exposed HTTP API is protected by HTTP Basic Auth, it is recommended to use an appropriate firewall configuration to limit the exposure of data.

If all applications using this software are on the same machine, it should be bind to a local interface (see configuration).

Protecting resources
--------------------

See `Dropwizard auth documentation <http://dropwizard.codahale.com/manual/auth/>`_ for more details, resources should include a parameter annotated ``@Auth`` as shown in the example below.

.. code:: java

  @GET
  public List<Phone> get(@QueryParam("dirn") IntParam dirn, @Auth User user) {
  
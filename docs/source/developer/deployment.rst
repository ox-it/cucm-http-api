Deploying the application
=========================

The application is built as a single JAR using ``mvn install``, this JAR embeds a `Jetty web-server <http://jetty.codehaus.org/jetty/>`_.

The application can run as ``java -jar cucm-http-api.jar server path/to/configuration.yml``.

The process can be runned using `Supervisor <http://supervisord.org/>`_ or `Circus <http://circus.readthedocs.org/>`_ to be properly managed.

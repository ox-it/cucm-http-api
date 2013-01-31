Phone endpoint
===============

Endpoint for operations on phones.

All these calls require basic auth.

.. http:get:: /phone/

    Get phones corresponding to a directory number

    **Example request**:

    .. sourcecode:: http

		GET /phone/?dirn=123 HTTP/1.1
		Host: 127.0.0.1
		Accept: application/json

    **Example response**:

    .. sourcecode:: http

		HTTP/1.1 200 OK
		Content-Type: application/json

        [
          {
            "product": "Cisco 7942",
            "description": "description",
            "model": "Cisco 7942",
            "name": "uniquename",
            "uuid": "{UUID}",
            "dirns": [
              "123"
            ],
            "speeddials": [
              {
                "index": "0",
                "dirn": "11"
              },
              {
                "index": "1",
                "dirn": "22"
              },
            ]
          }
        ]

    :query dirn: directory number to search for
    :type dirn: int

    :statuscode 200: resource found
    :statuscode 404: no resource found

.. http:post:: /phone/speeddials

    Update the speeddials for a phone or a group of phones from a directory number.
    
    Parameters "phone" and "dirn" are mutually exclusive.

    **Example request**:

    .. sourcecode:: http

		POST /phone/speeddials?phone=name HTTP/1.1
		Host: 127.0.0.1
		Accept: application/json
        Content-Type: application/json

    **Example response**:

    .. sourcecode:: http

		HTTP/1.1 200 OK
		Content-Type: plain/text
		{uniqueid}

    :query phone: unique name of the phone to update
    :type phone: string
    :query dirn: filter by a specific type in the hierarchy of types (will search within subtypes too)
    :type dirn: int
    
    :statuscode 200: request done
    :statuscode 400: Bad request (could happen if you use parameters phone and name at the same time)
    :statuscode 500: an exception occured

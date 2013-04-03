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
              	"index": "1",
                "dirn": "11",
                "label": "office"
              },
              {
                "index": "2",
                "dirn": "22",
                "label": "home"
              },
              
            ]
          }
        ]

    :query dirn: directory number to search for
    :type dirn: int

    :statuscode 200: list of phones matching the directory number (empty list if no phone)

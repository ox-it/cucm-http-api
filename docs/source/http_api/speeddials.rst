Speeddials endpoint
===================

Endpoint for operations on speeddials.

All these calls require basic auth.

.. http:post:: /speeddials

    Update the speeddials for a phone by its name.

    **Example request**:

    .. sourcecode:: http

        POST /speeddials?phone=name HTTP/1.1
        Host: 127.0.0.1
        Accept: application/json
        Content-Type: application/json
        [
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

    **Example response**:

    .. sourcecode:: http

		HTTP/1.1 200 OK
		Content-Type: plain/text
		{uniqueid}

    :query phone: unique name of the phone to update
    :type phone: string
    
    :statuscode 200: request done
    :statuscode 400: Bad request (if you don't pass the parameter)
    :statuscode 500: an exception occured

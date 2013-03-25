Overview
========

List of methods used in this application and consequences on CUCM AXL Service.

+------------------------+------------+------------+
| Method                 | Action     | Uses       |
+========================+============+============+
| Get phone info         | Read       | SQL, AXL   |
+------------------------+------------+------------+
| Update speed dials     | Update     | AXL        |
+------------------------+------------+------------+

Get phone info
--------------

Used in :doc:`../http_api/phone`, it does two **read-only** operations:

#. SQL query to find names of phone matching a directory number
#. Get detailed information about every phone, by its phone name (GetPhoneReq)

Update speed dials
------------------

Used in :doc:`../http_api/speeddials`, it does one **update** operation: 

#. Do an **UpdatePhoneReq** for a given phone name

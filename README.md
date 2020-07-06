# springbootapp
A spring boot backend

Send requests to running URL:port(ex: localhost:8080)/

GET:
ex:- 
localhost:8080/roles (get all roles)
localhost:8080/roles/NIC_number (get role by NIC number)
localhost:8080/roles/organization/role_type (get roles by organization and role_type)

POST:
ex:-
localhost:8080/roles (create new role)
Example Body:
{
    "organization": "org3",
    "firstName": "Van",
    "lastName":"Helsing",
    "nicNo":"78657634V",
    "roleType":"ASSISTANT"
}

PUT:
localhost:8080/roles/NIC_number (update existing role)

DELETE:
localhost:8080/roles/NIC_number (delete existing role)

**Created date and Last modified date will be stored


Table creation in database:

CREATE TABLE `role` (
  `organization` varchar(100) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(60) DEFAULT NULL,
  `nic_no` varchar(45) NOT NULL,
  `role_type` enum('DRIVER','ASSISTANT') DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`nic_no`),
  UNIQUE KEY `NIC_no_UNIQUE` (`nic_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

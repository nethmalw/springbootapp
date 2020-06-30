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

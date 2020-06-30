package com.example.demo.Controllers;

import com.example.demo.DTOs.RoleDTO;
import com.example.demo.Models.Role;
import com.example.demo.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    /************************* GET methods for API ****************************************/

    //    Get all roles in the database
    @GetMapping("/roles")
    public @ResponseBody
    List<RoleDTO> getAllRoles() {
        return mapToDTOList(roleService.getAllRoles());
    }

    //  Get roles by NIC number
    @GetMapping("/roles/{id}")
    public @ResponseBody
    RoleDTO getRoleByNIC(@PathVariable String id) {
        return mapToDTO(roleService.findByNIC(id));
    }

    //    Get roles by organization and role_type
    @GetMapping("/roles/{organization}/{role_type}")
    public @ResponseBody
    List<RoleDTO> getRoleByOrganizationAndRoleType(@PathVariable String organization, @PathVariable String role_type) {
        return mapToDTOList(roleService.findByOrganizationAndRoleType(organization, role_type));
    }

    /************************* POST methods for API ****************************************/

    //     Create new role
    @PostMapping("/roles")
    public @ResponseBody
    RoleDTO createRole(@RequestBody Role role) {
        return mapToDTO(roleService.createRole(role));
    }

    /************************* PUT methods for API ****************************************/

    //    Update existing role
    @PutMapping("/roles/{id}")
    public @ResponseBody
    RoleDTO updateRole(@RequestBody Role role, @PathVariable String id) {
        Role toBeUpdated = roleService.findByNIC(id);

        toBeUpdated.setOrganization(role.getOrganization());
        toBeUpdated.setFirstName(role.getFirstName());
        toBeUpdated.setLastName(role.getLastName());
        toBeUpdated.setRoleType(role.getRoleType());

        return mapToDTO(roleService.updateRole(toBeUpdated));
    }

    /************************* DELETE methods for API ****************************************/
    @DeleteMapping("/roles/{id}")
    public @ResponseBody
    void deleteRole(@PathVariable String id) {
        roleService.deleteRole(id);
    }

    /************************* Mapping methods ****************************************/

    //    Mapping a role to a role data transfer object
    public RoleDTO mapToDTO(Role role) {
        RoleDTO output = new RoleDTO();
        output.setFirstName(role.getFirstName());
        output.setLastName(role.getLastName());
        output.setNicNo(role.getNicNo());

        return output;
    }

    //    Mapping a list of roles to a list of data transfer objects
    public List<RoleDTO> mapToDTOList(List<Role> list) {
        List<RoleDTO> output = new ArrayList<>();

        for (Role eachRole : list) {
            RoleDTO person = new RoleDTO();
            person.setFirstName(eachRole.getFirstName());
            person.setLastName(eachRole.getLastName());
            person.setNicNo(eachRole.getNicNo());

            output.add(person);
        }

        return output;
    }

}

package com.example.demo.Services;

import com.example.demo.Models.Role;
import com.example.demo.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles(){
        return (List<Role>) roleRepository.findAll();
    }

    public Role createRole(Role role){
        return roleRepository.save(role);
    }

    public Role updateRole(Role role){
        return roleRepository.save(role);
    }

    public void deleteRole(String id){
        roleRepository.delete(roleRepository.findByNicNo(id));
    }

    public Role findByNIC(String NIC_no){
        return roleRepository.findByNicNo(NIC_no);
    }

    public List<Role> findByOrganizationAndRoleType(String organization, String roleType){
        return roleRepository.findByOrganizationAndRoleType(organization,roleType);
    }
}

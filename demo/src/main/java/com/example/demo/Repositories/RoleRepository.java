package com.example.demo.Repositories;

import com.example.demo.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    //Returns a role by its NIC number
    Role findByNicNo(String NIC_no);

    //Returns a list of roles by their respective organization and role_type
    List<Role> findByOrganizationAndRoleType(String organization, String roleType);
}

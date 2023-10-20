package ru.kata.spring.boot_security.demo.DAO;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository {
    List<Role> findAll();

    Role findRoleById(Long id);

    Set<Role> findSetRoleBySetId(Set<Long> roleId);

}

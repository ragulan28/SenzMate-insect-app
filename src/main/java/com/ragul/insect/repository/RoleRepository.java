package com.ragul.insect.repository;

import com.ragul.insect.model.Role;
import com.ragul.insect.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by rajeevkumarsingh on 02/08/17.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);

    //<T> Optional<T> findByName(RoleName roleUser);
}

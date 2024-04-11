package com.alexanderbiehl.widgethub.respository;

import com.alexanderbiehl.widgethub.model.LocalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = true)
public interface LocalUserRepository extends JpaRepository<LocalUser, Long> {

    LocalUser findByUsername(final String username);
}

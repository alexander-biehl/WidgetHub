package com.alexanderbiehl.widgethub.respository;

import com.alexanderbiehl.widgethub.model.Widget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface WidgetRepository extends JpaRepository<Widget, Long> {

    // List<Widget> findbyName(@Param("name") String name);
}

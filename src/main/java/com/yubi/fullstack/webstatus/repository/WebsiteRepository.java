package com.yubi.fullstack.webstatus.repository;

import com.yubi.fullstack.webstatus.domain.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteRepository extends JpaRepository<Website, Integer> {
}

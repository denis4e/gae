package com.gae.java.repository;

import com.gae.java.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, String> {
}

package com.gae.java.service.impl;

import com.gae.java.dto.CountryDto;
import com.gae.java.mapper.CountryMapper;
import com.gae.java.model.Country;
import com.gae.java.repository.CountryRepository;
import com.gae.java.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public CountryDto getCompanyNameById(String id) {
        Country country = countryRepository.findById(id).orElseThrow(() -> new RuntimeException("country not found."));
        return CountryMapper.INSTANCE.countryToCountryDto(country);
    }
}

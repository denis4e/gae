package com.gae.java.mapper;

import com.gae.java.dto.CountryDto;
import com.gae.java.model.Country;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CountryMapper {
    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDto countryToCountryDto(Country country);
}

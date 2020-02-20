package com.countries.countries;

import io.spring.guides.gs_producing_web_service.Country;
import  org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CountryService {


@Autowired
private CountryRepository  countryRepository;



public Country findByName(String name) {

Country country = countryRepository.findByName(name);

return country ;

}




}
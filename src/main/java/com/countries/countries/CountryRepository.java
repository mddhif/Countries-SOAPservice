package com.countries.countries;


import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.countries.countries.Country;
import com.countries.countries.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.stereotype.Repository;
import  org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;


//@Component
//@Repository
@Transactional
public interface CountryRepository extends CrudRepository<Country, String> {
	
    @Query("select * from Country where Name = :name")
	public Country findByName(@Param("name") String name);
	
}

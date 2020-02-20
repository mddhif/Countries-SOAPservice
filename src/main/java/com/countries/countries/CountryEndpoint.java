package com.countries.countries;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.countries.countries.Country;
import java.util.Optional;
import com.countries.countries.GetCountryRequest;
import com.countries.countries.GetCountryResponse;
import  org.springframework.stereotype.Service;

@Endpoint

public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	
   @Autowired
   private CountryService countryService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
	@ResponsePayload
	public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
		//Country dbCountry = countryRepository.findByName(request.getName());
    //return dbCountry.orElse(null);
	
		GetCountryResponse response = new GetCountryResponse();
	
      Country country =  countryService.findByName(request.getName());

		response.setCountry(country);

		return response;
	}
}

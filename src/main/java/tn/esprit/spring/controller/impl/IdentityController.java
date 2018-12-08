/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.spring.controller.impl;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.interfaces.IClientInfoService;

/**
 * 
 * Cette classe implémente les resources REST qui permettent de gérer l'identité d'un client.
 * http://websystique.com/spring-boot/spring-boot-rest-api-example/
 * 
 * @author Walid YAICH
 *
 */

@RestController
@RequestMapping("/api/identity")
public class IdentityController {
	
	//TODO
	
	
	
	/**
	 * Retourner le client s'il existe dans la base
	 * @param clientId
	 * @return Client client
	 */
    @RequestMapping(value = "/client/{clientId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> getClient(@PathVariable("clientId") Long clientId) {
    	return null; //TODO
    }
    
    
    /**
     * Ajouter un client
     * @param client
     */
	@RequestMapping(value = "/client/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addClient(@RequestBody Client client){
    	return null; //TODO
    }
	
	
	/**
	 * Mettre a jour les informations d'un client.
	 * @param clientId
	 * @param client
	 */
	@RequestMapping(value = "/client/{clientId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> updateClient(@PathVariable("clientId") Long clientId, @RequestBody Client client){
    	return null; //TODO
    }
	
	
	/**
	 * Supprimer un client
	 * @param clientId
	 */
	@RequestMapping(value = "/client/{clientId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteClient(@PathVariable("clientId") Long clientId){
    	return null; //TODO
    }
	
	
	/**
	 * @return le nombre total des clients dans la base
	 * @throws JSONException
	 */
	@RequestMapping(value = "/client/count", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> countClient() throws JSONException{
    	return null; //TODO
    }

	
	
}

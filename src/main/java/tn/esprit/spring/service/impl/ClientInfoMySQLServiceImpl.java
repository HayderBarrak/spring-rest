/*
 * Copyright 2017 by Walid YAICH <walid.yaich@esprit.tn>
 * This is an Open Source Software
 * License: http://www.gnu.org/licenses/gpl.html GPL version 3
 */

package tn.esprit.spring.service.impl;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.entity.Project;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.repository.ProjectRepository;
import tn.esprit.spring.service.interfaces.IClientInfoService;

/**
 * Cette classe permet de gérer les informations client.
 * @author Walid YAICH
 * 
 */
@Component
public class ClientInfoMySQLServiceImpl implements IClientInfoService{
	
	// TODO
	
	
	/**
	 * Ajouter un projet et l'affecter a un client
	 * @param projet
	 * @param clientId
	 */
	@Override
	public void addProjectAndAssignToClient(Project project, Long clientId) {
		//TODO
	}
	
	
	/**
	 * Trouver un projet en ayant son Id
	 */
	@Override
	public Project getProjectById(Long projectId){
		return null; //TODO
	}
	
	
	/**
	 * Supprimer tous les projets
	 */
	@Override
	public void deleteAllProjects() {
		//TODO
	}
	
	
	/**
	 * Récupérer tous les projets
	 */
	@Override
	public List<Project> getAllProjects() {
		return null ; //TODO
	}
	
	
	/**
	 * Récupérer les données client en ayant son Id
	 * @param clientId l'identifiant du client
	 * @return Client client
	 */
	@Override
	public Client getClientById(Long clientId){
		return null; //TODO
	}
	
	
	/**
	 * Ajouter un client dans la base
	 */
	@Override
	public void addClient(Client client) {
		//TODO
	}
	
	
	/**
	 * Mettre a jour les informations client
	 */
	@Override
	public void updateClientInfoById(Client client, Long clientId) {
		//TODO
	}

	
	@Override
	@Transactional
	public void updateProject(Long projectId, Project project){
		//TODO
	}
	
	
	/**
	 * Supprimer un client
	 */
	@Override
	public void deleteClient(Client client) {
		//TODO
	}

	
	/**
	 * Calculer le nombre total des clients
	 */
	@Override
	public Long countClients() {
		return null; //TODO
	}
	
}

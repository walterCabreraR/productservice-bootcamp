package com.everis.productservice.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMaintenanceService<T> {
	
	public Flux<T> findAll();
	public Mono<T> findEntityById(String id);
	public Mono<T> createEntity(T entity) throws Exception;
	public Mono<T> updateEntity(T entity);
	public Mono<Void> deleteEntity(String id);

}

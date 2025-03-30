package me.dio.service;

import me.dio.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}

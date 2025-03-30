package me.dio.service;


import me.dio.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);
}

package me.dio.service.impl;

import lombok.AllArgsConstructor;
import me.dio.entity.ScheduleEntity;
import me.dio.repository.IScheduleRepository;
import me.dio.service.IScheduleService;
import me.dio.service.query.IScheduleQueryService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}

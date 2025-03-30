package me.dio.service.query;

import me.dio.entity.ScheduleEntity;

import java.time.OffsetDateTime;
import java.util.List;

public interface IScheduleQueryService {

    ScheduleEntity findById(final Long id);

    List<ScheduleEntity> findInMonth(final OffsetDateTime startAt, final OffsetDateTime endAt);

    void verifyIfScheduleExists(final OffsetDateTime startAt, final OffsetDateTime endAt);
}

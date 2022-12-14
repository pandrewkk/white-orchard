package com.pandrewkk.whiteorchard.repository;

import com.pandrewkk.whiteorchard.model.Location;
import com.pandrewkk.whiteorchard.model.WeatherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.List;

public interface WeatherRecordRepository extends JpaRepository<WeatherRecord, Long> {

    List<WeatherRecord> findAllByLocationOrderByDateTimeDesc(Location location);

    List<WeatherRecord> getAllByDateTimeBetween(ZonedDateTime from, ZonedDateTime to);

    List<WeatherRecord> getAllByLocationAndDateTimeBetween(Location location, ZonedDateTime from, ZonedDateTime to);
}

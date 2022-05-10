package eu.epfc.holiday.repositories;

import eu.epfc.holiday.entities.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}

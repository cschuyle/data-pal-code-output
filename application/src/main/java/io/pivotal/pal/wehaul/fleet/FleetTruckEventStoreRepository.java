package io.pivotal.pal.wehaul.fleet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FleetTruckEventStoreRepository extends JpaRepository<FleetTruckEventStoreEntity, FleetTruckEventStoreEntityKey> {

    List<FleetTruckEventStoreEntity> findAllByKeyVinOrderByKeyVersion(String vin);

}
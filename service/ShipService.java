package com.space.service;


import com.space.model.Ship;
import java.util.List;

public interface ShipService {
    List<Ship> getShips(ShipVO shipVO);
    Ship getShip(Long id);
    Ship createShip(Ship ship);
    Ship updateShip(Long id, Ship requestShip);
    Long shipCount(ShipVO shipVO);
    void deleteShip(Long id);
}
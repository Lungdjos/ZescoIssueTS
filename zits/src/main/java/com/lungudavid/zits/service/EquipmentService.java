package com.lungudavid.zits.service;

import com.lungudavid.zits.model.Equipment;

import java.util.List;

public interface EquipmentService {
    List<Equipment> getAllEquipment();
    void addEquipment(Equipment equipment);
}

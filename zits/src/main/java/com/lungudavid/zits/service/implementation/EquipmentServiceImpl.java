package com.lungudavid.zits.service.implementation;

import com.lungudavid.zits.model.Equipment;
import com.lungudavid.zits.repository.EquipmentRepository;
import com.lungudavid.zits.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    //creating the role repository instance
    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> getAllEquipment() {
        return equipmentRepository.findAll();
    }

    @Override
    public void addEquipment(Equipment equipment) {
        this.equipmentRepository.save(equipment);
    }
}

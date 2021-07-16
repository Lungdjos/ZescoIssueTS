package com.lungudavid.zits.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "equipment", schema = "issuetrackingsystemdb")
public class Equipment {
    //instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equip_id")
    private long equipId;

    @Column(name = "equip_name", length = 40, nullable = false)
    private String equipName;

    @Column(name = "equip_desc", nullable = false, length = 255)
    private String equipDescription;

    public String getEquipName() {
        return equipName;
    }

    public void setEquipName(final String equipName) {
        this.equipName = equipName;
    }

    public String getEquipDescription() {
        return equipDescription;
    }

    public void setEquipDescription(final String equipDescription) {
        this.equipDescription = equipDescription;
    }
}

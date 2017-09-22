package com.example;


import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import ar.com.sistac.model.tank.Address;
import ar.com.sistac.model.tank.Layout;

@Entity(tableName = "tanks")
public class TankTable {
    @PrimaryKey
    private Long id;

    private String cit;
    private String tankId;
    @Embedded
    private Address address;
    @Embedded
    private Layout layout;

}

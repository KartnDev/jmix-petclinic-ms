package io.jmix.ownerservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.restds.annotation.RestDataStoreEntity;

import java.util.UUID;

@Store(name = "petservice")
@RestDataStoreEntity(remoteName = "Pet")
@JmixEntity
public class PetProjection {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    @InstanceName
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
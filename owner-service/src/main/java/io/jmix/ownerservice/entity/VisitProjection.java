package io.jmix.ownerservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import io.jmix.restds.annotation.RestDataStoreEntity;

import java.util.UUID;

@RestDataStoreEntity(remoteName = "Visit")
@JmixEntity
@Store(name = "veterinarianservice")
public class VisitProjection {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    @SystemLevel
    private UUID petId;

    @DependsOnProperties({"petId"})
    private PetProjection pet;

    public PetProjection getPet() {
        return pet;
    }

    public void setPet(PetProjection pet) {
        this.pet = pet;
    }

    public UUID getPetId() {
        return petId;
    }

    public void setPetId(UUID petId) {
        this.petId = petId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
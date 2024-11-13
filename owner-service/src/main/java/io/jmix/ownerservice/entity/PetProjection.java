package io.jmix.ownerservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.entity.annotation.SystemLevel;
import io.jmix.core.metamodel.annotation.*;
import io.jmix.restds.annotation.RestDataStoreEntity;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@RestDataStoreEntity(remoteName = "Pet")
@Store(name = "petservice")
@JmixEntity
public class PetProjection {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    @InstanceName
    @JmixProperty(mandatory = true)
    @NotNull
    private String name;

    private Integer age;

    private String legal;

    @SystemLevel
    private UUID ownerId;

    @DependsOnProperties({"ownerId"})
    private Owner owner;

    private String petType;

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public UUID getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(UUID ownerId) {
        this.ownerId = ownerId;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

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
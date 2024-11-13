package io.jmix.ownerservice.entity;

import io.jmix.core.metamodel.datatype.EnumClass;
import org.springframework.lang.Nullable;


public enum PetType implements EnumClass<String> {

    DOG("DOG"),
    CAT("CAT"),
    BIRD("BIRD"),
    MICE("MICE"),
    OTHER("OTHER");

    private final String id;

    PetType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static PetType fromId(String id) {
        for (PetType at : PetType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
package io.jmix.ownerservice.view.petprojection;

import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.core.SaveContext;
import io.jmix.flowui.view.*;
import io.jmix.ownerservice.entity.PetProjection;
import io.jmix.ownerservice.view.main.MainView;

import java.util.Set;

@Route(value = "petProjections/:id", layout = MainView.class)
@ViewController(id = "PetProjection.detail")
@ViewDescriptor(path = "pet-projection-detail-view.xml")
@EditedEntityContainer("petProjectionDc")
public class PetProjectionDetailView extends StandardDetailView<PetProjection> {

    @Install(to = "petProjectionDl", target = Target.DATA_LOADER)
    private PetProjection customerDlLoadDelegate(final LoadContext<PetProjection> loadContext) {
        Object id = loadContext.getId();
        // Here you can load the entity by id from an external storage.
        // Set the loaded entity to the not-new state using EntityStates.setNew(entity, false).
        return null;
    }

    @Install(target = Target.DATA_CONTEXT)
    private Set<Object> saveDelegate(final SaveContext saveContext) {
        PetProjection entity = getEditedEntity();
        // Here you can save the entity to an external storage and return the saved instance.
        // Set the returned entity to the not-new state using EntityStates.setNew(entity, false).
        // If the new entity ID is assigned by the storage, set the ID to the original instance too 
        // to let the framework match the saved instance with the original one.
        PetProjection saved = entity;
        return Set.of(saved);
    }
}

package io.jmix.ownerservice.view.petprojection;

import com.vaadin.flow.router.Route;
import io.jmix.core.DataManager;
import io.jmix.core.LoadContext;
import io.jmix.flowui.view.*;
import io.jmix.ownerservice.entity.PetProjection;
import io.jmix.ownerservice.view.main.MainView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

@Route(value = "petProjections", layout = MainView.class)
@ViewController(id = "PetProjection.list")
@ViewDescriptor(path = "pet-projection-list-view.xml")
@LookupComponent("petProjectionsDataGrid")
@DialogMode(width = "50em")
public class PetProjectionListView extends StandardListView<PetProjection> {

    @Autowired
    private DataManager dataManager;

    @Install(to = "petProjectionsDl", target = Target.DATA_LOADER)
    protected List<PetProjection> petProjectionsDlLoadDelegate(LoadContext<PetProjection> loadContext) {
        // Here you can load entities from an external storage.
        // Set the loaded entities to the not-new state using EntityStates.setNew(entity, false).
        return dataManager.load(PetProjection.class).all().list();
    }

    @Install(to = "petProjectionsDataGrid.remove", subject = "delegate")
    private void petProjectionsDataGridRemoveDelegate(final Collection<PetProjection> collection) {
        for (PetProjection entity : collection) {
            // Here you can remove entities from an external storage
        }
    }
}

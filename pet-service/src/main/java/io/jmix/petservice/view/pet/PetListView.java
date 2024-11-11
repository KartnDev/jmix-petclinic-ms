package io.jmix.petservice.view.pet;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.petservice.entity.Pet;
import io.jmix.petservice.view.main.MainView;


@Route(value = "pets", layout = MainView.class)
@ViewController(id = "Pet.list")
@ViewDescriptor(path = "pet-list-view.xml")
@LookupComponent("petsDataGrid")
@DialogMode(width = "64em")
public class PetListView extends StandardListView<Pet> {
}
package io.jmix.ownerservice.view.owner;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.ownerservice.entity.Owner;
import io.jmix.ownerservice.view.main.MainView;


@Route(value = "owners", layout = MainView.class)
@ViewController(id = "Owner.list")
@ViewDescriptor(path = "owner-list-view.xml")
@LookupComponent("ownersDataGrid")
@DialogMode(width = "64em")
public class OwnerListView extends StandardListView<Owner> {
}
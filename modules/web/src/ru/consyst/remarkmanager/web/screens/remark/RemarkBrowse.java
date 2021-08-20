package ru.consyst.remarkmanager.web.screens.remark;

import com.haulmont.cuba.gui.screen.*;
import ru.consyst.remarkmanager.entity.Remark;

@UiController("remarkmanager_Remark.browse")
@UiDescriptor("remark-browse.xml")
@LookupComponent("remarksTable")
@LoadDataBeforeShow
public class RemarkBrowse extends StandardLookup<Remark> {
}
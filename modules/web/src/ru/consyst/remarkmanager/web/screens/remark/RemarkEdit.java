package ru.consyst.remarkmanager.web.screens.remark;

import com.haulmont.cuba.gui.screen.*;
import ru.consyst.remarkmanager.entity.Remark;


@UiController("remarkmanager_Remark.edit")
@UiDescriptor("remark-edit.xml")
@EditedEntityContainer("remarkDc")
@LoadDataBeforeShow
public class RemarkEdit extends StandardEditor<Remark> {
}
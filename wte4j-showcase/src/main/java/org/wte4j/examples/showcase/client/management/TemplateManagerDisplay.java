/**
 * Copyright (C) 2015 adesso Schweiz AG (www.adesso.ch)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wte4j.examples.showcase.client.management;

import org.wte4j.ui.client.templates.TemplateListDisplay;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.IsWidget;

public interface TemplateManagerDisplay extends IsWidget {

	void showAddTemplateDialog();

	void hideAddTemplateDialog();

	void setDialogContent(IsWidget content, String title);

	TemplateListDisplay getTemplateListDisplay();

	void addCreateTemplateFromFile(ClickHandler clickHandler);

	void addAddTemplateClickHandler(ClickHandler clickHandler);

}

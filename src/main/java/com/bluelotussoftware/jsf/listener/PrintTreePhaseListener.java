/*
 * Copyright 2015 John Yeary <jyeary@bluelotussoftware.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bluelotussoftware.jsf.listener;

import com.sun.faces.util.DebugUtil;
import javax.faces.component.UIViewRoot;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0
 */
public class PrintTreePhaseListener implements PhaseListener {

    private static final long serialVersionUID = 9028706314214211950L;

    @Override
    public void afterPhase(PhaseEvent event) {
        UIViewRoot root = event.getFacesContext().getViewRoot();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ BEGIN TREE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        DebugUtil.printTree(root, System.out);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ END TREE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Override
    public void beforePhase(PhaseEvent event) {
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RENDER_RESPONSE;
    }

}

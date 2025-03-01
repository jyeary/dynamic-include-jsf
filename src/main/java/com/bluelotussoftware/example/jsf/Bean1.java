/*
 * Copyright 2015-2025 John Yeary <jyeary@bluelotussoftware.com>.
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
package com.bluelotussoftware.example.jsf;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0.1
 */
@ManagedBean
@ViewScoped
public class Bean1 implements Serializable {

    private static final long serialVersionUID = -4223720584792897665L;
    private String message = "Greetings from Bean #1";

    public Bean1() {
        System.out.println("Bean1 Constructor called.");
    }

    @PostConstruct
    private void init() {
        FacesContext.getCurrentInstance().getExternalContext().log("@PostConstruct called on Bean1");
    }

    @PreDestroy
    private void destroy() {
        FacesContext.getCurrentInstance().getExternalContext().log("@PreDestroy called on Bean1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

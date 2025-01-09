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
public class Bean2 implements Serializable {

    private static final long serialVersionUID = -4762622250172846015L;

    private String message = "Greetings from Bean #2";

    public Bean2() {
        System.out.println("Bean2 Constructor called.");
    }

    @PostConstruct
    private void init() {
        FacesContext.getCurrentInstance().getExternalContext().log("@PostConstruct called on Bean2");
    }

    @PreDestroy
    private void destroy() {
        FacesContext.getCurrentInstance().getExternalContext().log("@PreDestroy called on Bean2");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}

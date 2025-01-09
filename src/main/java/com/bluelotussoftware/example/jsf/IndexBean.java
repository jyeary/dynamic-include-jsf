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
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author John Yeary <jyeary@bluelotussoftware.com>
 * @version 1.0.1
 */
@ManagedBean
@ViewScoped
public class IndexBean implements Serializable {

    private static final long serialVersionUID = 2147738567621043394L;
    private String include = "";

    public IndexBean() {
        // This empty component is used as a placeholder for the dynamic page.
//        include = "empty";
    }

    public String getInclude() {
        if (!include.isEmpty()) {
            return "/resources/templates/" + include + ".xhtml";
        }
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

}

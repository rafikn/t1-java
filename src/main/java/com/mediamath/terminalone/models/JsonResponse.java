/*******************************************************************************
 * Copyright 2016 MediaMath
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.mediamath.terminalone.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JsonResponse<T> {


    @SerializedName("data")
    private T data;

    @SerializedName("errors")
    private ArrayList<T1Error> errors;

    @SerializedName("meta")
    private T1Meta meta;

    @SerializedName("entity_type")
    private String entity_type;

    public JsonResponse() {
        //default.
    }

    public JsonResponse(T datavalue) {
        this.data = datavalue;
    }

    public ArrayList<T1Error> getErrors() {
        return errors;
    }

    public void setErrors(ArrayList<T1Error> errors) {
        this.errors = errors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T1Meta getMeta() {
        return meta;
    }

    public void setMeta(T1Meta meta) {
        this.meta = meta;
    }

    public String getEntityType() {
        return entity_type;
    }

    public void setEntityType(String entity_type) {
        this.entity_type = entity_type;
    }

}

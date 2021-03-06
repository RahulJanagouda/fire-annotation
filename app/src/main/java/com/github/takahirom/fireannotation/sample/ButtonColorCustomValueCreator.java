/*
 * Copyright (C) 2017 takahirom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.takahirom.fireannotation.sample;

import com.github.takahirom.fireannotation.CustomValueCreator;

import java.util.HashMap;
import java.util.Map;

class ButtonColorCustomValueCreator extends CustomValueCreator<MainActivity> {
    @Override
    public Map<String, String> getValue(final MainActivity annotatedObject) {
        final HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("button_color", annotatedObject.getButtonColor().replace("#", ""));
        return hashMap;
    }
}

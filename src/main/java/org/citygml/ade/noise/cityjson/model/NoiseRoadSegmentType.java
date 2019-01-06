/*
 * noise-ade-citygml4j - Noise ADE module for citygml4j
 * https://github.com/citygml4j/module-noise-ade
 *
 * noise-ade-citygml4j is part of the citygml4j project
 *
 * Copyright 2013-2019 Claus Nagel <claus.nagel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.citygml.ade.noise.cityjson.model;

import org.citygml4j.binding.cityjson.feature.AbstractCityObjectType;
import org.citygml4j.binding.cityjson.feature.Attributes;
import org.citygml4j.binding.cityjson.geometry.GeometryTypeName;

public class NoiseRoadSegmentType extends AbstractCityObjectType {

    @Override
    public Attributes newAttributes() {
        return super.newAttributes(new NoiseRoadSegmentAttributes());
    }

    @Override
    public NoiseRoadSegmentAttributes getAttributes() {
        return (NoiseRoadSegmentAttributes) super.getAttributes();
    }

    @Override
    public boolean isValidGeometryType(GeometryTypeName type) {
        return type == GeometryTypeName.MULTI_LINE_STRING;
    }
}

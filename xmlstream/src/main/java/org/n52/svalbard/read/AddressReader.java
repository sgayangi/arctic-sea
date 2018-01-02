/*
 * Copyright 2016-2018 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.svalbard.read;

import javax.xml.namespace.QName;

import org.n52.shetland.aqd.AqdConstants;
import org.n52.shetland.inspire.ad.AddressRepresentation;

public class AddressReader extends NillableSubtagReader<AddressRepresentation> {

    @Override
    protected QName getSubtagName() {
        return AqdConstants.QN_AD_ADDRESS_REPRESENTATION;
    }

    @Override
    public XmlReader<AddressRepresentation> getSubtagDelegate() {
        return new AddressRepresentationReader();
    }

}
